package com.orbitz.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/orbitz/steps",
        dryRun = false,
        strict = true,
        monochrome = false,
        tags = {"@chrome"},
        plugin = {"pretty",
                "html:target/ChromeCucumber-default-reports",
                "rerun:target/ChromeFailedTests.txt",
                "json:target//ChromeReport.json"
        }
)
public class TestRunnerChrome {
}
