package com.amazon.pages;

import com.framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    By searchTexControl = By.cssSelector("#twotabsearchtextbox");
    By searchTexButton = By.cssSelector("#nav-search-submit-text");
    By searchResultItems = By.cssSelector(".s-result-item");
    By bestSellerItems = By.xpath("//span[contains(@id, 'best-seller-label')]");
    String xPathItemsFilteredByBadgeName = "//div[contains(@class, 's-result-item')]//span[contains(., 'badgeName') " +
            "and contains(@class, 'a-badge-text')]/ancestor::div[contains(@class, 's-result-item')]";

    public void openDashboard(){
        loadPage("https://www.amazon.com/");
    }

    public void enterValuesToSearch(String text){
        sendValues(searchTexControl,text);
    }

    public void searchItems(){
        clickOnElement(searchTexButton);
    }

    public int getListOfItems(){
        return getListOfElementsBy(searchResultItems).size();
    }

    public int getListOfProductsWithBadge(String badge){
        String locator = xPathItemsFilteredByBadgeName.replace("badgeName", badge);
        return getListOfElementsBy(By.xpath(locator)).size();
    }

    public void listFilteredItems(String badge, String item) {
        String locator = xPathItemsFilteredByBadgeName.replace("badgeName", badge);
        List<WebElement> webElementList = getListOfElementsBy(By.xpath(locator));
        AtomicInteger i = new AtomicInteger(1);
        if (webElementList.size() > 0)
            webElementList.forEach((final WebElement e) -> {
                takeWebElementScreenShot(e, item+"_"+badge.concat(String.valueOf(i.get())));
                i.getAndIncrement();
            });
        else
            log.error("Items not Found for "+item+ " with badge "+badge+" in the first page");
    }
}