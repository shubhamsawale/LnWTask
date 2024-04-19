Feature: Adding a Monitor Item in Cart and verifying subtotal

  Scenario: Adding a Monitor Item in Cart and verifying subtotal
    Given I am on the Amazon homepage
    When I search for "Monitor"
    And I select the first item from the search results
    And I add the item to the cart
    And I open the cart
    Then I verify that the price is identical to the product page
    And I verify that the subtotal is identical to the product page