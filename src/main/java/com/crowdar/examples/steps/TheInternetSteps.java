package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.TheInternetEmailSentPage;
import com.crowdar.examples.pages.TheInternetForgotPasswordPage;
import com.crowdar.examples.pages.TheInternetHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TheInternetSteps  extends PageSteps{

    @Given("The client is in The Internet home page")
    public void home() {
        Injector._page(TheInternetHomePage.class).go();
    }

    @And("The client goes to Forgot Password page")
    public void forgotPassword() {
        Injector._page(TheInternetHomePage.class).clickForgotPasswordLink();
    }

    @When("The client enter the email (.*)")
    public void enterEmail(String email) {
        Injector._page(TheInternetForgotPasswordPage.class).enterEmail(email);
    }

    @And("The client click Retrieve Password button")
    public void clickRetrievePasswordButton() {
        Injector._page(TheInternetForgotPasswordPage.class).clickRetrievePasswordButton();
    }

    @Then("The client verify that a confirmation message (.*) is shown properly")
    public void startVerification(String confirmationMessage) {
        Assert.assertTrue(Injector._page(TheInternetEmailSentPage.class).getConfirmationMessageText().equals(confirmationMessage));
    }

}
