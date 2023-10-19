package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SauceDemoPage;

public class SaucedemoStepdefinitions {

    SauceDemoPage sauceDemoPage = new SauceDemoPage();
    String ilkUrunIsmi;

    @Then("Username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String gecerliusername) {
        sauceDemoPage.userNameBox.sendKeys(gecerliusername);
    }
    @Then("Password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String gecerliPassword) {
        sauceDemoPage.passwordBox.sendKeys(gecerliPassword);
    }
    @Then("Login tusuna basar")
    public void login_tusuna_basar() {
        sauceDemoPage.loginButton.click();
    }
    @When("Ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        ilkUrunIsmi = sauceDemoPage.ilkUrunElement.getText();
        sauceDemoPage.ilkUrunElement.click();
    }
    @When("Add to Cart butonuna basar")
    public void add_to_cart_butonuna_basar() {
        sauceDemoPage.addToCartButton.click();
    }
    @Then("Alisveris sepetine tiklar")
    public void alisveris_sepetine_tiklar() {
        sauceDemoPage.alisverisSepeti.click();
    }
    @Then("Sectigi urunun basarili olarak sepete eklendigini kontrol eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_kontrol_eder() {
        String actualUrunIsmi = sauceDemoPage.sepetUrunElement.getText();

        Assert.assertEquals(ilkUrunIsmi,actualUrunIsmi);
    }
}
