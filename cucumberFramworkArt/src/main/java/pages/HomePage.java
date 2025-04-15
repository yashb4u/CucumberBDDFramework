package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.PageContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	
	PageContext context;
	public HomePage(PageContext context)
	{
		this.context = context;
	}
	
	@And("click on Add to Cart button for first book")
	public void clickOnAddToCartButtonForFirstBook() {                                                  
		context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(), 'Add to Cart')])[1]"))).click();
	}
	
	@And("click on cart link")
	public void clickOnCartLink() {
		context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(), 'shopping_cart')])[1]"))).click();
	}
	@When("click on clear cart button")
	public void clickOnClearCartButton() {
		context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(), ' Clear cart ')])[1]"))).click();
	}
	@Then("cart should be empty")
	public void cartShouldBeEmpty() {
		String cartItems = context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='mat-badge-content-0']"))).getText();
		 Assert.assertEquals(cartItems, 0);
	}
}
