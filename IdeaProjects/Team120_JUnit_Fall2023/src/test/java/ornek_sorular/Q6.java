package ornek_sorular;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q6 extends TestBase {

    @Test
    public void actionsTest(){

        //             Actions Class Homework
        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        //2. "Hover over Me First" kutusunun ustune gelin
        //3. "Link 1" e tiklayin
        //4. Popup mesajini yazdirin
        //5. Popup'i tamam diyerek kapatin
        //6. "Click and hold" kutusuna basili tutun
        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        //8. "Double click me" butonunu cift tiklayin

        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin
        Actions actions=new Actions(driver);
        WebElement HoveroverMeFirst= driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        actions.moveToElement(HoveroverMeFirst).perform();

        //3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[@class='list-alert'])[1]")).click();

        //4. Popup mesajini yazdirin
        System.out.println("Popup mesajı: " + driver.switchTo().alert().getText());

        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //6. "Click and hold" kutusuna basili tutun
        WebElement clickAndHold= driver.findElement(By.id("click-box"));
        actions.clickAndHold(clickAndHold).perform();

        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println("Click and hold kutusundaki yazı: " +clickAndHold.getText());

        //8. "Double click me" butonunu cift tiklayin
        WebElement doubleClickMe=driver.findElement(By.xpath("//div[@id='double-click']"));
        actions.doubleClick(doubleClickMe).perform();
        bekle(5);

        // sayfayi kapatin
        driver.quit();










    }
}
