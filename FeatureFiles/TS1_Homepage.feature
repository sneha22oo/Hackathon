Feature: Getting Car Service Details

  Scenario: Successfully Getting The Car Service Names and Booking Amount
    Given User Opened Website With The URL
    When User Select Service Type As "Car"
    And User Select SubCategory AS "SUV"
    And User Click On "Go for it" Button
    Then User Navigate to the Services Details Displayed Page
    And Captures The Service Name
    And Captures The Booking Amount
