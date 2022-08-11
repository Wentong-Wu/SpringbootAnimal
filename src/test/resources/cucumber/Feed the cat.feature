Feature: Does Tom, the cat, have 100 health?
  I want to know if Tom the cat has 100 health.

  Scenario: Tom has 100 health
    Given Tom's health is 100
    When I ask if Tom has 100 health
    Then I should be told "Yes"

  Scenario: Tom does not have 100 health
    Given Tom's health is not 100
    When I ask if Tom has 100 health
    Then I should be told "No"
