Feature: Free CRM Create Contacts Feature

  Scenario Outline: Free CRM Create New Contacts
    Given User is already on login page
    When title of Login page is Free CRM
    Then User enters <username> and <password>
    Then click on login Button
    Then User is on Home page
    When user mouse to new contact page
    Then user enters <Firstname> and <Lastname> and <position>
    Then Close the Browser
    Examples: 
      | username | password | Firstname  | Lastname  | position |
      | naveenk  | test@123 | Pratik     | Kohad     | PK       |
#      | naveenk  | test@123 | Pratik1223 | Kohad1234 | PK1      |
