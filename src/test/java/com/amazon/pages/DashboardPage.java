package com.amazon.pages;

import com.framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    By searchTexControl = By.cssSelector("#twotabsearchtextbox");
    By searchTexButton = By.cssSelector("#nav-search-submit-text");

    public void openDashboard(){
        loadPage("https://www.amazon.com/");
    }

    public void enterValuesToSearch(String text){
        sendValues(searchTexControl,text);
    }

    public void searchProducts(){
        clickOnElement(searchTexButton);
    }
}