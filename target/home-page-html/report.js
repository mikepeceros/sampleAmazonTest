$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazon/SearchProducts.feature");
formatter.feature({
  "name": "Search products in amazon dashboard",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SearchProduct"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Code - Get List of Best Sellers for specific products",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user goes to the dashboard",
  "keyword": "Given "
});
formatter.step({
  "name": "The user inputs the product \"\u003cProduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user clicks the search icon",
  "keyword": "And "
});
formatter.step({
  "name": "The Web page lists products in according to the filter",
  "keyword": "Then "
});
formatter.step({
  "name": "The Web page also list Best Sellers within the products",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Product"
      ]
    },
    {
      "cells": [
        "Headphones"
      ]
    },
    {
      "cells": [
        "Monitor"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Code - Get List of Best Sellers for specific products",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SearchProduct"
    }
  ]
});
formatter.step({
  "name": "The user goes to the dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardSteps.the_user_goes_to_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user inputs the product \"Headphones\"",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardSteps.the_user_inputs_the_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the search icon",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.the_user_clicks_the_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Web page lists products in according to the filter",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.the_Web_page_lists_products_in_according_to_the_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Web page also list Best Sellers within the products",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.the_Web_page_also_list_Best_Sellers_within_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Code - Get List of Best Sellers for specific products",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SearchProduct"
    }
  ]
});
formatter.step({
  "name": "The user goes to the dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardSteps.the_user_goes_to_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user inputs the product \"Monitor\"",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardSteps.the_user_inputs_the_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the search icon",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.the_user_clicks_the_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Web page lists products in according to the filter",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.the_Web_page_lists_products_in_according_to_the_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Web page also list Best Sellers within the products",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.the_Web_page_also_list_Best_Sellers_within_the_products()"
});
formatter.result({
  "status": "passed"
});
});