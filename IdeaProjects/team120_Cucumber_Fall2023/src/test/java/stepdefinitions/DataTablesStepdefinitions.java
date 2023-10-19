package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablesPage;
import utilities.ReusableMethods;

public class DataTablesStepdefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButton.click();
    }
    @Then("firstname kutusuna examples'dan {string} bilgisi girer")
    public void firstname_kutusuna_examples_dan_bilgisi_girer(String isim) {
        dataTablesPage.firstNameButton.sendKeys(isim);
    }
    @Then("lastname kutusuna examples'dan {string} yazar")
    public void lastname_kutusuna_examples_dan_yazar(String soyisim) {
        dataTablesPage.lastNameButton.sendKeys(soyisim);
    }
    @Then("position kutusuna examples'dan {string} yazar")
    public void position_kutusuna_examples_dan_yazar(String isunvan) {
        dataTablesPage.positionButton.sendKeys(isunvan);
    }
    @Then("ofis kutusuna examples'dan {string} yazar")
    public void ofis_kutusuna_examples_dan_yazar(String ulkeadi) {
        dataTablesPage.officeButton.sendKeys(ulkeadi);
    }
    @Then("extension kutusuna examples'dan {string} yazar")
    public void extension_kutusuna_examples_dan_yazar(String iladi) {
        dataTablesPage.extensionButton.sendKeys(iladi);
    }
    @Then("start date kutusuna examples'dan {string} yazar")
    public void start_date_kutusuna_examples_dan_yazar(String isebaslamatarihi) {
        dataTablesPage.startDateButton.sendKeys(isebaslamatarihi);
    }
    @Then("salary kutusuna examples'dan {string} yazar")
    public void salary_kutusuna_examples_dan_yazar(String maas) {
        dataTablesPage.salaryButton.sendKeys(maas);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButton.click();
        ReusableMethods.bekle(2);
    }


    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String isim) {
        dataTablesPage.searchButton.click();
        dataTablesPage.searchButton.sendKeys(isim);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {

        String actualIlkYazi = dataTablesPage.tableIlkYaziElementi.getText();
        Assert.assertTrue(actualIlkYazi.contains(isim));
    }
}
