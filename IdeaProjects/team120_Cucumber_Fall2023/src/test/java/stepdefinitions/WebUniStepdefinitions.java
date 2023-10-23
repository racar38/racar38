package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUniPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniStepdefinitions {

    WebUniPage webUniPage = new WebUniPage();
    String ilkSayfaWHD;

    @Then("Login Portal a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        // login portal'a kadar asagi indigimizde click problem oldugundan
        // contact us butonuna kadar asagi indik
        ilkSayfaWHD = Driver.getDriver().getWindowHandle();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",webUniPage.contactUsButonu);
        ReusableMethods.bekle(2);
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        webUniPage.loginPortalButonu.click();
    }
    @Then("Diger window'a gecer")
    public void diger_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }
    @Then("username ve  password kutularina faker ile deger yazdirir")
    public void username_ve_password_kutularina_faker_ile_deger_yazdirir() {
        Faker faker = new Faker();
        webUniPage.usernameKutusu.sendKeys(faker.name().username());
        webUniPage.passwordKutusu.sendKeys(faker.internet().password());

    }
    @Then("webUni login butonuna basar")
    public void web_uni_login_butonuna_basar() {
        webUniPage.loginButonu.click();
    }
    @Then("Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        ReusableMethods.bekle(1);
        String expectedAlertYazisi = "validation failed";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @When("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.bekle(4);
        Driver.getDriver().switchTo().window(ilkSayfaWHD);
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        String expectedIlkSayfaUrl = "http://webdriveruniversity.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedIlkSayfaUrl,actualUrl);
    }

    @And("sayfalari kapatir")
    public void sayfalariKapatir() {
        Driver.quitDriver();
    }

    @Given("ourProduct linkine tiklamak icin iFrame'e gecis yapar")
    public void our_product_linkine_tiklamak_icin_i_frame_e_gecis_yapar() {
        Driver.getDriver().switchTo().frame(webUniPage.iFrameElementi);
    }
    @Given("Our Products butonuna basar")
    public void our_products_butonuna_basar() {
        webUniPage.ourProductLinki.click();
    }
    @Then("acilan sayfada Cameras'i tiklar")
    public void acilan_sayfada_cameras_i_tiklar() {
        webUniPage.camerasElementi.click();
    }
    @Then("Popup mesajini yazdirir")
    public void popup_mesajini_yazdirir() {
        System.out.println(webUniPage.alertYaziElementi.getText());
    }
    @Then("close butonuna basar")
    public void close_butonuna_basar() {
        webUniPage.alertKapatButonu.click();
    }
    @Then("iFrame'den cikis yapar")
    public void i_frame_den_cikis_yapar() {
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("WebdriverUniversity.com \\(IFrame) linkini tiklar")
    public void webdriver_university_com_i_frame_linkini_tiklar() {
        webUniPage.webDriverLinki.click();
    }

    @And("acilan sayfa url'inin {string} oldugunu test eder")
    public void acilanSayfaUrlIninOldugunuTestEder(String expectedUrl) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}