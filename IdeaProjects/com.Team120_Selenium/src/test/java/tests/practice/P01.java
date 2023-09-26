package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    public static void main(String[] args) throws InterruptedException {

        /*
   /....Exercise-1:...
    Create a new class with main method
    Set Path
    Create a chrome driver
    Maximize window
    Open google home page https://www.google.com
    On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
    Wait about 4 sn
    Navigate forward to amazon
    Refresh page
    Close/quit the browser
    And Last step print "All is well" on console
  */
        //   Set Path
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");

        //   Create a chrome driver
        WebDriver driver =new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        //  Open google home page https://www.google.com
        driver.get("https://www.google.com/");

        // On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();

        //Wait about 4 sn
        Thread.sleep(4000);

        //Navigate forward to amazon
        driver.navigate().forward();

        //Refresh page
        driver.navigate().refresh();

        //Close/quit the browser
        driver.close();

        // And Last step print "All is well" on console
        System.out.println("All is well");





    }
}
