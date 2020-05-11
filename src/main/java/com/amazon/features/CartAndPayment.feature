Feature: Adding Product to cart and payment methods

Background:

Given Open the browser and enter the url of the website
When Click on Accounts and Lists 
Then User should navigate to SignIn Page 
When User Set valid Emailid and click on continue  
And  Set valid password and checks for remember me
When User click on login 
Then User should navigate to Homepage



# Scenario-1
Scenario: Shooping Cart Page should be opened

Given User on homepage and user click on Open Menu 
When Click on Beauty,Health,Grocery 
And User click on Tea,coffee and beverages 
When User click on Tea and click on green tea
And click on lipton green tea product
When User click on Add to cart 
Then User should navigate to Amazon shopping cart
When User click on cart the product gets add to shopping cart
 


#Scenario-2
Scenario: User should get the payment method page

When User click on Cart Icon 
Then User should navigate to the shopping cart page
When User click on Proceed to buy 
Then User should navigates to delivery address page
When User click on deliver to this address 
Then User navigates to shipping delivery page
When User click on continue 
Then User should naviagte to payment method page

