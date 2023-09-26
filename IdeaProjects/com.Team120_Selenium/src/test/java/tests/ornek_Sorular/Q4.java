package tests.ornek_Sorular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4 {
    public static void main(String[] args) {

        /*
       1-  Yeni bir class olusturun (TekrarTesti)
2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
doğru URL'yi yazdırın.
4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
5. Youtube sayfasina geri donun
6. Sayfayi yenileyin
7. Amazon sayfasina donun
8. Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
Yoksa doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
doğru URL'yi yazdırın
11.Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.youtube.com/");
        if (driver.getTitle().contains("youtube")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED Actual Title :" + driver.getTitle());
        }

        if (driver.getCurrentUrl().contains("youtube")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED Actual Url: " + driver.getCurrentUrl());
        }
        driver.get("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        if (driver.getTitle().contains("Amazon")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED Actual Title : " + driver.getTitle());
        }
        if (driver.getCurrentUrl().contains("https://www.amazon.com/")){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILED Actual Url : " +driver.getCurrentUrl());
        }

        driver.close();


    }
}
