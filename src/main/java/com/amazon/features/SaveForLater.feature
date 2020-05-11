Feature: Product moved to save for later

Background:

Given Open browser and enter the url of the website
When User click on Accounts and Lists 
Then User should navigate to Sign In Page 
When User enter valid Emailid and click on continue  
And  Enter valid password and checks for remember me
When User click on login button
Then User should navigate to Home Page

Scenario:
When User click on cart icon
Then User should navigate to Shopping cart page
When User Click on save for later 
Then Product should move to save for later
When mouseHover and click on signout
Then User should navigate to Sign In page

	