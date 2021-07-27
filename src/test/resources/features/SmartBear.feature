Feature: SmartBear order process
  As a user, I should be able to login to account and make an Order

  @smartBear
  Scenario: Make an order
    Given login page of the web site
    When the user able to login and on Order page
    And the user able to fill out the form
    Then the user verifies in the list