package ornek_sorular;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q5 extends TestBase {

    @Test
    public void test02(){

        //1. http://zero.webappsecurity.com/ Adresine gidin
        // 2. Sign in butonuna basin
        // 3. Login kutusuna “username” yazin
        // 4. Password kutusuna “password” yazin
        // 5. Sign in tusuna basin, back tusuna basarak sayfaya donun
        // 6. Online banking menusunden Pay Bills sayfasina gidin
        //7. “Purchase Foreign Currency” tusuna basin
        //8. “Currency” drop down menusunden Eurozone’u secin
        //9. “amount” kutusuna bir sayi girin
        //10. “US Dollars” in secilmedigini test edin
        //11. “Selected currency” butonunu secin
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.

        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.xpath("//i[@class='icon-signin']")).click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();

        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        driver.findElement(By.linkText("Purchase Foreign Currency")).click();

        WebElement dropdown= driver.findElement(By.xpath("//select[@id='pc_currency']"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Eurozone (euro)");

        driver.findElement(By.xpath("//input[@id='pc_amount']")).sendKeys("10");

        WebElement dolars= driver.findElement(By.xpath("(//label[@class='radio inline'])[2]"));

        Assert.assertFalse(dolars.isSelected());

        driver.findElement(By.xpath("(//label[@class='radio inline'])[3]")).click();

        driver.findElement(By.id("pc_calculate_costs")).click();
        driver.findElement(By.id("purchase_cash")).click();

//13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin
        String expectedYazi="Foreign currency cash was successfully purchased.";
        String actualYazi=driver.findElement(By.xpath("//div[@id='alert_content']")).getText();

        Assert.assertEquals(expectedYazi,actualYazi);

        driver.close();

    }
}
