package com.orbitz.testbase;

import com.orbitz.pages.FlightInformationPage;
import com.orbitz.pages.FlightsSearchPage;
import com.orbitz.pages.HomePage;

public class PageInitializer extends BaseClass {

    public static HomePage homePage;
    public static FlightsSearchPage flightsSearchPage;
    public static FlightInformationPage flightInformationPage;

    public static void initializePageObjects() {
        homePage = new HomePage();
        flightsSearchPage = new FlightsSearchPage();
        flightInformationPage = new FlightInformationPage();
    }
}
