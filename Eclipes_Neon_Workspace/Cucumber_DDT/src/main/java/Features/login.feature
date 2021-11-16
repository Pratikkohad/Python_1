Feature: Free CRM Login Feature

  #  Without Example Keywords
  #  Scenario: CRM Login Test Scenario
  #    Given User is already on login page
  #    When title of Login page is Free CRM
  #    Then User enters username and password
  #    Then click on login Button
  #    Then User is on Home page
  
  
  
  #    Scenario: User is able to create new Contact
  #      Given User is on Home page
  #      When user mouse over the contact link
  #      Then  user click on contact link
  #      Then user enters Firstname and Lastname
  #      Then click on save button
  #      Then Verify new Contact crated
  
  
  
  Scenario Outline: CRM Login Test Scenario
    Given User is already on login page
    When title of Login page is Free CRM
    Then User enters <username> and <password>
    Then click on login Button
    Then User is on Home page

    Examples: 
      | username | password |
#      | naveenk  | test@123 |
     |tom       |test456   |

