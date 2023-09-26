package tests.ornek_Sorular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {

        /*


1. Amazon sayfasina gidelim. https://www.amazon.com/
2. Sayfa basligini(title) yazdirin
3. Sayfa basliginin “Amazon” icerdigini test edin
4. Sayfa adresini(url) yazdirin
5. Sayfa url’inin “amazon” icerdigini test edin.
6. Sayfa handle degerini yazdirin
7. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
8. Sayfayi kapatin.
         */

        // mahserin 4 atlisi
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //1. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //3. Sayfa basliginin “Amazon” icerdigini test edin
        if (driver.getTitle().contains("Amazon")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
        }
        //4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //5. Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
        }
        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //7. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        if (driver.getPageSource().contains("alisveris")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
        }
        //8. Sayfayi kapatin.
        driver.close();

    }
}
