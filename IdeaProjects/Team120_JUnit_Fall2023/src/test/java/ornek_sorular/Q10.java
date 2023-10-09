package ornek_sorular;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;

public class Q10 extends TestBase {

    @Test
    public void test(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProduct= driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(allProduct.isDisplayed());

        //5. Click on 'View Product' button
        WebElement wiewProduct=driver.findElement(By.xpath("//*[@href='/product_details/1']"));
        wiewProduct.click();

        //6. Verify 'Write Your Review' is visible
        WebElement review=driver.findElement(By.xpath("//li[@class='active']"));
        Assert.assertTrue(review.isDisplayed());

        //7. Enter name, email and review
        Actions actions=new Actions(driver); // locate yerine TAB tusu ile gecis yapmak icin ....
        WebElement name=driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
        name.sendKeys("roger");
        actions.sendKeys(Keys.TAB).sendKeys("rog@hot.com").sendKeys(Keys.TAB).sendKeys("basarili").perform();

        bekle(2);


        //8. Click 'Submit' button
        driver.findElement(By.id("button-review")).click();
        bekle(2);

        //9. Verify success message 'Thank you for your review.'
      // String expectedMessge="Thank you for your review.";
      // String actualMessage=driver.switchTo().alert().getText();
      // System.out.println(actualMessage);
    }
}
