Feature: Automation Practice End To End TestAutomation Scenario

this feature file includes login search the product ,adding to cart,adding payment method and place the order.
@testcase1
Scenario: Verify user validate the automation practice home page
Given user hit the Automationpractice website
When user click on signbutton in header location of the button
And user enter email id 'sder@gmail.com' in the login page
And user enter password 'sugumar' in the login page
And user click on the login button in the login page
And user select the womens 
And user search the tshirt
And user select size
And user select colour
And  user go to product
And user select the product
And user select addtocart
And user select proceedtocheck
And user select proceedtocheck1
And user select proceedtocheck2
And user select agree
And user select proceedtocheck3
And user seleck bankpayment
And user select confirm order 
When user select the signout
