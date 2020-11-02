@SearchProduct

  Feature: Search products in amazon dashboard

    Scenario Outline: Code - Get List of Best Sellers for specific products
    Given The user goes to the dashboard
      When The user inputs the product "<Product>"
      And The user clicks the search icon
      Then The Web page lists products in according to the filter
      And The Web page also list Best Sellers within the products
      Examples:
        | Product     |
        | Headphones  |
        | Monitor     |