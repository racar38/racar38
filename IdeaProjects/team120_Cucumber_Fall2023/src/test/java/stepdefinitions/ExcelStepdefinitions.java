package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelStepdefinitions {
    String dosyaYolu = "src/test/resources/ulkeler.xlsx";
    FileInputStream fis;
    Workbook workbook;
    Sheet sayfa1;
    FileOutputStream fos;


    @Given("kullanici ulkeler excelinde Sayfa1'e kadar ayarlari yapar")
    public void kullanici_ulkeler_excelinde_sayfa1_e_kadar_ayarlari_yapar() throws IOException {
        fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);
        sayfa1 = workbook.getSheet("Sayfa1");
    }

    @Then("{int}.sutunu olusturur")
    public void sutunu_olusturur(Integer sutunNo) {
        // excel'de sutun olusturulmaz, her bir satir icin 5.hucre olusturulur
    }

    @Then("baslik satirinda besinci hucreye yeni bir cell olusturur")
    public void baslik_satirinda_besinci_hucreye_yeni_bir_cell_olusturur() {
        sayfa1.getRow(0).createCell(4);
    }

    @Then("Olusturdugu hucreye {string} yazdirir")
    public void olusturdugu_hucreye_yazdirir(String sutunBasligi) {
        sayfa1.getRow(0).getCell(4).setCellValue(sutunBasligi);
    }

    @Then("{int}.satir ulke nufusu kolonuna {int} yazdirir")
    public void satir_ulke_nufusu_kolonuna_yazdirir(Integer satirNo, Integer ulkeNufus) {
        sayfa1.getRow(satirNo - 1).createCell(4).setCellValue(ulkeNufus);
    }

    @Then("Dosyayi kaydeder")
    public void dosyayi_kaydeder() throws IOException {
        fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
    }

    @Then("stream'leri kapatir")
    public void stream_leri_kapatir() throws IOException {
        workbook.close();
        fis.close();
        fos.close();
    }

    @Then("excel'de {int}.satirin ulke nufusunun {int} oldugunu test eder")
    public void excel_de_satirin_ulke_nufusunun_oldugunu_test_eder(Integer satirNo, Integer expectedNufus) {

        Integer actualNufus = (int) (sayfa1.getRow(satirNo - 1).getCell(4).getNumericCellValue());

        Assert.assertEquals(expectedNufus, actualNufus);

    }
}