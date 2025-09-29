package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.ForgottenPasswordPage;
import com.awesomeqa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ForgotPassword_StepDef {

    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage(DriverManager.getDriver());
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @And("User Click On Forgotten Password Button")
    public void UserClickOnForgottenPasswordButton() {
        loginPage.clickForgetpassword();
    }

    @And("User Enters Valid Email {string}")
    public void userEntersValidEmail(String email) {
        forgottenPasswordPage.EnterYourEmail(email);
    }

    @Then("Assert confirmation link has been sent email")
    public void assertConfirmationLinkHasBeenSentEmail() {
        forgottenPasswordPage.assertMessageShownForConfirmationLinkSentToEmail();
    }


}
