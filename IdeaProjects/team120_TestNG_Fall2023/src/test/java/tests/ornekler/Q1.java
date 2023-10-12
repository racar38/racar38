package tests.ornekler;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftDeletePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Q1 {

    @Test
    public void test01(){

        //TASK03:
        //1- https://forum.shiftdelete.net/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("shiftDeleteUrl"));
        String ilkSayfaWhd=Driver.getDriver().getWindowHandle();
        ReusableMethods.bekle(1);

        //2- Youtube videosunun ortasındaki play logosuna tıklayın.
        ShiftDeletePage shiftDeletePage=new ShiftDeletePage();
        Driver.getDriver().switchTo().frame(shiftDeletePage.iframe);
        ReusableMethods.bekle(1);

        shiftDeletePage.playButonu.click();
        ReusableMethods.bekle(1);

        //3- videoda sağ alttaki youtube logosuna tıklayın.
        shiftDeletePage.youtubeLogo.click();
        ReusableMethods.bekle(1);

        //4- Yeni sayfa açıldığını test edin
        //Driver.getDriver().switchTo().defaultContent();
        if (Driver.getDriver().getWindowHandles().size() == 2) {
            System.out.println("Yeni sayfa başarıyla açıldı.");
        } else {
            System.err.println("Yeni sayfa açılamadı.");
        }


        //5- İlk Sayfaya dönerek bu sayfada arama kutusunun görünür olduğunu test edin.
        Driver.getDriver().switchTo().window(ilkSayfaWhd);
        ReusableMethods.bekle(1);
        Assert.assertTrue(shiftDeletePage.aramaKutusu.isDisplayed());

        Driver.closeDriver();


    }
}
