package day09_iframe_cokluWindows;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_CokluPencere extends TestBase {

    // amazon ana sayfaya gidip url'in amazon icerdigini test edin
   // yeni bir tab'da wisequarter.com'a gidin ve url'in wise icerdigini test edin
   // yeni bir pencere olarak youtube'a gidin ve url'in youtube icerdigini test edin
   // wisequarter'in acik oldugu sayfaya donup title'in Wise icerdigini test edin
   // Amazon'un acik oldugu sayfaya donun ve Title'in Amazon icerdigini test edin


    @Test
    public void test(){
        // amazon ana sayfaya gidip url'in amazon icerdigini test edin
        driver.get("https://www.amazon.com");
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        String amazonWhd= driver.getWindowHandle(); // amazon sayfasının handle degeri

        // yeni bir tab'da wisequarter.com'a gidin ve url'in wise icerdigini test edin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        expectedUrl="wise";
        actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        String wiseWhd= driver.getWindowHandle();    // wisequarter sayfasinin handle degeri

        // yeni bir pencere olarak youtube'a gidin ve url'in youtube icerdigini test edin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        expectedUrl="youtube";
        actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        // wisequarter'in acik oldugu sayfaya donup title'in Wise icerdigini test edin

        driver.switchTo().window(wiseWhd); // handledegeri ile sayfaya geri dönüş yaptık
        String expectedTitleIcerik="Wise";
        String actualTitleIcerik= driver.getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));

        // Amazon'un acik oldugu sayfaya donun ve Title'in Amazon icerdigini test edin

        driver.switchTo().window(amazonWhd);
         expectedTitleIcerik="Amazon";
         actualTitleIcerik= driver.getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));






    }
}


