@loginTest
Feature: Login

  @smoke
  Scenario: Successful Login with Valid Credentials
    Given User launch application
    When User click login button
    Then User enter username as "kadir611992"
    And User enter password "4c1m4s1z"
    And User click asklogin
    And  User click login
    Then User click balance button
    Then User click logout button

  @smoke
  Scenario: Unsuccessful Login with wrong password and wrong Id
    Given User launched application
    When User click to login button
    Then User enter invalid username as "kadir123"
    And User enter invalid password "nesine345"
    And  User click a login button
    Then User saw error message