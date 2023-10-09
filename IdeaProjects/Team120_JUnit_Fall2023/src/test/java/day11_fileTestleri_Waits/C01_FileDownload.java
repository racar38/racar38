package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileDownload extends TestBase {

    @Test
    public void indirmeTesti(){

        //  C:\Users\Hp\OneDrive\Masaüstü

        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        //3. logo.jpg dosyasını indirelim
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.xpath("//a[text()='logo.jpg']")).click();

        String dosyaYolu="\\Users\\Hp\\Downloads\\logo.jpg";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }
}
