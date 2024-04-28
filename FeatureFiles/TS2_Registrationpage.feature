Feature: Error Message Display

  Scenario: Invalid Register Credentials
    Given User Click on Register Button
    When User Enters Other Details along with Invalid Email
    And User Click On SignUp Button
    Then User Get Error Message
