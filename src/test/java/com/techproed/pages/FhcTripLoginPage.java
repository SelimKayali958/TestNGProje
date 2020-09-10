package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcTripLoginPage {

    /*  1 - FhcTripLoginPage  ----- PAGES paketinin altında
	  - 3 tane webelement bulmanız lazım.
		username, password, login
      2 - FhcTripLoginTest  ----- TESTS paketinin altında
	  - @Test oluşturup.
	  FhcTripLoginPage class'ından nesne üretip, webelementleri kullanmanız lazım.

	  http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin

	  username : manager2
      password : Man1ager2!

     */

    WebDriver driver;

    public FhcTripLoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "UserName")
    public WebElement userNameAramaKutusu;

    @FindBy (id = "Password")
    public WebElement passwordAramaKutusu;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButonu;

}
