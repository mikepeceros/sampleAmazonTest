package com.amazon;

import com.amazon.pages.DashboardPage;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

@CucumberOptions(plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "json:target/cucumber-json/cucumber.json",
        "html:target/home-page-html"},
        features = {"src/test/resources/features/amazon/"},
        tags = { "@SearchProduct" },
        glue = { "com.amazon.steps"})

public class TestRun extends AbstractTestNGCucumberTests {
    static private RemoteWebDriver webDriver;
    protected static DashboardPage dashboardPage;

    public void initPages(RemoteWebDriver webDriver) {
        dashboardPage = new DashboardPage(webDriver);
    }

    @BeforeMethod
    @Parameters({ "browser" })
    public void startBrowser(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                startChrome();
                break;
            case "firefox":
                startFirefox();
                break;
            default:
                break;
        }
    }

    @AfterMethod
    public void quitDriver(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public RemoteWebDriver startChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        try{
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            initPages(webDriver);
        }catch (Exception e){
            //TODO
        }
        return webDriver;
    }

    public RemoteWebDriver startFirefox(){
        try{
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            initPages(webDriver);
        }catch (Exception e){
            //TODO
        }
        return webDriver;
    }
}