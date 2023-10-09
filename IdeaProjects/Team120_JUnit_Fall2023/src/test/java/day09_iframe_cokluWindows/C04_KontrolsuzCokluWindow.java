package day09_iframe_cokluWindows;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C04_KontrolsuzCokluWindow extends TestBase {

    @Test
    public void cokluPenceTesti() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWhd = driver.getWindowHandle();

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String expectedYazi = "Opening a new window";
        WebElement yaziElementi = driver.findElement(By.tagName("h3"));
        String actualYazi = yaziElementi.getText();
        Assert.assertEquals(expectedYazi, actualYazi);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.

        String expectedTitleIcerik = "The Internet";
        String actualTitleIcerik = driver.getTitle();
        Assert.assertEquals(expectedTitleIcerik, actualTitleIcerik);

        //● Click Here butonuna basın.

        driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
        bekle(2);

        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
         /*
            Bir linke tikladigimizda
            biz newWindow() kullanmadigimiz halde yeni sayfa aciliyorsa
            driver eski sayfada kalir
            yeni sayfada islem yapabilmek icin
            bizim driver'i yeni sayfaya gecirmemiz gerekir.
         */

        Set<String> whdSeti = driver.getWindowHandles();

        System.out.println("ilk sayfa whd : " + ilkSayfaWhd);
        System.out.println("window handles seti : " + whdSeti);
        String ikinciSayfaWhd = "";

        for (String each : whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)) {
                ikinciSayfaWhd = each;
            }
        }
        // artik 2.sayfanin whd'ini bildigimiz icin, ikinci sayfaya gecis yapabiliriz
        driver.switchTo().window(ikinciSayfaWhd);

        String expectedTitleIcerik2 = "New Window";
        String actualTitleIcerik2 = driver.getTitle();
        Assert.assertEquals(expectedTitleIcerik2, actualTitleIcerik2);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.

        String expectedText = "New Window";
        WebElement yaziElementi2 = driver.findElement(By.tagName("h3"));
        String actualText = yaziElementi2.getText();
        Assert.assertEquals(expectedText, actualText);

        //● Bir önceki pencereye geri döndükten sonra
        //  sayfa başlığının “The Internet” olduğunu doğrulayın.
        driver.switchTo().window(ilkSayfaWhd);
        String expected3Title = "The Internet";
        String actual3Title = driver.getTitle();
        Assert.assertEquals(expected3Title, actual3Title);
    }


}

