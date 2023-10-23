package pages;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.ObjectInputFilter;

public class AmazonPage {
    /*
        TestNG'de page class'lari
        surekli kullandigimiz bir sayfa/webSitesi'ndeki
        locate'leri ve
        ilgili sayfada kullanilacak login gibi basit method'lari icerir

        TestNG page class'larindaki locate'lere erisim icin
        Test class'larinda page class'indan obje olusturulmasini benimsemistir.
     */

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   // @FindBy(id ="twotabsearchtextbox")
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    public WebElement ilkUrunIsimElementi;

    @FindBy(xpath = "//*[@id='searchDropdownBox']")
    public WebElement dropDownElementi;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement dropDownElement;
    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement ikinciElement;

    @FindBy(xpath = "//span[@id='productTitle']")

    public WebElement ikinciUrunIsimElement;

    @FindBy(xpath = "(//span[@class='a-offscreen'])[3]")
    public WebElement ikinciUrunFiyatElementi;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButonu;
}
