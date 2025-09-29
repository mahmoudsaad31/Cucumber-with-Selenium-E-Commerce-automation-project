package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import com.awesomeqa.pages.OrderReturnPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderReturn_StepDef {

    OrderReturnPage orderReturnPage = new OrderReturnPage(DriverManager.getDriver());
    HomePage homePage = new HomePage(DriverManager.getDriver());

    @When("User click on order history")
    public void clickonOrderHistory() {
        orderReturnPage.clickOrderHistory();
    }


    @And("User click on View Order Button")
    public void userClickOnViewOrderButton() {
        orderReturnPage.clickViewOrder();
    }

    @And("User click on Return button for Specific Product {string}")
    public void userclickonReturnbuttonforSpecificProduct(String product) {
        orderReturnPage.clickReturnSpecificProductButton(product);
    }


    @And("User Fill Information For Return Request and submit {string}")
    public void userFillInformationForReturnRequest(String comment) {
        orderReturnPage.clickOnFaulty();
        orderReturnPage.clickOnopened();
        orderReturnPage.enterComment(comment);
        orderReturnPage.clickSubmitButton();
    }


    @Then("assert submitting your return request")
    public void assertSubmittingYourReturnRequest() {
        orderReturnPage.assertSubmittingyourReturnRequest();
    }

    @And("User Click On Continue Button to navigate To Home Page")
    public void userClickOnContinueButtonToNavigateToHomePage() {
        orderReturnPage.clickcontinueButton();
        homePage.assertDirectedToHomePage();


    }
}


