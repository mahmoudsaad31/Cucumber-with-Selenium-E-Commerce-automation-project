package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import com.awesomeqa.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopingCart_StepDef {

    HomePage homePage = new HomePage(DriverManager.getDriver());
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(DriverManager.getDriver());

    @And("User Add Product to cart {string}")
    public void UserAddProductToCart(String product) {
        homePage.AddSpecificProductToCart(product);
    }

    @Then("Confirmation Message Appears For Adding Product To Cart {string}")
    public void ConfirmationMessageAppearsForAddingProductToCart(String product) {
        homePage.assertProductAddedToCart(product);
    }

    @Given("User Click on Cart Icon")
    public void UserClickonCartIcon() {
        homePage.clickOnCartIcon();
    }

    @When("User Removes Specific Product From Cart {string}")
    public void UserRemovesSpecificProductFromCart(String product) {
        homePage.RemoveSpecificProductFromCart(product);
    }

    @Then("Assert Product Removed From Cart Icon {string}")
    public void AssertProductRemovedFromCartIcon(String product) {
        homePage.assertProductRemovedFromCarticon(product);
    }

    @When("User Removes Specific Product From Shopping Cart Page {string}")
    public void userRemovesSpecificProductFromShoppingCartPage(String product) {
        shoppingCartPage.removeSpecificProductFromCart(product);
    }

    @Then("Assert Product Removed From Shopping Cart Page {string}")
    public void assertProductRemovedFromShoppingCartPage(String product) {
        shoppingCartPage.assertProductRemovedfromCart(product);
    }

    @When("User Click On Continue Shopping Button")
    public void userClickOnContinueShoppingButton() {
        shoppingCartPage.clickContinueShoppingButton();
    }

    @Then("Assert Directed To Home Page")
    public void assertDirectedToHomePage() {
        homePage.assertDirectedToHomePage();

    }
}
