Feature: Test Add to Cart functionality for "https://bookcart.azurewebsites.net/"

Scenario: Add to cart and clear cart
  Given Click on login
	And Enter usename as "ortoni"
	And Enter password as "Pass1234"
	When Click on Login button
	Then Login should be success
	And click on Add to Cart button for first book
	And click on cart link
	When click on clear cart button
	Then cart should be empty