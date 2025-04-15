package stepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
//	private PageContext context;
//	
//	public Login(PageContext context)
//	{
//		this.context = context;
//	}
//	
//	@Given("Click on login")
//	public void clickOnLogin() {
//	    context.getDriver().findElement(By.xpath("//span[text()=' Login ']")).click();   
//	}
//	
//	@Given("Enter usename as {string}")
//	public void enterUsenameAs(String string) {
//		 context.getDriver().findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(string);   
//	}
//	
//	@Given("Enter password as {string}")
//	public void enterPasswordAs(String string) {
//		 context.getDriver().findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(string);   
//	}
//	
//	@When("Click on Login button")
//	public void clickOnLoginButton() {                                                  
//		context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']"))).click();
////		 context.getDriver().findElement(By.xpath("//span[text()=' Login ']")).click();   
//	}
//	
//	@Then("Login should be success")
//	public void loginShouldBeSuccess() {
//		context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[text()='account_circle']")));	    
//	}

}
