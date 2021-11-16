Feature: Login Functionality of Grow

  Scenario Outline: Grow Credentials
    Given User is on Grow Page
    When User click on Register Button
    Then User Enters Email_Id <ID>
    And Click on Continue button
    Then User enters Password <Pass>
    And Click on Submit button
    Then User enters Pin <G_Pin>

    Examples: 
      | ID                   | Pass       | G_Pin |
      | Kohad.1995@gmail.com | Anshu@1234 |  1432 |
