package ornek_sorular;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class Q9 extends TestBase {

    @Test
    public void test() throws IOException {
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // Nutella icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // Sonuclarin Nutella icerdigini test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        // rapor icin sayfanin fotografini cekin
        // 1.adim TakeScreenshot objesi olusturma
        TakesScreenshot tsss= (TakesScreenshot) driver;
        File srcFile= tsss.getScreenshotAs(OutputType.FILE);
        File destFile=new File("target/screenShots/screenshot.png");
        FileUtils.copyFile(srcFile,destFile);
        driver.quit();
    }
}
