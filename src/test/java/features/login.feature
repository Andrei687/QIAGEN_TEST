Feature: Test Automation

  Background:
    Given I navigate to login page

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When I enter username as <username> and password as <password>
    And I click the login button
    Then the <typeOfMessage> message is <invalidLoginText>

    Examples:
      | username          | password          | typeOfMessage  | invalidLoginText            |
      | "invalidUsername" | "invalidPassword" | "unsuccessful" | "Your username is invalid!" |

  @ValidCredentialsAndLogout
  Scenario Outline: Login with valid credentials
    When I enter username as <username> and password as <password>
    And I click the login button
    Then the <typeOfMessage> message is <loginText>

    When I click the logout button
    Then the <typeOfMessage> message is <logoutText>

    Examples:
      | username   | password               | typeOfMessage | loginText                        | logoutText                           |
      | "tomsmith" | "SuperSecretPassword!" | "logout"      | "You logged into a secure area!" | "You logged out of the secure area!" |
