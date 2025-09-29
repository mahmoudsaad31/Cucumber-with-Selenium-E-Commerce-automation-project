package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.EditAccountInfoPage;
import com.awesomeqa.pages.HomePage;
import com.awesomeqa.pages.LoginPage;
import com.awesomeqa.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditAccountInfo_StepDef {

    HomePage homePage = new HomePage(DriverManager.getDriver());
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());
    EditAccountInfoPage editAccountInfoPage = new EditAccountInfoPage(DriverManager.getDriver());

    @Given("user should be loged in with credentials {string} {string}")
    public void userShouldBeLogedIn(String email, String password) {
        homePage.navigateToHomePage();
        homePage.clickOnMyAccount();
        homePage.clickOnLogin();
        loginPage.login(email, password);
        loginPage.assertSuccessfulLogin();
    }

    @And("User Click on My Account Info")
    public void userClickOnMyAccountInfo() {
        myAccountPage.clickMyAccountinfo();

    }

    @And("User Navigate to Edit account information page")
    public void UserNavigatetoEditaccountinformationpage() {
        myAccountPage.clickEditAccountInfo();
        myAccountPage.assertDirectedToEditAccountInformationPage();
    }

    @And("User Change Credentials to {string} , {string} , {string} and press Continue button")
    public void userChangeCredentialsToAndPressContinueButton(String Fname, String Lname, String telephone) {
        editAccountInfoPage.editAccountInformation(Fname, Lname, telephone);
    }

    @Then("Account Edition Message Appears")
    public void accountEditionMessageAppears() {
        editAccountInfoPage.assertsuccessfulEditForAcountInfo();
    }


}
