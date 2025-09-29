package stepDefinitions;

import com.awesomeqa.drivers.DriverManager;
import com.awesomeqa.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Search_StepDef {

    HomePage homePage = new HomePage(DriverManager.getDriver());

    @And("User Enter Product in search {string}")
    public void userEnterProductInSearch(String product) {
        homePage.searchFeature(product);
    }


    @Then("Assert Search Page Appearance of {string}")
    public void assertSearchPageAppearanceOf(String text) {
        homePage.assertsuccessfullSearchForSpecificWord(text);
    }


}
