package com.orbitz.steps;

import com.orbitz.utils.CommonMethods;
import com.orbitz.utils.GlobalVariables;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;


public class FlightsSearchSteps extends CommonMethods {

    @ParameterType(value = "true|false")
    public Boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

    @Then("verify text field Flying From contains text")
    public void verify_text_field_Flying_From_contains_text(DataTable dataTable) {
        List<String> expectedData = dataTable.asList();
        if (flightsSearchPage.searchResultPageTitle.size() != 0) {
            System.out.println("---> textFlyingFrom: " + getText(flightsSearchPage.btnFlyingFrom));
            Assert.assertEquals("Data does NOT matched", getText(flightsSearchPage.btnFlyingFrom), expectedData.get(0));
        } else {
            System.out.println("---> textFlyingFrom: " + flightsSearchPage.btnFlyingFrom2.getAttribute("value"));
            Assert.assertEquals("Data does NOT matched", flightsSearchPage.btnFlyingFrom2.getAttribute("value"), expectedData.get(1));
        }
    }

    @Then("verify text field Flying To contains text")
    public void verify_text_field_Flying_To_contains_text(DataTable dataTable) {
        List<String> expectedData = dataTable.asList();
        if (flightsSearchPage.searchResultPageTitle.size() != 0) {
            System.out.println("---> textFlyingFrom: " + getText(flightsSearchPage.btnFlyingTo));
            Assert.assertEquals("Data does NOT matched", getText(flightsSearchPage.btnFlyingTo), expectedData.get(0));
        } else {
            System.out.println("---> textFlyingFrom: " + flightsSearchPage.btnFlyingTo2.getAttribute("value"));
            Assert.assertEquals("Data does NOT matched", flightsSearchPage.btnFlyingTo2.getAttribute("value"), expectedData.get(1));
        }
    }

    @Then("verify text field with id contains expected departing data")
    public void verify_text_field_with_id_contains_expected_departing_data(DataTable dataTable) {

        List<Map<String, String>> expectedData = dataTable.asMaps();
        boolean flag = false;

        for (Map<String, String> data : expectedData) {
            String elementID = data.get("ID");

            if (driver.findElements(By.id(elementID)).size() != 0) {
                if (flightsSearchPage.searchResultPageTitle.size() != 0) {
                    flag = true;
                    System.out.println("---> Departing date: " + getWebElementById(elementID).getText());
                    Assert.assertEquals("Data does NOT matched", getWebElementById(elementID).getText(), GlobalVariables.departingDate);
                } else {
                    flag = true;
                    System.out.println("---> Departing date: " + getWebElementById(elementID).getAttribute("value"));
                    Assert.assertEquals("Data does NOT matched", getWebElementById(elementID).getAttribute("value"), GlobalVariables.departingDate2);
                }
            }
        }
        Assert.assertTrue("Assert was not performed for this step", flag);
    }

    @Then("verify text field with id contains expected returning data")
    public void verify_text_field_with_id_contains_expected_returning_data(DataTable dataTable) {

        List<Map<String, String>> expectedData = dataTable.asMaps();
        boolean flag = false;

        for (Map<String, String> data : expectedData) {
            String elementID = data.get("ID");

            if (driver.findElements(By.id(elementID)).size() != 0) {
                if (flightsSearchPage.searchResultPageTitle.size() != 0) {
                    flag = true;
                    System.out.println("---> Departing date: " + getWebElementById(elementID).getText());
                    Assert.assertEquals("Data does NOT matched", getWebElementById(elementID).getText(), GlobalVariables.returningDate);
                } else {
                    flag = true;
                    System.out.println("---> Departing date: " + getWebElementById(elementID).getAttribute("value"));
                    Assert.assertEquals("Data does NOT matched", getWebElementById(elementID).getAttribute("value"), GlobalVariables.returningDate2);
                }
            }
        }
        Assert.assertTrue("Assert was not performed for this step", flag);
    }

