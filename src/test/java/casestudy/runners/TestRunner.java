package casestudy.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/cucumber-reports" },
        glue = "casestudy/step_def",
        features = "src/test/resources/features",
        tags = "@done",
        dryRun = false
)

public class TestRunner {
}
