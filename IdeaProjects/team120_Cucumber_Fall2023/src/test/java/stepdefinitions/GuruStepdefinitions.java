package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepdefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslik) {

        int istenenSutunIndexi=0;

        List<WebElement> headerElementListesi = guruPage.basliklarListesi;

        for (int i = 0; i < headerElementListesi.size() ; i++) {

            if (headerElementListesi.get(i).getText().equals(istenenBaslik)){
                istenenSutunIndexi = i+1 ;
            }
        }

        // //tr/td[    1    ]

        String dinamikSutunXpath = "//tr/td[" + istenenSutunIndexi + "]";


        List<WebElement> istenenSutunElementleriList =
                Driver.getDriver().findElements(By.xpath(dinamikSutunXpath));


        for (int i = 0; i <istenenSutunElementleriList.size() ; i++) {

            System.out.println(istenenSutunElementleriList.get(i).getText());
        }
    }
}
