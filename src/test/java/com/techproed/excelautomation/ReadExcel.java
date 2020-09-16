package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu = "C:\\Users\\mk201\\IdeaProjects\\TestNGProje\\src\\test\\resources\\ULKELER.xlsx";
        // java'da bir dosyayi acmak icin bu kullanilir
        // parametre bolumune acmak istedigimiz dosyanin adresi yazilir

            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

          // Woorkbook (excel) dosyasini okumaya basladik
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // 1. sayfaya gider. (index degeri 0 dan baslar)
        Sheet sheet = workbook.getSheetAt(0);

        // 1. satira gidelim. (index degeri 0 dan baslar)
        Row row = sheet.getRow(0);

        // 1. hucreye gidelim. (index degeri 0 dan baslar)
        Cell ulkeler = row.getCell(0);
        Cell baskentler = row.getCell(1);
        Cell meshurlar = row.getCell(2);

        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(meshurlar);

        // Excel'e Git -> Sheet 0'a git -> 2. İndexteki Satıra git -> 1. İndexteki Hücre
        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(1));
        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));

        // son satir (Row)in numarasini almak icin (index 0 dan baslar)
        int satirSayisi = workbook.getSheetAt(0).getLastRowNum()+1;
        System.out.println("Satir sayisi : "+satirSayisi);

        // icerisinde veri olan satir  sayisini almak isterseniz
        // index 1 den basliyor
        int doluSatirSayisini = workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu Satir sayisi : "+ doluSatirSayisini);

        System.out.println();
        int sonSatirIndexi = workbook.getSheetAt(0).getLastRowNum();
       for (int i = 0 ; i <= sonSatirIndexi ; i++){
           System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
       }

        System.out.println();
        for (int i = 0 ; i <= sonSatirIndexi ; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));
        }

        System.out.println();
        // bir satırın son sütunun indexini alma
        // 1'den basliyor
        int sonSutunIndex = workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println("Son Sütun İndex : " + sonSutunIndex);

        // istenilen satirdaki tum sutunlari yazdirma
        for (int i = 0 ; i <sonSutunIndex ; i++){
            System.out.println(workbook.getSheetAt(0).getRow(3).getCell(i));
        }


     for (int i = 0 ; i <= sonSatirIndexi ; i++){
         for (int k = 0 ; k <sonSutunIndex ; k++){
             System.out.print(workbook.getSheetAt(0).getRow(i).getCell(k)+"=====");
         }
         System.out.println();
     }



        fileInputStream.close();
        workbook.close();

    }

}
