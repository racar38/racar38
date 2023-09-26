package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath_textKullanimi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        // text kullanımını görduk

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu=driver.findElement(By.xpath("//*[text() = 'Delete']"));
        // tag'ı ne olursa olsun delete görünsün
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu testi PASSED");
        }else{
            System.out.println("Delete butonu testi FAILED");
        }
        //4- Delete tusuna basin

        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//*[text() = 'Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add remove yazi testi PASSED");
        }else{
            System.out.println("Add remove yazi testi FAILED");
        }

        //6- KAPATİN

        Thread.sleep(2000);
        driver.close();
    }
}
