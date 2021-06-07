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
        tags = {"@firefox"},
        plugin = {"pretty",
                "html:target/FirefoxCucumber-default-reports",
                "rerun:target/FirefoxFailedTests.txt",
                "json:target/FirefoxReport.json"
        }
)
public class TestRunnerFirefox {
}
