package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
			features = {"src/test/java/story/test1.feature"},
			dryRun = false,
			snippets = SnippetType.CAMELCASE,
			glue = {"pages","hooks"},
//			plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			plugin = {"pretty","html:CucumberReport.html",
						       "json:reports/result.json",
						       "junit:reports/result.xml"}
		)
public class Runner extends AbstractTestNGCucumberTests {

}
