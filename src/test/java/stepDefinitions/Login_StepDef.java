package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import com.awesomeqa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {
    HomePage homePage = new HomePage(DriverManager.getDriver());
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());


    @Given("User Navigates to HomePage")
    public void UserNavigatestoHomePage() {
        homePage.navigateToHomePage();
    }


    @When("User Clicks on My Account Icon")
    public void userClicksOnMyAccountIcon() {
        homePage.clickOnMyAccount();
    }

    // 3. Steps
    @And("User Click on Login")
    public void UserClickonLogin() {
        homePage.clickOnLogin();
        homePage.assertDirectedToLoginPage();
    }

    @And("User Enter Email and Password {string} {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("Account Page appears")
    public void accountPageAppears() {
        loginPage.assertSuccessfulLogin();
    }

    @Then("Error message Should be displayed")
    public void errorMessageShouldBeDisplayed() {
        loginPage.assertUnSuccessfulLogin();
    }

}
