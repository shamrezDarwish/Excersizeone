package steps;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features"},
        tags = "@test"
        //plugin = {"pretty", "target/cucumber"}
)
public class RunTest {
}

