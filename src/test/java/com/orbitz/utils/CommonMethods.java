package com.orbitz.utils;

import com.orbitz.testbase.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class CommonMethods extends PageInitializer {

    static Properties prop;

    /**
     * This method reads any given property file
     *
     * @param filePath
     * @return Properties
     */
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    /**
     * This method will return single value based on the specified key
     *
     * @param key
     * @return String
     */
    public static String getPropertyValue(String key) {
        return prop.getProperty(key);
    }

    /**
     * This method will return an object of Explicit Wait with time set to 20 sec
     *
     * @return WebDriverWait
     */
    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
        return wait;
    }

    /**
     * This method will wait until the given element becomes invisible
     *
     * @param element
     */
    public static void waitForInvisible(WebElement element) {
        waitForVisible(element);
        getWait().until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * This method will wait until the given element becomes clickable
     *
     * @param element
     * @return WebElement
     */
    public static WebElement waitForClickable(WebElement element) {
        return getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * This method will wait until the given element becomes visible
     *
     * @param element
     * @return WebElement
     */
    public static WebElement waitForVisible(WebElement element) {
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method will wait until the given element becomes clickable and then click
     *
     * @param element
     */
    public static void click(WebElement element) {
        waitForClickable(element).click();
    }

    /**
     * This method will wait for given time
     *
     * @param milliseconds
     */
    public static void waitForMilliseconds(int milliseconds) {
        try {
            System.out.println("Wait for " + milliseconds + " milliseconds");
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will create a reference for the JavascriptExecutor interface and assign it to the WebDriver instance by type casting it
     *
     * @return
     */
    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    /**
     * This method will wait until the given element becomes visible and then click using JavascriptExecutor interface
     *
     * @param element
     */
    public static void jsExecutorClick(WebElement element) {
        waitForVisible(element);
        getJSExecutor().executeScript("arguments[0].click()", element);
    }

    /**
     * This method will select dropdown value by visible text using JavascriptExecutor interface
     *
     * @param element
     * @param visibleText
     */
    public static void jsExecutorSelectDDValueByVisibleText(WebElement element, String visibleText) {
        waitForVisible(element);
        getJSExecutor().executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }", element, visibleText);
    }

    /**
     * This method will clear a text field and send text to it
     *
     * @param element
     * @param textToSend
     */
    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    /**
     * This method will wait until the given element becomes visible and then get text
     *
     * @param element
     * @return String
     */
    public static String getText(WebElement element) {
        waitForVisible(element);
        return element.getText();
    }

    /**
     * This method will
     *
     * @param element
     */
    public static void pressEnter(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }

    public static void selectCheckBox(WebElement element, boolean flag) {
        if (flag) {
            if (element.isSelected()) {
                System.out.println("Already selected");
            } else {
                element.click();
                System.out.println("Checkbox clicked");
            }
        } else {
            if (!element.isSelected()) {
                System.out.println("Already unselected");
            } else {
                element.click();
                System.out.println("Checkbox clicked");
            }
        }
    }

    /**
     * @param id
     * @return
     */
    public WebElement getWebElementById(String id) {
//        return waitForVisible(driver.findElement(By.id(id)));
        return driver.findElement(By.id(id));
    }

    /**
     * @param dd
     * @param visibleText
     */
    public static void selectDDValue(WebElement dd, String visibleText) {
        try {
            Select select = new Select(dd);
            List<WebElement> options = select.getOptions();
            System.out.println("---> I am in Select");
            for (WebElement option : options) {
                System.out.println("---> Price dd: " + option.getText());
                if (option.getText().equalsIgnoreCase(visibleText)) {
                    System.out.println("---> I am in If Price dd: " + option.getText());
                    if (flightsSearchPage.searchResultPageTitle.size() != 0) {
                        select.selectByVisibleText(visibleText);
//                        jsExecutorSelectDDValueByVisibleText(dd, visibleText);
                    } else {
                        jsExecutorSelectDDValueByVisibleText(dd, visibleText);
                    }
                    break;
                }
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param dd
     * @param value
     */
    public static void selectDDValueByValue(WebElement dd, String value) {
        try {
            Select select = new Select(dd);
            List<WebElement> options = select.getOptions();
            System.out.println("---> I am in Select");
            for (WebElement option : options) {
                System.out.println("---> Price dd: " + option.getAttribute("value"));
                if (option.getAttribute("value").equalsIgnoreCase(value)) {
                    System.out.println("---> I am in if statement Price dd: " + option.getAttribute("value"));
                    select.selectByValue(value);
                    break;
                }
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param dd
     * @param index
     */
    public static void selectDDValue(WebElement dd, int index) {
        try {
            Select select = new Select(dd);
            List<WebElement> options = select.getOptions();
            int ddSize = options.size();
            if (ddSize > index) {
                select.selectByIndex(index);
            } else {
                System.out.println("Max Index is: " + (ddSize - 1));
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will switch to child window
     */
    public static void switchToChildWindow() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String childWindow : allWindows) {
            if (!childWindow.equals(mainWindow)) {
                driver.switchTo().window(childWindow);
                break;
            }
        }
    }

    /**
     * This method will take screenshot
     *
     * @param fileName
     * @return
     */
    public static byte[] takeScreenshot(String fileName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
        File file = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp(" yyyy-MM-dd-HH-mm-ss") + ".png";
        try {
            FileUtils.copyFile(file, new File(destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * @param pattern
     * @return
     */
    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * @param numberOfWeek
     * @param pattern
     * @return
     */
    public static String getNextNumberOfWeekDate(int numberOfWeek, String pattern) {
        LocalDate today = LocalDate.now();
        String nextNumberOfWeekDate = today.plus(numberOfWeek, ChronoUnit.WEEKS).format(DateTimeFormatter.ofPattern(pattern));
        return nextNumberOfWeekDate;
    }

    /**
     * @param calendarMonth
     * @param calendarDates
     * @param numberOfWeek
     * @param patternMonth
     * @param patternDate
     */
    public static void selectDateFromCalendar(WebElement calendarMonth, List<WebElement> calendarDates, int numberOfWeek, String patternMonth, String patternDate) {
        waitForVisible(calendarMonth);
        String calendarMonthText = calendarMonth.getText();
        System.out.println("---> calendarMonthText: " + calendarMonthText);

        while (!calendarMonthText.equals(getNextNumberOfWeekDate(numberOfWeek, patternMonth))) {
            click(homePage.btnNextMonth);
            waitForVisible(calendarMonth);
            calendarMonthText = calendarMonth.getText();
        }
        for (WebElement date : calendarDates) {
            if (date.getAttribute("aria-label").contains(getNextNumberOfWeekDate(numberOfWeek, patternDate))) {
                date.click();
                break;
            }
        }
    }
}