    @Then("verify all flights in result search contain text")
    public void verify_all_flights_in_result_search_contain_text(DataTable dataTable) {
        List<String> expectedData = dataTable.asList();

        if (flightsSearchPage.searchResultPageTitle.size() != 0) {
            for (WebElement data : flightsSearchPage.listOfArrivalAndDepartureResults) {
                System.out.println("---> result: " + getText(data));
                System.out.println("---> size: " + flightsSearchPage.listOfArrivalAndDepartureResults.size());
                Assert.assertEquals("Data does NOT matched", getText(data), expectedData.get(0));
            }
        } else {
            for (WebElement data : flightsSearchPage.listOfArrivalAndDepartureResults2) {
                String[] array = expectedData.get(1).split("%");
                System.out.println("---> result: " + getText(data));
                System.out.println("---> size: " + flightsSearchPage.listOfArrivalAndDepartureResults2.size());
                for (String text : array) {
                    System.out.println("---> text: " + text);
                    Assert.assertTrue("Data does NOT matched", getText(data).contains(text));
                }
            }
        }
    }

    @When("select checkbox by id - {booleanValue}")
    public void select_checkbox_by_id_true(Boolean booleanValue, DataTable dataTable) {
        List<String> expectedData = dataTable.asList();
        String id = null;
        if (flightsSearchPage.searchResultPageTitle.size() != 0) {
            id = expectedData.get(0);
        } else {
            id = expectedData.get(1);
        }
        selectCheckBox(getWebElementById(id), booleanValue);
    }

    @When("select dropdown value by {string}")
    public void select_dropdown_value_by(String visibleText) {
        selectDDValue(flightsSearchPage.ddSortBy, visibleText);
    }

    @When("select first flight from the list")
    public void select_first_flight_from_the_list() {
        for (WebElement e : flightsSearchPage.searchResultPageTitle) {
            System.out.println("!!!!!!!!!!!!!!!!!!" + e.getText());
        }
        if (flightsSearchPage.searchResultPageTitle.size() != 0) {
            System.out.println("click good");
            click(flightsSearchPage.firstFlightFromTheList);
        } else {
            if (flightsSearchPage.btnNoThanks.size() == 1) {
                System.out.println("click no thanks");
                click(flightsSearchPage.btnNoThanks.get(0));
            }
            System.out.println("click old");
            jsExecutorClick(flightsSearchPage.btnSelectForFirstFlightFromTheList);
        }
    }

    @When("click on Continue Select this fare button")
    public void click_on_Continue_Select_this_fare_button() {
        if (flightsSearchPage.searchResultPageTitle.size() != 0) {
            GlobalVariables.priceTripTotalFromFlightSearchPage = getText(flightsSearchPage.priceTripTotal);
            System.out.println("---> GlobalVariables.priceTripTotalFromFlightSearchPage: " + GlobalVariables.priceTripTotalFromFlightSearchPage);
            System.out.println("---> getText(flightsSearchPage.priceTripTotal): " + getText(flightsSearchPage.priceTripTotal));
            jsExecutorClick(flightsSearchPage.btnContinue);
        } else {
            if (flightsSearchPage.btnNoThanks.size() == 1) {
                click(flightsSearchPage.btnNoThanks.get(0));
                jsExecutorClick(flightsSearchPage.btnSelectThisFareForFirstFlightFromTheList);
            } else {
                jsExecutorClick(flightsSearchPage.btnSelectThisFareForFirstFlightFromTheList);
            }
        }
    }

    @When("click by id {string} for old app")
    public void click_by_id_for_old_app(String id) {
        if (flightsSearchPage.searchResultPageTitle2.size() == 1) {
            click(getWebElementById(id));
        }
    }

    @When("wait for {int} milliseconds")
    public void wait_for_milliseconds(int milliseconds) {
        waitForMilliseconds(milliseconds);
    }
}
