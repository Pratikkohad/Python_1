Feature: Login to Free CRM Application
  Scenario: Validate Free CRM Home Page test
    Given user open browser
    Then user is on login page
    Then user logs into app
    Then validate home page tittle
    Then validate logged in username