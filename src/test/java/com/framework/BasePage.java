package com.framework;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class BasePage {

    protected WebDriver driver;
    private final String amazonScreenshotsFolder = "./target/screenshots/";
    protected Logger log = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By locator){
        driver.findElement(locator).click();
    }

    public void sendValues(By locator, String text){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void loadPage(String url){
        driver.navigate().to(url);
    }

    public WebElement getElementBy(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> getListOfElementsBy(By locator){
        return driver.findElements(locator);
    }

    public void moveOnPage(WebElement webElement){
        Actions action = new Actions(driver);
        action.moveToElement(webElement).click();
    }

    public void takeWebElementScreenShot(WebElement webElement, String fileName) {
        try{
            moveOnPage(webElement);
            File file = webElement.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(amazonScreenshotsFolder+fileName+".png"));
        }catch (IOException ioException){
            ioException.getCause();
        }
    }
}