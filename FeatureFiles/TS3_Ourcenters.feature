Feature: Service Address Display

  Scenario: Different Car Service Addresses of the State and City
    Given User Navigate Back to Home Page
    When Click On Our Centers
    When User Selects State1 and City1 and Click on Search Button
    Then User Gets The List Of Car Cleaning Service Addresses
    When User Selects State2 and City2 and Click on Search Button
    Then User Gets The List Of Car Cleaning Service Addresses
    When User Selects State3 and City3 and Click on Search Button
    Then User Gets The List Of Car Cleaning Service Addresses
