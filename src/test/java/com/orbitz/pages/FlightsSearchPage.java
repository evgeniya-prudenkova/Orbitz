package com.orbitz.pages;

import com.orbitz.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightsSearchPage extends CommonMethods {

    @FindBy(xpath = "//title[text()='SFO to JFK flights']")
    public List<WebElement> searchResultPageTitle;

    @FindBy(xpath = "//title[text()='SFO to JFK Flights | Orbitz']")
    public List<WebElement> searchResultPageTitle2;

    @FindBy(xpath = "//button[@data-stid='typeahead-originInput-0-menu-trigger']")
    public WebElement btnFlyingFrom;

    @FindBy(xpath = "//button[@data-stid='typeahead-destinationInput-0-menu-trigger']")
    public WebElement btnFlyingTo;

    @FindBy(id = "departure-airport-1")
    public WebElement btnFlyingFrom2;

    @FindBy(id = "arrival-airport-1")
    public WebElement btnFlyingTo2;

    @FindBy(xpath = "//div[@data-test-id='arrival-departure']")
    public List<WebElement> listOfArrivalAndDepartureResults;

    @FindBy(xpath = "//*[@data-test-id='flight-info']/span[@class='visuallyhidden']")
    public List<WebElement> listOfArrivalAndDepartureResults2;

    @FindBy(xpath = "//button[@data-test-id='show-more-button']")
    public WebElement btnShowMore;

    @FindBy(xpath = "//*[@class='uitk-heading-5']")
    public WebElement headerSearchingForFlights;

    @FindBy(id = "stops-0")
    public WebElement checkBoxNonstop;

    @FindBy(xpath = "//select[@data-test-id='sortDropdown']")
    public WebElement ddSortBy;

    @FindBy(xpath = "(//button[@data-test-id='select-link'])[1]")
    public WebElement firstFlightFromTheList;

    @FindBy(xpath = "(//*[@data-test-id='select-button'])[1]")
    public WebElement btnSelectForFirstFlightFromTheList;

    @FindBy(xpath = "//button[@data-test-id='select-button']")
    public WebElement btnContinue;

    @FindBy(xpath = "(//*[@data-test-id='select-button-1'])[1]")
    public WebElement btnSelectThisFareForFirstFlightFromTheList;

    @FindBy(id = "forcedChoiceNoThanks")
    public List<WebElement> btnNoThanks;

    @FindBy(xpath = "//*[@class='uitk-price-lockup uitk-flex-item left-align']/section/span[2]")
    public WebElement priceTripTotal;

    public FlightsSearchPage() {
        PageFactory.initElements(driver, this);
    }
}
