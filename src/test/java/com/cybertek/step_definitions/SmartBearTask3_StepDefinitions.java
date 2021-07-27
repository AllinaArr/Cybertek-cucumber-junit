package com.cybertek.step_definitions;

import com.cybertek.pages.SBFillOutFormPage;
import com.cybertek.pages.SmartBearPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SmartBearTask3_StepDefinitions {

    SmartBearPage smartBearPage = new SmartBearPage();
    SBFillOutFormPage sbFillOutFormPage = new SBFillOutFormPage();

    @Given("login page of the web site")
    public void login_page_of_the_web_site() {
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
    }
    @When("the user able to login and on Order page")
    public void the_user_able_to_login_and_on_order_page() {
        smartBearPage.username.sendKeys("Tester");
        smartBearPage.password.sendKeys("test");
        smartBearPage.loginButton.click();
        smartBearPage.orderButton.click();
    }
    @When("the user able to fill out the form")
    public void the_user_able_to_fill_out_the_form() {
        Select familyAlbum = new Select(sbFillOutFormPage.productName);
        familyAlbum.selectByVisibleText("FamilyAlbum");

       sbFillOutFormPage.quantity.sendKeys(Keys.BACK_SPACE);
       sbFillOutFormPage.quantity.sendKeys("4" + Keys.ENTER);

       sbFillOutFormPage.costumerName.sendKeys("John Wick");

       sbFillOutFormPage.street.sendKeys("Kinzie Ave");
       sbFillOutFormPage.city.sendKeys("Chicago");
       sbFillOutFormPage.state.sendKeys("IL");
       sbFillOutFormPage.zip.sendKeys("60056");

        sbFillOutFormPage.card.click();

        sbFillOutFormPage.cardNum.sendKeys("1111222233334444");

        sbFillOutFormPage.expDate.sendKeys("12/22");

        sbFillOutFormPage.process.click();

    }
    @Then("the user verifies in the list")
    public void the_user_verifies_in_the_list() {

    }

    }

