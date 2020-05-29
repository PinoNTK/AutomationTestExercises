Feature: Login
  Scenario: Show Homepage after login with valid credentials
    Given The login screen is displayed on browser
    When A user attempt to login with his account is "kien678969@gmail.com" and "babysnow96"
    Then The project list page will be shown
