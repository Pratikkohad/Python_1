Feature: Deal Data Creation

  Scenario: Free CRM Create New Deal
    Given User is already on login page
    When title of Login page is Free CRM
    Then User enters username and password
      | username | password |
      | naveenk  | test@123 |
    Then click on login Button
    Then User is on Home page
    When user mouse to new deal page
    Then user enters deal details
      | title      | amount | probability | commission |
      | test deal  |  10001 |          50 |         10 |
      | test deal1 |  20001 |          90 |         90 |
      | test deal2 |  30001 |          20 |         20 |
      | test deal3 |  40001 |          30 |         30 |
      | test deal4 |  50001 |          40 |         40 |
    Then Close the Browser
