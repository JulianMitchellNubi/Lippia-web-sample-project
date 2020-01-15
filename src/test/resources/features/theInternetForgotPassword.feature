Feature: As a client i need to enter my email in Forgot Password page to recover my password

  @Smoke @TheInternet @ForgotPassword
  Scenario: The client enter a correct email
    Given The client is in The Internet home page
    And The client goes to Forgot Password page
    When The client enter the email email@email.com
    And The client click Retrieve Password button
    Then The client verify that a confirmation message Your e-mail's been sent! is shown properly