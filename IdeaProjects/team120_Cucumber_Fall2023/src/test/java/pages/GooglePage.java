package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='gLFyf']")
    public WebElement googleAramaKutusu;

    @FindBy(xpath = "//div[@id='result-stats']")
    public WebElement googleSonucYaziElementi;


}
