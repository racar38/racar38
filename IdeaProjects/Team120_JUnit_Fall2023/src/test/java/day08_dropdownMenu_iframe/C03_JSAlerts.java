package day08_dropdownMenu_iframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_JSAlerts extends TestBase {

    @Test
    public void test01() {
        //youtube anasayfaya gidin
        driver.get("https://www.youtube.com/");

        // cookies kabul edin

        bekle(5);
    }


    @Test
    public void jsAlertTesti() {

        //2. Test
        // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        // - 1.alert’e tiklayin
        // - Alert’deki yazinin “I am a JS Alert” oldugunu test edin
        // - OK tusuna basip alert’i kapatin

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//*[text()=‘Click for JS Alert’]")).click();

        String actualYazi = driver.switchTo().alert().getText();
        String expectedYazi = "I am a JS Alert";
        Assert.assertEquals(expectedYazi, actualYazi);

        driver.switchTo().alert().accept();
        bekle(5);

    }

    @Test
    public void cancelTesti() {
        //3.Test
        // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        // - 2.alert’e tiklayalim
        // - Cancel’a basip, cikan sonuc yazisinin “You clicked: Cancel” oldugunu test edin

        //  - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        bekle(2);
        //  - 2.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        bekle(2);
        //  - Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        driver.switchTo().alert().dismiss();
        bekle(2);
        String expectedSonucYazisi = "You clicked: Cancel";
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//*[@id='result']"));
        String actualSonucYazisi = sonucYaziElementi.getText();
        Assert.assertEquals(expectedSonucYazisi, actualSonucYazisi);
    }

    @Test
    public void asas() {

        //4.Test
        // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        // - 3.alert’e tiklayalim
        // - Cikan prompt ekranina “Abdullah” yazdiralim
        // - OK tusuna basarak alert’i kapatalim
        // - Cikan sonuc yazisinin Abdullah icerdigini test edelim
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        bekle(2);

        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        bekle(2);
        driver.switchTo().alert().sendKeys("Abdullah");
        bekle(2);
        driver.switchTo().alert().accept();
        bekle(2);

        String expectedSonucYazisi = "Abdullah";
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//*[@id='result']"));
        bekle(2);
        String actualSonucYazisi = sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));


    }

}
