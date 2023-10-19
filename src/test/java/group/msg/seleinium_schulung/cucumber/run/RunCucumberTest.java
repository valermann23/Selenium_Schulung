package group.msg.seleinium_schulung.cucumber.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        tags = "@elbphilharmonie",
        glue = "group.msg.seleinium_schulung.cucumber.cucumberStepdefs",
        plugin = { "pretty", "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json" })

public class RunCucumberTest extends AbstractTestNGCucumberTests {

}