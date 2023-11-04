Feature: Verify create account and share wishlist to other

Scenario Outline: verify cerate account and share wishlist
Given go to url
When click on Account button
Then click on CREATE AN ACCOUNT button
Then Enter userFristname "<userFirstName>",userLastname "<userLastname>",userEmailId "<userEmailId>",password "<userPassword>",confirm password "<userConfirmpassword>"
##Then Enter userLastname "<userLastname>"
##Then Enter userEmailId "<userEmailId>"
##Then Enter password "<userPassword>"
##Then Enter confirm password "<userConfirmpassword>"
Then click on REGISTOR button
Then verify the RSGISTATION SUCCESSFUL MESSAGE.
Then click on TV menu
Then Add LG LCD TV to WISHLIST
Then Verify the SUCCESSFUL MESSAGE FOR TV ADDED TO WISHLIST.
Then Click on SHARE WISHLIST button
Then Enter email Id and message and click on SHARE WISHLIST BUTTON
Then verify the SUCCESSFUL MESSAGE FOR SHARE WISHLIST.


Examples:
|userFirstName|userLastname|userEmailId|userPassword|userConfirmpassword|
#|rama-12|Leo|Ra_18@gmail.com|ra@1234|ra@1234|
#|Rag-12|Broke|Broke_19@gmail.com|@34556|@34556|
#|wi-004|Mag|wi~5@gmail.com|5678@gm|5678@gm|
|098watt|rwattb|werttt@gmail.com|Gopal@1234|Gopal@1234|
