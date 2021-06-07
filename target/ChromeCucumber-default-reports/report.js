$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/flightBooking.feature");
formatter.feature({
  "name": "Flight Booking Functionality (Chrome)",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@chrome"
    }
  ]
});
formatter.scenario({
  "name": "Flight Booking Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@chrome"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on Flights button",
  "keyword": "When "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.click_on_Flights_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Roundtrip button",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.click_on_Roundtrip_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Leaving From button",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.click_on_Leaving_From_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input text \"San Francisco (SFO - San Francisco Intl.)\" into text field by id \"location-field-leg1-origin\" and press enter",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.input_text_into_text_field_by_id_and_press_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Going To button",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.click_on_Going_To_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input text \"New York (JFK - John F. Kennedy Intl.)\" into text field by id \"location-field-leg1-destination\" and press enter",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.input_text_into_text_field_by_id_and_press_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click by id \"d1-btn\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.click_by_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Departing date to be 2 weeks from today and Returning date to be 3 weeks from today",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.select_Departing_date_to_be_weeks_from_today_and_Returning_date_to_be_weeks_from_today(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.HomePageSteps.click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify text field Flying From contains text",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.verify_text_field_Flying_From_contains_text(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify text field Flying To contains text",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.verify_text_field_Flying_To_contains_text(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify text field with id contains expected departing data",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.verify_text_field_with_id_contains_expected_departing_data(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify text field with id contains expected returning data",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.verify_text_field_with_id_contains_expected_returning_data(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify all flights in result search contain text",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.verify_all_flights_in_result_search_contain_text(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select checkbox by id - true",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.select_checkbox_by_id_true(java.lang.Boolean,io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select dropdown value by \"Price (Highest)\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.select_dropdown_value_by(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select first flight from the list",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.select_first_flight_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Continue Select this fare button",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.click_on_Continue_Select_this_fare_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select first flight from the list",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.select_first_flight_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Continue Select this fare button",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.click_on_Continue_Select_this_fare_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "switch to new window",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.switch_to_new_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Departing date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_Departing_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Returning date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_Returning_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Show details in departing section",
  "keyword": "When "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.click_on_Show_details_in_departing_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify departure airport is \"San Francisco Intl. (SFO)\" and arrival airport is \"John F. Kennedy Intl. (JFK)\" in departing section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_departure_airport_is_and_arrival_airport_is_in_departing_section(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Trip total price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_Trip_total_price()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Flight Booking Verification");
formatter.after({
  "status": "passed"
});
});