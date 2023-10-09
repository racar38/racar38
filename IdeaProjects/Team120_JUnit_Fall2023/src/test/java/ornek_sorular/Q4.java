package ornek_sorular;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;

import static utilities.TestBase_BeforeClass.bekle;

public class Q4  extends TestBase {



    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'New User Signup!' is visible
    //6. Enter name and email address
    //7. Click 'Signup' button
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //9. Fill details: Title, Name, Email, Password, Date of birth
    //10. Select checkbox 'Sign up for our newsletter!'
    //11. Select checkbox 'Receive special offers from our partners!'
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //13. Click 'Create Account button'
    //14. Verify that 'ACCOUNT CREATED!' is visible
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    WebDriver driver;
    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationexercise.com");

        driver.findElement(By.xpath("(//a[@href=\"/\"])[2]")).isDisplayed();
        bekle(2);

        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
        bekle(2);

        String expectedIcerik = "New User Signup!";
        String actualIcerik = driver.findElement(By.xpath("//*[text()='New User Signup!']")).getText();

        Assert.assertEquals(expectedIcerik, actualIcerik);


        WebElement name = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));


        WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));


        name.sendKeys("racar");
        email.sendKeys("ac123@hotmail.com");
        bekle(2);

        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();


        bekle(2);

        driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed();


    }

    }
