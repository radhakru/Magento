Feature: Verify cart page 


Scenario: verify that you can not add more product in cart than product avaliable in Store
Given go to url
When click on the Mobile menu page
Then click on sony xperia mobile
Then Add to card
Then Verify product should be added in card page
Then Update the product quantity to 1000
Then verify the error message
Then click on Empty card link in the footer of the all mobiles
Then verify card is empty  
