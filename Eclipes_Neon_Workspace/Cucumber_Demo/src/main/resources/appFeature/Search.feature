Feature: Amazon Search

  Scenario: Search Product on amazon
    Given I have search  field  on amazon
    When I have search for product with name "Apple MackBook Pro" with prise 1000
    Then Product with name "Apple MackBook Pro " Should display
