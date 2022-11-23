package stepDefintions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumberHtmlReport.html"},
		//pretty:target/cucumber-json-report.json
		features = "classpath:features",
		glue = {"info.seleniumcucumber.stepdefinitions"}
)

public class RunCukeTest {
}
