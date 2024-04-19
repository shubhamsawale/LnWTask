package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/FeatureFile/AddingToCart.feature",
        glue = "StepDefinations",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}
