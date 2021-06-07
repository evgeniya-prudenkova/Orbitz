package com.orbitz.pages;

import com.orbitz.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends CommonMethods {

    @FindBy(xpath = "//span[text()='Flights']")
    public WebElement btnFlights;

    @FindBy(xpath = "//span[text()='Roundtrip']")
    public WebElement btnRoundTrip;

    @FindBy(xpath = "//button[@aria-label='Leaving from']")
    public WebElement btnLeavingFrom;

    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement btnGoingTo;

    @FindBy(xpath = "(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]")
    public WebElement calendarMonth;

    @FindBy(xpath = "(//*[@class='uitk-date-picker-month'])[1]/table/tbody/tr/td/button")
    public List<WebElement> calendarDates;

    @FindBy(xpath = "//button[@data-stid='date-picker-paging'][2]")
    public WebElement btnNextMonth;

    @FindBy(xpath = "//button[@data-stid='apply-date-picker']")
    public WebElement btnDone;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement btnSearch;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
