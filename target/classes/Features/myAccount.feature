@FunctionalTest
Feature: Promosyonlarım
 Scenario: Background:
   Given User launch application
   When User click login button
   Then User enter username as "kadir611992"
   And User enter password "4c1m4s1z"
   And  User click login

   @smoke
  Scenario: Go to Promosyonlarim
    When User click hesabim button
    And User click promosyonlarim button
    And User write random number and check the number
    Then User filled security code correctly.
    And User click the Close button and check that the My Account page is returned again.
    And go to homepage
  @smoke
  Scenario: My Personal Informations
    When Member number is obtained from the home page.
    And Go to My Account page
    And Click on the My Personal Information button.
    Then it is checked that the member number is displayed correctly.
