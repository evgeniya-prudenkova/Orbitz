package com.orbitz.steps;

import com.orbitz.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

    @Before("@chrome")
    public void startTestChrome() {
        openBrowser("chrome");
    }

    @Before("@firefox")
    public void startTestFirefox() {
        openBrowser("firefox");
    }

    @After
    public void endTest(Scenario scenario) {
        byte[] screenshot;
        if (scenario.isFailed()) {
            screenshot = CommonMethods.takeScreenshot("failed/" + scenario.getName());
        } else {
            screenshot = CommonMethods.takeScreenshot("passed/" + scenario.getName());
        }
        scenario.attach(screenshot, "image/png", scenario.getName());

        closeBrowser();
    }
}
