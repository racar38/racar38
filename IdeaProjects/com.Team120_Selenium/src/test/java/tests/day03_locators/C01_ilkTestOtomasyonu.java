package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ilkTestOtomasyonu {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com.tr");
        // arama kutusuna "Nutella" yazdirip aratin


        // once arama kutusunu findElement() ve Locator ile driver'a tanitip
        // o webelemnti bu class'da kullanabilecegim sekilde kaydetmeliyim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        // arama sonuclarinin "Nutella" icerdigini test edin
        // By.className locator'i class attribute'unun degeri bosluk icerdiginde
        // saglikli calismaz
        // Cogunlukla class ismi ayni ozelliklerdeki webelementleri gruplandirmak icin kullanilir.
        // Bizde class degeri sg-col-inner arattigimizda 73 tane web element buldu

        //WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));

        List<WebElement> elementlerListesi =driver.findElements(By.className("sg-col-inner"));

        String actualAramaSonucu=elementlerListesi.get(0).getText();
        String expectedIcerik="Nutella";

        if (actualAramaSonucu.contains("Nutella")){
            System.out.println("ilk otomasyon testi PASSED");
        }else {
            System.out.println("ilk otomasyon testi FAILED");
        }


        Thread.sleep(5000);
        driver.close();
    }
}
