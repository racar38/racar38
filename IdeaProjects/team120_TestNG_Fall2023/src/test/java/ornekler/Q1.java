package ornekler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Q1 {

    //Bir class oluşturun: YoutubeAssertions
    //1) https://www.youtube.com adresine gidin
    //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
    //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    @Test
    public void titleTest(){
        Driver.getDriver().get("https://www.youtube.com");

        String expectedTitleIcerik="YouTube";
        String actualTitleIcerik=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));
    }

    @Test
    public void imageTest(){
       // WebElement youtubeImage=Driver.getDriver().findElement(By.xpath("((//*[@id='logo-icon'])[1]"));

       // Assert.assertTrue(youtubeImage.isDisplayed());

    }
    @Test
    public void searchBox(){
       // Driver.getDriver().findElement(By.xpath("//div[@class='ytd-searchbox-spt']")).isEnabled();


    }
    @Test
    public void wrongTitleTest(){

        String unExpectedTitleIcerik="youtube";
        String actualTitleIcerik2=Driver.getDriver().getTitle();

        Assert.assertFalse(actualTitleIcerik2.contains(unExpectedTitleIcerik));

    }

}
