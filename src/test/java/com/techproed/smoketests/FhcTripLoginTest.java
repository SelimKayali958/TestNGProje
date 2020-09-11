package com.techproed.smoketests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {

    /*
    1. Adım : smoketests paketinin altında FhcTripLoginTest
2. Adım : içerisinde driver.get() ile properties dosyasının içindeki
          fhc_login adresine gidin
3. Adım : FhcTripLoginPage class'ının içerisindeki webelementleri kullanın.
4. Adım : webelementlerin içerisinde ConfigurationReader class'ının içerisindeki
          getProperty methodunu kullanarak bilgileri ekleyin.
     */

    @Test
    public void girisTesti(){
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");

        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage(driver);
        fhcTripLoginPage.userNameAramaKutusu.sendKeys(ConfigurationReader.getProperty("username"));
        fhcTripLoginPage.passwordAramaKutusu.sendKeys(ConfigurationReader.getProperty("password"));
        fhcTripLoginPage.loginButonu.click();
    }


}
