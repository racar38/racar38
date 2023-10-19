package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuAppPage {

    public HerokuAppPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[text()='Add Element']")
    public WebElement AddElementButonu;


    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteButonu;

}
