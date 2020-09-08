package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ornek_HotelOlusturma extends TestBase {

    /*
    http://www.fhctrip-qa.com/admin/HotelAdmin/Create
        a. Username : manager2
        b. Password : Man1ager2!
     */
    @BeforeMethod
    public void giris(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        WebElement userName = driver.findElement(By.id("UserName"));
        userName.sendKeys("manager2");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Man1ager2!"+ Keys.ENTER);

    }
    @Test
    public void hotelCreate (){
        driver.findElement(By.id("Code")).sendKeys("kod");
        driver.findElement(By.id("Name")).sendKeys("ad");
        driver.findElement(By.id("Address")).sendKeys("adres");
        driver.findElement(By.id("Phone")).sendKeys("tel");
        driver.findElement(By.id("Email")).sendKeys("email@mail");
        WebElement dropDown = driver.findElement(By.id("IDGroup"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);
        driver.findElement(By.id("btnSubmit")).submit();
        WebDriverWait wait = new WebDriverWait(driver,45);
        WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bootbox-body']")));
        Assert.assertTrue(mesaj.isDisplayed());
        System.out.println(mesaj.getText());

    }



}
