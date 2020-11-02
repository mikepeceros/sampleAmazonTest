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
  "name": "The Web page list products with the badge \"Best Seller\" for \"\u003cProduct\u003e\"",
  "keyword": "Then "
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
        "Laptop"
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
  "name": "The Web page list products with the badge \"Best Seller\" for \"Headphones\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.the_Web_page_list_products_with_badge(String,String)"
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
  "name": "The user inputs the product \"Laptop\"",
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
  "name": "The Web page list products with the badge \"Best Seller\" for \"Laptop\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.the_Web_page_list_products_with_badge(String,String)"
});
formatter.result({
  "status": "passed"
});
});