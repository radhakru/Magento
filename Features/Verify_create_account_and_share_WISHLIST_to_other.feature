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
##|rama-12|Leo|Ra_12@gmail.com|12345678|12345678|
##|Rag-12|Broke|Broke_12@gmail.com|1223455|1223455|
|wi-003|Mag|wi-005@gmail.com|12345678|12345678|

