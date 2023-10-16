Feature: Verify user is able to purchase product using registered emailId.


Scenario: Verify user successfully placed order.
Given go to url
When click on Account button 
Then Login in application using previously created emailID.
Then click on My WishList links
Then click on Add to crat 
Then click on PROCEED TO CHECKOUT
Then Select Shipping Information
Then click on ESTIMATE
Then verify shipping cost generated 
Then select Shipping Cost and click UPDATE TOTAL
Then verify the shipping cost is added to total
Then click PROCEED TO CHECKOUT
Then Enter Billing Information
Then In Shipping method ,click continue
Then In payment information select check money order radio button 
Then click on PLACED ORDER button
Then verify order is generated.Note the Order Number.
