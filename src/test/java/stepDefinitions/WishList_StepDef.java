package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WishList_StepDef {

    HomePage homePage = new HomePage(DriverManager.getDriver());

    @And("user add product to wish list {string}")
    public void userAddProductToWishList(String product) {
        homePage.AddSpecificProductToWishList(product);
    }

    @Then("Confirmation Message Appears for adding product to wish list {string}")
    public void ConfirmationMessageAppearsForAddingProductToWishList(String product) {
        homePage.assertProductAddedToWishList(product);
    }
}
