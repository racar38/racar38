package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    public WebElement ilkUrunElement;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addToCartButton;

    @FindBy(xpath= "//div[@id='shopping_cart_container']")
    public WebElement alisverisSepeti;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement sepetUrunElement;
}
