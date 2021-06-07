$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/flightBooking2.feature");
formatter.feature({
  "name": "Flight Booking Functionality (Firefox)",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@firefox"
    }
  ]
});
formatter.scenario({
  "name": "Flight Booking Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@firefox"
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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: (//*[@data-test-id\u003d\u0027flight-operated\u0027])[1]\u0027 (tried for 20 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.orbitz.utils.CommonMethods.waitForVisible(CommonMethods.java:92)\n\tat com.orbitz.utils.CommonMethods.getText(CommonMethods.java:167)\n\tat com.orbitz.steps.FlightInformationSteps.verify_Departing_date(FlightInformationSteps.java:18)\n\tat ✽.verify Departing date(file:///Users/evgeniya/eclipse-workspace/Orbitz/src/test/resources/features/flightBooking2.feature:55)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: (//*[@data-test-id\u003d\u0027flight-operated\u0027])[1]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro-16.local\u0027, ip: \u00272603:7000:7e00:59:0:0:0:fc9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 89.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210527174632, moz:geckodriverVersion: 0.29.1, moz:headless: false, moz:processID: 89001, moz:profile: /var/folders/qz/8ytd8bw52kv..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: MAC, platformName: MAC, platformVersion: 20.3.0, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 604a1df3-4798-3c44-958a-7effa7d422a9\n*** Element info: {Using\u003dxpath, value\u003d(//*[@data-test-id\u003d\u0027flight-operated\u0027])[1]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat com.orbitz.utils.CommonMethods.waitForVisible(CommonMethods.java:92)\n\tat com.orbitz.utils.CommonMethods.getText(CommonMethods.java:167)\n\tat com.orbitz.steps.FlightInformationSteps.verify_Departing_date(FlightInformationSteps.java:18)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:364)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:272)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:237)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:158)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:428)\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)\n\tat org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:562)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:548)\n",
  "status": "failed"
});
formatter.step({
  "name": "verify Returning date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_Returning_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Show details in departing section",
  "keyword": "When "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.click_on_Show_details_in_departing_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "wait for 7000 milliseconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.orbitz.steps.FlightsSearchSteps.wait_for_milliseconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify departure airport is \"San Francisco Intl. (SFO)\" and arrival airport is \"John F. Kennedy Intl. (JFK)\" in departing section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_departure_airport_is_and_arrival_airport_is_in_departing_section(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify Trip total price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.orbitz.steps.FlightInformationSteps.verify_Trip_total_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "Flight Booking Verification");
formatter.after({
  "status": "passed"
});
});