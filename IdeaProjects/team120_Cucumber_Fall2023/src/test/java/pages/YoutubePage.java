package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {
    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='style-scope ytd-topbar-logo-renderer'])[1]")
    public WebElement ikinciSayfaYoutubeLogoElementi;
}
