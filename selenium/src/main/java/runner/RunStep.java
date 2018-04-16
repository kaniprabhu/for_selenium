package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="//src/main/java/features/scenarioOutline.feature", glue="steps")
//src/main/java/features/scenarioOutline.feature
public class RunStep {

}
