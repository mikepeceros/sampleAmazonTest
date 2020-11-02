package com.amazon.steps;

import com.amazon.AppTestRun;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DashboardSteps extends AppTestRun {

    @Given("The user goes to the dashboard")
    public void the_user_goes_to_the_dashboard() {
        dashboardPage.openDashboard();
    }

    @When("The user inputs the product {string}")
    public void the_user_inputs_the_product(String string) {
        dashboardPage.enterValuesToSearch(string);
    }

    @When("The user clicks the search icon")
    public void the_user_clicks_the_search_icon() {
        dashboardPage.searchItems();
    }

    @Then("The Web page lists products in according to the filter")
    public void the_Web_page_lists_products_in_according_to_the_filter() {
        Assert.assertTrue(dashboardPage.getListOfItems()>0);

    }

    @Then("The Web page list products with the badge {string} for {string}")
    public void the_Web_page_list_products_with_badge(String badge, String item) {
        Assert.assertTrue(dashboardPage.getListOfProductsWithBadge(badge)>0);
        dashboardPage.listFilteredItems(badge, item);
    }
}