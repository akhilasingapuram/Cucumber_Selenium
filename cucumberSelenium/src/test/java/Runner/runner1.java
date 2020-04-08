package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "step_definitions", plugin = {"json:target/json-cucumber-reports/cukejson.json",
        "junit:target/junit-cucumber-reports/cukejunit.xml"}, features = "src/test/java/Features")
public class runner1 {
}
