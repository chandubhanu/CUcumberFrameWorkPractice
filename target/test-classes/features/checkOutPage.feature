Feature: Place the Order for Products
@PlaceOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given Verify user is on Greenkart LandingPage
When  User search with short name <Name> and extract actual name of product
And Add "3" times of the selected product to the cart
Then  User proceeds to checkout and validate the <Name> items in checkoutpage
And verify user has ability to enter promocode and place the order


Examples:
| Name |
| POT  |




