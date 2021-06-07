@firefox
Feature: Flight Booking Functionality (Firefox)

#  Background:

  Scenario: Flight Booking Verification

#    HomePage

    When click on Flights button
    And click on Roundtrip button
    And click on Leaving From button
    And input text "San Francisco (SFO - San Francisco Intl.)" into text field by id "location-field-leg1-origin" and press enter
    And click on Going To button
    And input text "New York (JFK - John F. Kennedy Intl.)" into text field by id "location-field-leg1-destination" and press enter
    And click by id "d1-btn"
    And Select Departing date to be 2 weeks from today and Returning date to be 3 weeks from today
    And click on Search button

#    FlightsSearchPage

    Then verify text field Flying From contains text
      | San Francisco, CA (SFO-San Francisco Intl.) | San Francisco, CA, United States of America (SFO) |
    And verify text field Flying To contains text
      | New York, NY (JFK-John F. Kennedy Intl.) | New York, NY, United States of America (JFK) |
    And verify text field with id contains expected departing data
      | ID                          |
      | start-date-ROUND_TRIP-0-btn |
      | departure-date-1            |
    And verify text field with id contains expected returning data
      | ID                        |
      | end-date-ROUND_TRIP-0-btn |
      | return-date-1             |
    And verify all flights in result search contain text
      | San Fr... (SFO) - New York (JFK) | Departure airport: SFO.%Arrival airport: JFK. |
#    Choose departing flight
    When select checkbox by id - true
      | stops-0 | stopFilter_stops-0 |
    And wait for 7000 milliseconds
    And select dropdown value by "Price (Highest)"
    And wait for 7000 milliseconds
    And select first flight from the list
    And click on Continue Select this fare button
    And wait for 7000 milliseconds
#    Choose returning flight
    And wait for 7000 milliseconds
    And select first flight from the list
    And click on Continue Select this fare button
    And wait for 7000 milliseconds
    And switch to new window

#    FlightInformationPage

#    the following steps are only for new app
    Then verify Departing date
    And verify Returning date
    When click on Show details in departing section
    And wait for 7000 milliseconds
    Then verify departure airport is "San Francisco Intl. (SFO)" and arrival airport is "John F. Kennedy Intl. (JFK)" in departing section
    And verify Trip total price


