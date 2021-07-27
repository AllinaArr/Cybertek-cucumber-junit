package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SBFillOutFormPage {

    public SBFillOutFormPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement costumerName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement card;

    @FindBy(css = "input#ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadioButton;

    @FindBy(css = "input#ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCardRadioButton;

    @FindBy(css = "input#ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement americanExpressRadioButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNum;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement process;

    @FindBy(css = "a[href='Default.aspx']")
    public WebElement viewAllOrdersLink;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]")
    public List<WebElement> nameCell;


}

