package hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHook {
	
	private PageContext context;
	
	public MyHook(PageContext context) 
	{
		this.context = context;
	}
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		System.out.println("I am in before scenario.");
		RemoteWebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		context.setDriver(driver);
		context.setWait(wait);
		
		context.getDriver().get("https://bookcart.azurewebsites.net/");
		Options manage = context.getDriver().manage();
		manage.timeouts().implicitlyWait(Duration.ofSeconds(10));
		manage.window().maximize();
	}
	
	@After
	public void afterScenario(Scenario scenario)
	{
		boolean failed = scenario.isFailed();
		System.out.println("Is Failed ="+failed);
		if(failed)
		{
			byte[] screenshotAs= context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png",null);
		}
		
		if(!failed)
		{
			byte[] screenshotAs= context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png",null);
		}
		
		context.getDriver().quit();
	}

}
