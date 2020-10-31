package com.amazon.steps;

import com.amazon.TestRun;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardSteps extends TestRun {

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
        dashboardPage.searchProducts();
    }

    @Then("The Web page lists products in according to the filter")
    public void the_Web_page_lists_products_in_according_to_the_filter() {

    }

    @Then("The Web page also list Best Sellers within the products")
    public void the_Web_page_also_list_Best_Sellers_within_the_products() {

    }
}