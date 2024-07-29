Feature: Search and Place the Order for Products
@SearchOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given Verify user is on Greenkart LandingPage
When  User search with short name <Name> and extract actual name of product
Then  User search for the <Name> shortname name in offers page 
And validate product name in offers page matching with landing page

Examples:
| Name |
| TOM  |
| pot |



