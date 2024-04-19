Feature: Adding a Laptop Item in Cart and verifying sub total

  Scenario: Adding a “Laptop” Item in Cart and verifying sub total
    Given Open Amazon.com
    When In the Search field type “Laptop”
    And Press “Enter”
    And Select the 2nd item in the List
    And Add the item to cart by clicking on "Add to Cart”
    And Open “Cart” from the top-left
    Then Verify that the price is identical to the product page
    And Verify that the sub total is identical to the product page
