package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {

    public DataTablesPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='New']")
    public WebElement newButton;


    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameButton;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameButton;
    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionButton;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeButton;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionButton;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateButton;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryButton;


    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@*='search']")
    public WebElement searchButton;


    @FindBy(xpath = "(//tr/td)[2]")
    public WebElement tableIlkYaziElementi;

}