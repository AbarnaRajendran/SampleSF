package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

 @RunWith(Cucumber.class)
 @CucumberOptions(features="src/test/resources/Features",glue="StepDefinitions", monochrome= true,
 plugin= {"pretty","json:target/MyReports/reports.json"},
 publish=true)
 
public class TestRunner {
}
