Feature: Verify that you will be able to save previously placed order as a pdf file


Scenario: verify your previous order save as pdf
Given go to url
When click on Account button
Then Login in application using previously created emailID.
Then click on MY ORDER link
Then Verify the order Id and status is pending
Then click on VIEW ORDER link
Then click on Print Order
Then verify the product file save as pdf
