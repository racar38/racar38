package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class ShiftDeletePage {

    public  ShiftDeletePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@aria-label='Oynat']")
    public WebElement playButonu;

    @FindBy(xpath = "//a[@class='ytp-watermark yt-uix-sessionlink']")
    public WebElement youtubeLogo;

    @FindBy(xpath = "//*[@id=\"logo-icon\"]/yt-icon-shape")
    public WebElement youtubeResmi;

    @FindBy(xpath = "(//input[@name='keywords'])[2]")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//iframe[@class='latestVideoEmbed']")
    public WebElement iframe;
}
