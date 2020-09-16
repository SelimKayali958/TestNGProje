package com.techproed.tests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ 	Keys.ENTER);
    }

    @Test (  groups = {"fhctrip", "hotelolusturma"} )
    public void aramaTesti(){
        giris();

        FhcTripHotelCreatePage fhcTripHotelCreatePage = new FhcTripHotelCreatePage(driver);

        fhcTripHotelCreatePage.code.sendKeys("1234");
        fhcTripHotelCreatePage.name.sendKeys("kalik");
        fhcTripHotelCreatePage.address.sendKeys("new york");
        fhcTripHotelCreatePage.phone.sendKeys("6878718617");
        fhcTripHotelCreatePage.email.sendKeys("irfnin@vfrotm");
        Select select =new Select(fhcTripHotelCreatePage.iDGroup);
        select.selectByIndex(2);
        fhcTripHotelCreatePage.btnSubmit.click();


    }
}
