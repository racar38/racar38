package tests.day01_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    public static void main(String[] args) {

        /* Test icin her class olusturdugumuzda
           ilk yapmamiz gereken WebDriver objesi olusturmaktir.
           WebDriver objesi istedigimiz browser'in bir kopyasini olusturup
           istedigimiz web islemlerini yapacak

           her browser'in dosyasi farkli oldugundan
           projemizde kullanmak istedigimiz her browser'in driver'ini
           selenium.dev deki browser bolumunden indirip projemize kopyaliyoruz


         */


        // her class'da o class'da kullanacagimiz browser'i tanitmaliyiz

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");

        // WebDriver objesi olusturalim

        WebDriver driver = new ChromeDriver();

        // Artik bu driver objesi ile istenen otomasyonlari yapabiliriz

        driver.get("https://www.amazon.com");

    }
}
