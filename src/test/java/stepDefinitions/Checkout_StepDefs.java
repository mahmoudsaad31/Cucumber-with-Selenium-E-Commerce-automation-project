package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.CheckOutPage;
import com.awesomeqa.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_StepDefs {


    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(DriverManager.getDriver());
    CheckOutPage checkOutPage = new CheckOutPage(DriverManager.getDriver());

    @When("User Click on Checkout Button To Navigate To Checkout Page")
    public void userClickOnCheckoutButtonToNavigateToCheckoutPage() {
        shoppingCartPage.clickCheckoutButton();
        checkOutPage.assertDirectedToCheckOutPage();
    }

    @And("User Enters Valid Credentials in Billing Details {string},{string},{string},{string},{string},{string},{string}")
    public void userEntersValidCredentialsInBillingDetails(String fname, String lname, String address, String city, String postcode, String country, String state) {
        checkOutPage.billingDetails(fname, lname, address, city, postcode, country, state);
    }

    @And("User Confirm Billing Details")
    public void userConfirmBillingDetails() {
        checkOutPage.clickContinueButtonPaymentAddress();

    }


    @And("User Confirm Delivery Details")
    public void userConfirmDeliveryDetails() {
        checkOutPage.clickContinueButtonShippingAddress();

    }

    @And("User Select Delivery Method")
    public void userSelectDeliveryMethod() {
        checkOutPage.clickContinueButtonShippingMethod();
    }

    @And("User Select Payment Method")
    public void userSelectPaymentMethod() {
        checkOutPage.clickAgreeToTerms_Conditions();
        checkOutPage.clickContinueButtonPaymentMethod();

    }

    @When("Assert order details {string} {string} {string}")
    public void assertOredredProductDetails(String productname, String productPrice, String productQuantity) {
        checkOutPage.assertProductDetails(productname, productPrice, productQuantity);
    }

    @And("User Confirm Order Details")
    public void userConfirmOrderDetails() {
        checkOutPage.clickConfirmOrderButton();
    }

    @Then("Order Confirmation message appear")
    public void orderConfirmationMessageAppear() {
        checkOutPage.assertOrderHasBeenPlaced();

    }


}
