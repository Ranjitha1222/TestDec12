package cucumberTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/Feature/LoginTest.feature"
			,glue={"StepDefinition"},
			tags={"@billing"}
			)

	public class TestRunner {

	}

