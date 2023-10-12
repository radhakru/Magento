Feature: verify mobile item

Scenario: Verify item in mobile list page can be sorted by name
Given go to url
When verify title of the main page
Then click on the Mobile menu
Then verify title of the mobile page
Then in the list of all mobile . select SORT BY dropdown as name
Then verify all products are sorted by name.
