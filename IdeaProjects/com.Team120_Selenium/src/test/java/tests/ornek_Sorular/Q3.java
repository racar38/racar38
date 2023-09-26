package tests.ornek_Sorular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {

        /*
        2. Amazon soyfasina gidelim. https://www.amazon.com/
3. Sayfanin konumunu ve boyutlarini yazdirin
4. Sayfayi simge durumuna getirin
5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
7. Sayfayi fullscreen yapin
8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
9. Sayfayi kapatin
         */
        // mahserin 4 atlisi
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().fullscreen();

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.close();


    }
}
