package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",        // Path Content
        glue = "stepDefinitions",                   // Path Source
        tags = "@E2E_Test",                       // Annotation
        plugin = {"pretty",
                "html:test-outputs/cucumber-reports/Report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
