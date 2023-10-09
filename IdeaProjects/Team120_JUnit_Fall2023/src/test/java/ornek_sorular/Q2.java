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

import java.time.Duration;

public class Q2 {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://youtube.com/");
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void urlTest(){

         String expectedTitle="YouTube";
         String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Test
    public void imageTest(){

        WebElement imageYouTube= driver.findElement(By.xpath("(//div[@class='style-scope ytd-topbar-logo-renderer'])[1]"));
        Assert.assertTrue(imageYouTube.isDisplayed());

    }
    @Test
    public void SearchBoxTest(){

        WebElement SearchBox= driver.findElement(By.xpath("//div[@id='search-input']"));
        Assert.assertTrue(SearchBox.isEnabled());

    }
    @Test
    public void wrongTitleTest(){
        String UnexpectedIcerik="youtube";
        String actualTitle=driver.getTitle();

        Assert.assertFalse(UnexpectedIcerik.contains(actualTitle));
    }
}
