package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {

    @Test (  groups = {"fhctrip", "hotelolusturma"} )
    public void aramaTesti(){
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");

        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage(driver);
        fhcTripLoginPage.userNameAramaKutusu.sendKeys("manager2");
        fhcTripLoginPage.passwordAramaKutusu.sendKeys("Man1ager2!");
        fhcTripLoginPage.loginButonu.click();

    }
}
