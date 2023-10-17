package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {

    public AutoExercisePage(){

        PageFactory.initElements(Driver.getDriver(),this); //driver ile ilişki kurduk yani driver'i tanıttık
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement singUpLoginButonu;

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement registerName;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement registermail;

    @FindBy (xpath = "//button@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy (id = "id_gender1")
    public WebElement gender1;

    @FindBy (xpath = "//input[@data-qa='password']")
    public WebElement password;

    @FindBy (xpath = "//input[@data-qa='first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@data-qa='last_name']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@data-qa='address']")
    public WebElement address;

    @FindBy (xpath = "//input[@data-qa='state']")
    public WebElement state;

    @FindBy (xpath = "//input[@data-qa='city']")
    public WebElement city;

    @FindBy (xpath = "//input[@data-qa='zipcode']")
    public WebElement zipcode;

    @FindBy (xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumber;

    @FindBy (xpath = "//select[@data-qa='country']")
    public WebElement country;

    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement createAccount;




}
