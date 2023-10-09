package ornek_sorular;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q7 extends TestBase {

    @Test
    public void test(){

        //1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        //2. “Our Products” butonuna basin
        //3. “Cameras product”i tiklayin
        //4. Popup mesajini yazdirin
        //5. “close” butonuna basin
        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin

        //1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2. “Our Products” butonuna basin
        // IFRAME'E GECIS YAPILDI
        WebElement iFrame= driver.findElement(By.xpath("//*[@src='../Page-Object-Model/index.html']"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("//a[@href='products.html']")).click();
        bekle(2);

        //3. “Cameras product”i tiklayin
        driver.findElement(By.xpath("(//p[@class='sub-heading'])[2]")).click();
        bekle(2);

        //4. Popup mesajini yazdirin
        System.out.println("Popup mesaji : " + driver.findElement(By.tagName("h4")).getText());

        //5. “close” butonuna basin
        driver.findElement(By.xpath("//button[@class='btn btn-default'][2]")).click();

        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        //ONCE IFRAME'DEN CIKIS YAPILDI
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("WebdriverUniversity.com (IFrame)")).click();

        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String expectedUrl="http://webdriveruniversity.com/index.html";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        driver.close();



    }
}
