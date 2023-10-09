package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_DinamikDosyaYoluOlusturma {

    @Test
    public void test01(){

        //masaustumuzde bulunan logo.jpg dosyasının varligini
        // dinamik dosya yolu kullanarak test edelim

        //C:\Users\Hp\OneDrive\Masaüstü


        //           " \\Users\\Hp\\ "    +   " Downloads\\logo.jpg "
        //              ana dosya yolu           herkeste ayni olan kisim

        String dinamikDosyaYolu = System.getProperty("user.home") + " /Desktop/logo.jpg " ;

        System.out.println(dinamikDosyaYolu);

       // Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

        System.out.println(System.getProperty("user.dir"));

        // C:\Users\Hp\IdeaProjects\Team120_JUnit_Fall2023
        // \src\test\java\day11_fileTestleri_Waits\text.txt

        String dinamikTextDosyaYolu=System.getProperty("user.dir") +
               "\\src\\test\\java\\day11_fileTestleri_Waits\\text.txt";

        Assert.assertTrue(Files.exists(Paths.get(dinamikTextDosyaYolu)));

    }
}
