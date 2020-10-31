package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

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

}