package com.orbitz.steps;

import com.orbitz.utils.CommonMethods;
import com.orbitz.utils.GlobalVariables;
import io.cucumber.java.en.When;

public class HomePageSteps extends CommonMethods {

    @When("click on Flights button")
    public void click_on_Flights_button() {
        click(homePage.btnFlights);
    }

    @When("click on Roundtrip button")
    public void click_on_Roundtrip_button() {
        click(homePage.btnRoundTrip);
    }

    @When("click on Leaving From button")
    public void click_on_Leaving_From_button() {
        click(homePage.btnLeavingFrom);
    }

    @When("input text {string} into text field by id {string} and press enter")
    public void input_text_into_text_field_by_id_and_press_enter(String text, String id) {
        sendText(getWebElementById(id), text);
        pressEnter(getWebElementById(id));
    }

    @When("click on Going To button")
    public void click_on_Going_To_button() {
        click(homePage.btnGoingTo);
    }

    @When("click by id {string}")
    public void click_by_id(String id) {
        click(getWebElementById(id));
    }

    @When("Select Departing date to be {int} weeks from today and Returning date to be {int} weeks from today")
    public void select_Departing_date_to_be_weeks_from_today_and_Returning_date_to_be_weeks_from_today(int departingWeekFromToday, int returningWeekFromToday) {
        selectDateFromCalendar(homePage.calendarMonth, homePage.calendarDates, departingWeekFromToday, "MMMM YYYY", "MMM d, YYYY");
        GlobalVariables.departingDate = getNextNumberOfWeekDate(departingWeekFromToday, "MMM d");
        GlobalVariables.departingDate2 = getNextNumberOfWeekDate(departingWeekFromToday, "M/d/YYYY");

        System.out.println("--->   GlobalVariables.departingDate: " + GlobalVariables.departingDate);
        System.out.println("--->   GlobalVariables.departingDate2: " + GlobalVariables.departingDate2);

        selectDateFromCalendar(homePage.calendarMonth, homePage.calendarDates, returningWeekFromToday, "MMMM YYYY", "MMM d, YYYY");
        GlobalVariables.returningDate = getNextNumberOfWeekDate(returningWeekFromToday, "MMM d");
        GlobalVariables.returningDate2 = getNextNumberOfWeekDate(returningWeekFromToday, "M/d/YYYY");

        System.out.println("---> GlobalVariables.returningDate: " + GlobalVariables.returningDate);
        System.out.println("---> GlobalVariables.returningDate2: " + GlobalVariables.returningDate2);

        click(homePage.btnDone);
    }

    @When("click on Search button")
    public void click_on_Search_button() {
        click(homePage.btnSearch);
    }
}
