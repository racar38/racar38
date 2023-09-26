package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("Title : " + driver.getTitle());
        System.out.println("Url : " + driver.getCurrentUrl());

        System.out.println( "PageSource :" + driver.getPageSource());

        System.out.println("WindowHandle degeri : " + driver.getWindowHandle());
        System.out.println("WindowHandle DEGERLERI seti : " + driver.getWindowHandles());


        /*
        Webdriver her pencereye unique bir window handle degeri atamasi yapar.

        Bir test class'i calismaya basladiktan sonra birden fazla pencere de acabilir

        bu durumda tek bir window handle degeri degil
        acilan sayfa adedince window handle degerlerimiz olur.
        Birden fazla element olunca selenium onlari set'e koymayi uygun gormus.
         */
        Thread.sleep(3000);  // throws InterruptedException ya bekleyemezsem beklersin gülüm :) diyoruz
        driver.close();
    }
}
