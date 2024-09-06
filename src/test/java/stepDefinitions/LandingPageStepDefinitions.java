package stepDefinitions;

import io.cucumber.java.en.When;
import pages.LandingPage;
import setup.BaseClass;

public class LandingPageStepDefinitions extends BaseClass {


    private final LandingPage landingPage;

    public LandingPageStepDefinitions(BaseClass base) {
        this.landingPage = new LandingPage(base.driver);
    }

    @When("I click the logout button")
    public void submittingLoginForm() {
        landingPage.clickLogoutButton();
    }
}
