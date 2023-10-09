package ornek_sorular;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.Set;

public class Q8 extends TestBase {

    @Test
    public void test(){

        //1."http://webdriveruniversity.com/" adresine gidin
        //2."Login Portal" a kadar asagi inin
        //3."Login Portal" a tiklayin
        //4.Diger window'a gecin
        //5."username" ve "password" kutularina deger yazdirin
        //6."login" butonuna basin
        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        //8.Ok diyerek Popup'i kapatin
        //9.Ilk sayfaya geri donun
        //10.Ilk sayfaya donuldugunu test edin

        //1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");
        String ilkSayfaWhd= driver.getWindowHandle(); // sayfalar arasi gecis yapmak icin Handle edildi...

        //2."Login Portal" a kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //3."Login Portal" a tiklayin
        driver.findElement(By.xpath("(//div[@class='section-title'])[2]")).click();

        //4.Diger window'a gecin
        Set<String> whdSeti=driver.getWindowHandles();
        String ikinciSayfaWhd="";
        for (String each:whdSeti
             ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        // artik 2. sayfanin Whd bilindiği icin sayfalar arası gecisler yapabiliriz...
        driver.switchTo().window(ikinciSayfaWhd);

        //5."username" ve "password" kutularina deger yazdirin
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        Faker faker=new Faker();
        actions.click(userName).sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).perform();

        //6."login" butonuna basin
        driver.findElement(By.id("login-button")).click();

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        System.out.println("Popup mesaji : " +driver.switchTo().alert().getText()); // kontrol amacli yazdirdim
        String expectedYazi="validation failed";
        String actualYazi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        //8.Ok diyerek Popup'i kapatin
        driver.switchTo().alert().accept();

        //9.Ilk sayfaya geri donun
        driver.switchTo().window(ilkSayfaWhd);

        //10.Ilk sayfaya donuldugunu test edin
        // WebdriverUniversity.com (New Approach To Learning) ilk sayfadaki bu yazinin oldugunu test ettim
        driver.findElement(By.id("nav-title")).isDisplayed();

        bekle(2);
        driver.quit();

    }
}
