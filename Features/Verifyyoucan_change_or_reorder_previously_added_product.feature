Feature: Verify you can change or reorder your previous product


Scenario Outline: Reorder or change your previous order
Given go to url
When click on Account button
Then Login in application using previously created emailID.
Then click on MY ORDER link
Then click on REORDER link
Then change the quantity of product and click on update 
|quantity|
|10|
##Then verify the shipping cost is added to total
Then click PROCEED TO CHECKOUT
Then click on Billing Information continue button
Then In Shipping method ,click continue
Then In payment information select check money order radio button 
Then click on PLACED ORDER button
Then verify order is generated.Note the Order Number.


##Examples:
##|Quantity|
##|10|
