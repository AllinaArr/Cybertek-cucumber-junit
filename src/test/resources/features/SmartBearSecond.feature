Feature: SmartBear order process
  As a user, I should be able to login to account and make an Order

  @scenarioOutlineSB
  Scenario Outline: Order process

    Given login page of the web site
    When the user able to login and on Order page
    When User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer name>" to customer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to zip
    And User selects "<card type>" as card type
    And User enters "<card number>" to card number
    And User enters "<exp date>" to expiration date
    And User clicks process button
    Then User verifies "<customer name>" is in the list

    Examples:
      | product     | quantity | customer name   | street      | city         | state | zip   | card type        | card number  | exp date |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago      | IL    | 60004 | Visa             | 313313323323 | 12/22    |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago      | IL    | 60656 | Visa             | 313313323323 | 11/22    |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago      | IL    | 60656 | Visa             | 313313323323 | 10/22    |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago      | IL    | 60452 | MasterCard       | 313313323323 | 09/22    |
      | ScreenSaver | 9        | Dr DrakeRamoray | Dale st     | Arl Hgths    | IL    | 60452 | American Express | 313313323323 | 10/22    |
      | FamilyAlbum | 10       | Monica Geller   | Euclid ave  | Arl Hgths    | IL    | 60312 | Visa             | 313313323323 | 10/22    |
      | MyMoney     | 3        | Ross Geller     | River rd    | Arl Hgths    | IL    | 60312 | MasterCard       | 313313323323 | 10/22    |
      | MyMoney     | 1        | Phoebe Buffay   | Magarity rd | Falls Church | VA    | 60452 | American Express | 313313323323 | 10/22    |
