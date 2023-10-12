Feature: Verify cost of the product in list page and deatils page 


Scenario: cost of product are equal in both page.
Given go to url
When click on the Mobile menu page
Then In the list of all mobile,read the cost of the sony xperia mobile.
Then click on sony xperia mobile
Then read the cost of sony xperia form details page.
Then compare value in both page.