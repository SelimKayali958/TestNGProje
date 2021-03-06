package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcTripHotelCreatePage {
/*
    http://fhctrip-qa.com/admin/HotelAdmin/Create
            1 - FhcTripHotelCreatePage ---- PAGES paketinde
    code, name, adress, phone, mail, idgroup, save bu webelementleri @FindBy
    kullanarak locate edelim.
2 - FhcTripHotelCreateTest ---- TESTS paketinde
    FhcTripHotelCreatePage class'ından nesne üretelim ve içerisindeki webelementleri kullanarak hotel oluşturalım.

    */

    WebDriver driver;

    public FhcTripHotelCreatePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(id = "Address")
    public WebElement address;

    @FindBy(id = "Phone")
    public WebElement phone;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "IDGroup")
    public WebElement iDGroup;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;



}
