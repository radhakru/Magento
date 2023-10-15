Feature: verify the Account Creation and Wishlist verify

Scenario Outline: verify the Acoount creation and wishlist verify
Given go to url
When click on Account
Then click on CREATE AN ACCOUNT BUTTON
Then Enter userFirstName "<userFirstName>",userlastName "<userLastName>",userEmailid "<userEmailId>",userPassword "<userPassword>",userConfirmPassword "<userConfirmpassword>"
Then click on registor button
Then verify the Successful resistation message
Then click on Tv menu
Then Add LG LCD to wishlist
Then click on share wishlist
Then Enter share emailid and message
Then verify the successful message for share wishlist


Examples:
|userFirstName|userLastName|userEmailId|userPassword|userConfirmpassword|
|rwab-3|leo|le3@gmail.com|76654444|76654444|
|witc-3|Deo|mk3@gmail.com|12345677|12345677|


 
