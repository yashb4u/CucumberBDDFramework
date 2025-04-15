Feature: test Login functionality for "https://bookcart.azurewebsites.net/"

Background: 
     And Click on login

Scenario: Login success test
	
	And Enter usename as "ortoni"
	And Enter password as "Pass1234"
	When Click on Login button
	Then Login should be success
	
Scenario: Login shoulde be fail
	
	And Enter usename as "ortoni"
	And Enter password as "Pass12345"
	When Click on Login button
	But Login should be failed
	
	
	