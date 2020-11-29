
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(strict = true, glue = " ", features = {"src/features" }, tags = "@tag1")

public class TestRunnerSuite_Test {

}