package com.cybertek.step_definitions;

import com.cybertek.pages.SBFillOutFormPage;
import com.cybertek.pages.SmartBearPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SmartBearTask4_StepDefinitions {

    SBFillOutFormPage sbFillOutFormPage = new SBFillOutFormPage();
    SmartBearPage smartBear = new SmartBearPage();

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String product) {
        Select productDown = new Select(sbFillOutFormPage.productName);
        productDown.selectByVisibleText(product);
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String numOfQyt) {
        sbFillOutFormPage.quantity.sendKeys(Keys.BACK_SPACE);
        sbFillOutFormPage.quantity.sendKeys( numOfQyt + Keys.ENTER);
    }
    @When("User enters {string} to customer name")
    public void user_enters_to_customer_name(String customerName) {
        sbFillOutFormPage.costumerName.sendKeys(customerName);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        sbFillOutFormPage.street.sendKeys(street);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        sbFillOutFormPage.city.sendKeys(city);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
       sbFillOutFormPage.state.sendKeys(state);
    }
    @When("User enters {string} to zip")
    public void user_enters_to_zip(String zip) {
        sbFillOutFormPage.zip.sendKeys(zip);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
       // sbFillOutFormPage.card.isSelected();
        switch (cardType) {
            case "Visa":
                sbFillOutFormPage.visaRadioButton.click();
                break;
            case "MasterCard":
                sbFillOutFormPage.masterCardRadioButton.click();
                break;
            case "American Express":
                sbFillOutFormPage.americanExpressRadioButton.click();
                break;
            }
        }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        sbFillOutFormPage.cardNum.sendKeys(cardNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
        sbFillOutFormPage.expDate.sendKeys(expDate);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        sbFillOutFormPage.process.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        sbFillOutFormPage.viewAllOrdersLink.click();
        boolean nameIsInTheTable = false;
        for (WebElement eachElement : sbFillOutFormPage.nameCell) {
            if (expectedName.equals(eachElement.getText())) {
                nameIsInTheTable = true;
                break;
            }
        }
        Assert.assertTrue(nameIsInTheTable);
    }
}
