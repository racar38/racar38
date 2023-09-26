package tests.day01_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverObjesi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        // URL yazarken www demesek de istenen URL'e gider
        // ANCAK https:// yazmazsak gitmez
        Thread.sleep(3000);
        driver.close();

    }
}

