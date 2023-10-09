package ornek_sorular;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class Q1 {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");

    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void urlTest(){

        String expectedUrl="https://www.bestbuy.com/";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Test
    public void titleTest(){

        String UnexpectedIcerik="Rest";
        String actualTitle= driver.getTitle();

        Assert.assertFalse(actualTitle.contains(UnexpectedIcerik));


    }
    @Test
    public  void logoTest(){

        WebElement logoElementi=driver.findElement(By.xpath("(//img[@class='logo'])[1]"));

       Assert.assertTrue(logoElementi.isDisplayed());
    }
    @Test
    public void linkTest(){
        WebElement francaisLinkElementi=driver.findElement(By.xpath("//button[@lang='fr']"));

        Assert.assertTrue(francaisLinkElementi.isDisplayed());

    }
}
