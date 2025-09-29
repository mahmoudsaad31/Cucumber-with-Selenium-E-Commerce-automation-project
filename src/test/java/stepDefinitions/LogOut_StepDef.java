package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LogOut_StepDef {

    MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

    @And("User Clicks on Logout")
    public void userClicksOnLogout() {
        myAccountPage.clickMyLogoutIcon();
    }

    @Then("Account Logout Page Appears")
    public void accountLogoutPageAppears() {

    }
}
