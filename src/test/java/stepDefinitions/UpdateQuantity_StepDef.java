package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import com.awesomeqa.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateQuantity_StepDef {

    HomePage homePage = new HomePage(DriverManager.getDriver());
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(DriverManager.getDriver());

    @When("User Click On View Cart To Navigate To Shopping Cart Page")
    public void UserClickOnViewCartToNavigateToShoppingCartPage() {
        homePage.clickOnViewCartIcon();
        homePage.assertDirectedToViewCartPage();
    }

    @And("User Change The Quantity of the product {string} {string}")
    public void userChangeTheQuantityOfTheProduct(String product, String quantity) {
        shoppingCartPage.addQuantityToSpecificProduct(product, quantity);
    }

    @And("User Click on Update Icon for product {string}")
    public void userClickOnUpdateIcon(String product) {
        shoppingCartPage.clickUpdateButtonToSpecificProduct(product);
    }

    @Then("The Quantity of the product Must Be Changed")
    public void theQuantityOfTheProductMustBeChanged() {
        shoppingCartPage.assertQuantityUpdatedSuccessfully();
    }


}
