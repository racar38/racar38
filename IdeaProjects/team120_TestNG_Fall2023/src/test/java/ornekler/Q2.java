package ornekler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Q2 {

    @Test
    public void test01(){

        //1. Test : Amazon ana sayfaya gittiginizi test edin
        Driver.getDriver().get("https://www.amazon.com");

        WebElement amazonLogo=Driver.getDriver().findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(amazonLogo.isDisplayed());


    }
    @Test
    public void test02(){
        //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        //ve aramanizin gerceklestigini Test edin


        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83
        //oldugunu test edin

    }
}
