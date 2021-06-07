package com.orbitz.pages;

import com.orbitz.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightInformationPage extends CommonMethods {

    @FindBy(xpath = "//*[@class='uitk-text uitk-type-500 uitk-type-bold uitk-text-emphasis-theme']")
    public WebElement priceTripTotal;

    @FindBy(xpath = "(//*[@data-test-id='flight-operated'])[1]")
    public WebElement departingDate;

    @FindBy(xpath = "(//*[@data-test-id='flight-operated'])[2]")
    public WebElement returningDate;

    @FindBy(xpath = "(//*[@class='uitk-link uitk-spacing uitk-spacing-padding-block-two uitk-link-layout-inline uitk-type-300'])[1]")
    public WebElement btnShowDetailsDeparting;

    @FindBy(xpath = "(//*[@class='uitk-link uitk-spacing uitk-spacing-padding-block-two uitk-link-layout-inline uitk-type-300'])[2]")
    public WebElement btnShowDetailsReturning;

    @FindBy(xpath = "(//*[@class='uitk-text uitk-type-300 uitk-spacing uitk-spacing-padding-inlinestart-six'])[1]")
    public WebElement departingFlyingFrom;

    @FindBy(xpath = "(//*[@class='uitk-text uitk-type-300 uitk-spacing uitk-spacing-padding-inlinestart-six'])[2]")
    public WebElement departingFlyingTo;

    @FindBy(xpath = "(//*[@class='uitk-text uitk-type-300 uitk-spacing uitk-spacing-padding-inlinestart-six'])[3]")
    public WebElement returningFlyingFrom;

    @FindBy(xpath = "(//*[@class='uitk-text uitk-type-300 uitk-spacing uitk-spacing-padding-inlinestart-six'])[4]")
    public WebElement returningFlyingTo;

    public FlightInformationPage() {
        PageFactory.initElements(driver, this);
    }
}
