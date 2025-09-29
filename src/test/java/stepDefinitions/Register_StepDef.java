package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import com.awesomeqa.pages.MyAccountPage;
import com.awesomeqa.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;

public class Register_StepDef {

    RegisterPage registerPage = new RegisterPage(DriverManager.getDriver());
    HomePage homePage = new HomePage(DriverManager.getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

    @And("User Click on Register")
    public void userClickOnRegister() {
        homePage.clickOnRegister();
        homePage.assertDirectedToRegisterPage();
    }

    @And("User Enters Credentials {string} , {string} ,{string} , {string} ,{string}")
    public void userEntersValidCredentials(String Fname, String Lname, String email, String phone, String password) {
        registerPage.registerNewAcount(Fname, Lname, email, phone, password, password);
    }

    @When("User Enters Credentials with random email {string} , {string} , {string} , {string}")
    public void userEntersCredentialsWithRandomEmail(String Fname, String Lname, String phone, String password) {
        String name = new Faker().name().firstName();
        String randomEmail = name + "a@a.com";
        registerPage.registerNewAcount(Fname, Lname, randomEmail, phone, password, password);
    }


    @Then("Successfully Creation should be displayed")
    public void successfullyCreationShouldBeDisplayed() {
        registerPage.assertSuccessfullnewAccountRegistered();
    }


    @Then("Unsuccessfull Registry Message appears")
    public void unsuccessfullRegistryMessageAppears() {
        registerPage.validateUnsuccessfulRegistry();
    }

    @And("User Click On Continue Button to navigate To My Account Page")
    public void userClickOnContinueButtonToNavigateToMyAccountPage() {
        registerPage.clickContinueBtn();
        myAccountPage.assertDirectedToMyAccountURL();

    }


}
