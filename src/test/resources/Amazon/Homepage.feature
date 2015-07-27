@tag1
Feature: Amazon Home page

Scenario: As a user I should be able to see 'Search' option on home page
  Given I am on home page
  Then I see 'Shop by Department' link on left corner of page
  And  if I select that  link navigates to other page.
