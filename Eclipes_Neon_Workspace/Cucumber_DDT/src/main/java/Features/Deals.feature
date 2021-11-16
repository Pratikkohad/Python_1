Feature: Deal Data Creation

  Scenario: Free CRM Create New Deal
    Given User is already on login page
    When title of Login page is Free CRM
    Then User enters username and password
      | naveenk | test@123 |
    Then click on login Button
    Then User is on Home page
    When user mouse to new deal page
    Then user enters deal details
      | test deal | 10001 | 50 | 10 |
    Then Close the Browser
