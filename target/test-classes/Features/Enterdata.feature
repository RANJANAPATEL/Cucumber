Feature: Enter the name and comment then validate submission form
  @Test
  Scenario: Enter the name and comment in easyselenium form scenario
    Given I navigate to link
    Then verify name and comment fields are available
    When I enter data in name and comment fields
    And I click on submit button
    Then verify form submitted message is displayed on screen
