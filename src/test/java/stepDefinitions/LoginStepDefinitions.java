package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.LoginPage;
import setup.BaseClass;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions extends BaseClass {

    private final BaseClass base;
    private final LoginPage loginPage;
    private final LandingPage landingPage;

    public LoginStepDefinitions(BaseClass base) {
        this.base = base;
        this.loginPage = new LoginPage(base.driver);
        this.landingPage = new LandingPage(base.driver);
    }

    @Given("I navigate to login page")
    public void userNavigatesToLoginPage() {
        base.driver.get(base.loginPageURL);
    }

    @When("I enter username as {string} and password as {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void submittingLoginForm() {
        loginPage.clickLoginButton();
    }

    @Then("the {string} message is {string}")
    public void theMessageIsInvalidLoginText(String typeOfMessage, String loginText) throws Exception {

        switch (typeOfMessage) {
            case "successful":
                assertTrue("Failed to display the successful login message!", landingPage.verifyLoginMessage().contains(loginText));
                break;
            case "unsuccessful":
                assertTrue("Failed to display the unsuccessful login message!", loginPage.verifyLoginMessage().contains(loginText));
                break;
            case "logout":
                assertTrue("Failed to display the successful logout message!", loginPage.verifyLoginMessage().contains(loginText));
                break;
            default:
                throw new Exception("There is no such type of message: " + typeOfMessage);
        }

    }
}