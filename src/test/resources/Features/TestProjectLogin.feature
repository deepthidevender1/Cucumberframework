#Author: Deepthipdevender1@gmail.com
Feature: Login with valid user creadentials and also enter details and save

  Scenario: feature to login to my website
    Given browser is open
    And user is on Login page
    When user enters login details
      | deepthip | 12345 |
    And clicks on Login button
    Then user is navigated to contact input page
    And user enters user details
      | India | abc | test@abc.com | 9864532257 |
    And Clicks on Save button
    Then Saved text is displayed
    And check more outcomes
