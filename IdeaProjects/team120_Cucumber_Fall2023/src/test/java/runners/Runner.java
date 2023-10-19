package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"}, // rapor olusturmak icin yazdik
        features = "src/test/resources/features",
        glue = "stepdefinitions", // java kodlarimiz -- javayla baglayan
        tags = "@smoke",
        dryRun = false
)
public class Runner {

    /*
    Runner class'i bos bir class'dir.

    bu class'da asil isi
    Class'da kullandigimiz 2 notasyon yapar

    dryRun=true secildiginde
    Runner istenen feature/scenario'yu calistirmaya degil
    eksik adimlari bulmaya odaklanir

    eger eksik adim yoksa
    test PASSED der.
    ama bu testin calisip,tum adimlarin gectigini gostermez
    SADECE eksik adim olmadigini gosterir

    EGER eksik adim bulma amacimiz yoksa testlerimizi normal calistirmak istiyorsak
    dryRun=false secilmelidir

    rapor alabilmek icin Runner dan calistirmak gerekir
     */



    // Biz " " olarak yazdigimizda bunu parametre oalrak algilar cucumber
    // rakami bu sekilde belirtmeye gerek yoktur rakamlari direk parametre oarak algilar
}
