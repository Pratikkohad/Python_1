Feature: Check Login Functionality

  Scenario Outline: : Checking With Correct Username and Password
    Given User is on Login Page
    When User enters <username> and <password>
    Then Navigate to Home page

    Examples:
      | username | password |
      | Admin    | admin123 |
      #| Pratik   | Kohad    |
      #| Admin    |          |
      #|          |          |
      #|          | admin123 |

    Scenarios:Admin Tab Functionality
    Given User is on Admin Tab
    Then Check all The check boxes
