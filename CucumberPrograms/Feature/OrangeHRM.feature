Feature: Login and logout functionality

Scenario: Verify login functionality
	Given the browser is launched and navigated to the url
	When we enter the username and password
	And click on login button
	Then Welcome Admin msg should be displayed