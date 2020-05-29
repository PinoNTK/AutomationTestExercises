package firstCucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report"},
        features = "src/test/resources/firstCucumber/"
)
public class RunCucumberTest {
}
