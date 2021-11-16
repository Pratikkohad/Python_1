Feature: Uber Booking Feature

  @Smoke
  Scenario: Cab Booking sedan
    Given User Wants to select car type "sedan" from uber
    When User select car "sedan" and pickup point "Bangalore" and drop location "Pune"
    Then Driver start the Journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Regression
  Scenario: Cab Booking SUV
    Given User Wants to select car type "SUV" from uber
    When User select car "SUV" and pickup point "Pune" and drop location "Delhi"
    Then Driver start the Journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Prod
  Scenario: Cab Booking Mini
    Given User Wants to select car type "Mini" from uber
    When User select car "Mini" and pickup point "Delhi" and drop location "Bangalor"
    Then Driver start the Journey
    And Driver ends the journey
    Then User pays 1000 USD
