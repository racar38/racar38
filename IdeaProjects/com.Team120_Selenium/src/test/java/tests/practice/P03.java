package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) {

        /*
        1) Browser açın
        2) “http://practice.automationtesting.in/” adresine gidin
        3) Sİtenin başlığını alıp yazdırın
        4) Sitenin url adresini alıp yazdırın
        5) Başlığın Practice ve Url'in  ise practice içerip içermediğini test edin
        6) Pencereyi kapatın
         */

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://practice.automationtesting.in/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        if (driver.getTitle().contains("Practice") && driver.getCurrentUrl().contains("practice")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }


    }
}
