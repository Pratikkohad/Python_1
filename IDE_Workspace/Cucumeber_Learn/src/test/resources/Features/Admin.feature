Feature: Testing Admin Functionality

  Scenario: Admin Tab Functionality
  	When User is on Login Page
    Then User enters Admin and admin123
    Then Navigate to Home page
    And User is on Admin Tab
    Then Check all The check boxes
