package com.orbitz.testbase;

import com.orbitz.utils.CommonMethods;
import com.orbitz.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected static WebDriver driver;

    public static void openBrowser(String browser) {

        CommonMethods.readProperties(Constants.CONFIGURATION_FILEPATH);

        //switch (CommonMethods.getPropertyValue("browser").toLowerCase()) {
        switch (browser) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser");
        }

        driver.get(CommonMethods.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);

        PageInitializer.initializePageObjects();
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
