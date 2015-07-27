Feature: Product categories List
  As a user I want to see the catergories links to products
so that I can go to different category links
@fill
Scenario: User can see links for a Headline of Product
  Given User is on Homepage
  When user selects "<Shop by Department>"
  Then he should see 'Amazon Instant Video' header
And he should see different links below

  |Amazon Instant Video|
  | Amazon Instant Video|
  |Shop Instant Video  |
  |Your Watchlist      |
  |Your Video Library  |
  |Watch Anywhere      |






