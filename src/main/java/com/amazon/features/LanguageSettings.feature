Feature: Change Language Settings

Background:

Given Open browser and enter the Url of the website
When User click on language icon 
Then User should navigate to Language Settings Page
And click on radio button


# Scenario-1
Scenario: HomePage converts into selected language

When User click on Savechanges 
Then User should navigate to Home page

#Scenario-2
Scenario: HomePage does not converts into selected language

Then User click on Cancel 
Then User should navigate to HomePage
	