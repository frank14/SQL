import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features",
        glue = "com.mesaj.app.stepdefinitions",
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "pretty", "json:target/cucumber-reports/Cucumber,json"},
        tags = "@Test"
)
public class CucumberTest {
}

