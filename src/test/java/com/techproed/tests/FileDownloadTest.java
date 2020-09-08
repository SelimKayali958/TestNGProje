package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {

    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));//bulunulan dosyayi verir
        System.out.println(System.getProperty("user.home"));//ana klasoru verir

        String kullaniciDosyaYolu = System.getProperty("user.dir");

        String pomXmlDosyaYolu = kullaniciDosyaYolu + "/pom.xml";

        boolean varMi = Files.exists(Paths.get(pomXmlDosyaYolu));
        Assert.assertTrue(varMi);

    }

    @Test
    public void dosyaUpload () { //bilgisayardan websayfasina dosya yukleme
        // C:\Users\mk201\Desktop\New folder\logo.png
        driver.get("http://the-internet.herokuapp.com/upload");

        //<input id="file-upload" type="file" name="file">
        WebElement dosyaSecmeButonu = driver.findElement(By.id("file-upload"));

        // yuklemek istediginiz dosyanin, path (dosya yolunu) ekleyelim sendkeys ile gonderilir
        dosyaSecmeButonu.sendKeys("C:\\Users\\mk201\\Desktop\\New folder\\logo.png");

        WebElement uploadButonu = driver.findElement(By.id("file-submit"));
        uploadButonu.click();
        WebElement fileuploadYazisi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileuploadYazisi.isDisplayed());

    }

    @Test
    public void dosyaDownoad(){
        //C:\Users\mk201\Downloads\Amsterdam.jpg
        driver.get("http://the-internet.herokuapp.com/download");
        WebElement amsterdamLinki = driver.findElement(By.partialLinkText("Amsterdam"));
        amsterdamLinki.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean varMI = Files.exists(Paths.get("C:\\Users\\mk201\\Downloads\\Amsterdam.jpg"));
        Assert.assertTrue(varMI);

    }


}
