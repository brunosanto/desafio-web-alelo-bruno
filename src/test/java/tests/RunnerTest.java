package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "",
        features = "classpath:features", glue={"steps"},
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        monochrome = true
)

public class RunnerTest {

}