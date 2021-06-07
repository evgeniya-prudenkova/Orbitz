package com.orbitz.steps;

import com.orbitz.utils.CommonMethods;
import com.orbitz.utils.GlobalVariables;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FlightInformationSteps extends CommonMethods {

    @When("switch to new window")
    public void switch_to_new_window() {
        switchToChildWindow();
    }

    @Then("verify Departing date")
    public void verify_Departing_date() {
        System.out.println("---> flightInformationPage.departingDate.getText(): " + getText(flightInformationPage.departingDate));
        Assert.assertTrue("Data does NOT matched", getText(flightInformationPage.departingDate).contains(GlobalVariables.departingDate));
    }

    @Then("verify Returning date")
    public void verify_Returning_date() {
        System.out.println("---> flightInformationPage.returningDate.getText(): " + getText(flightInformationPage.returningDate));
        Assert.assertTrue("Data does NOT matched", getText(flightInformationPage.returningDate).contains(GlobalVariables.returningDate));
    }

    @When("click on Show details in departing section")
    public void click_on_Show_details_in_departing_section() {
        click(flightInformationPage.btnShowDetailsDeparting);
    }

    @Then("verify departure airport is {string} and arrival airport is {string} in departing section")
    public void verify_departure_airport_is_and_arrival_airport_is_in_departing_section(String flyingFrom, String flyingTo) {
        Assert.assertEquals("Data does NOT matched", getText(flightInformationPage.departingFlyingFrom), flyingFrom);
        Assert.assertEquals("Data does NOT matched", getText(flightInformationPage.departingFlyingTo), flyingTo);
    }

    @When("click on Show details in returning section")
    public void click_on_Show_details_in_returning_section() {
        click(flightInformationPage.btnShowDetailsReturning);
    }

    @Then("verify departure airport is {string} and arrival airport is {string} in returning section")
    public void verify_departure_airport_is_and_arrival_airport_is_in_returning_section(String flyingFrom, String flyingTo) {
        Assert.assertEquals("Data does NOT matched", getText(flightInformationPage.returningFlyingFrom), flyingFrom);
        Assert.assertEquals("Data does NOT matched", getText(flightInformationPage.returningFlyingTo), flyingTo);
    }

    @Then("verify Trip total price")
    public void verify_Trip_total_price() {
        System.out.println("---> GlobalVariables.priceTripTotalFromFlightSearchPage: " + GlobalVariables.priceTripTotalFromFlightSearchPage);
        System.out.println("---> flightInformationPage.priceTripTotal: " + getText(flightInformationPage.priceTripTotal));
        Assert.assertEquals("Data does NOT matched", getText(flightInformationPage.priceTripTotal), GlobalVariables.priceTripTotalFromFlightSearchPage);
    }
}
