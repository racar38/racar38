package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {
    @After
    public void tearDown(Scenario scenario){ // failed olursa fotograf ceker passed ise cekmez...
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
    }
}
/*
    Hooks class'i tum scenario'lar icin calisacak
    @Before.... veya @After... notasyonlarina sahip method'lari icerir
    TestNg'deki TestBase class'lari gibidir
    Ancak TestNG'de TestBase class'ini ISTERSEK extends diyerek kullanabiliyorduk
    istemezsek kullanmiyorduk
    Cucumber yapisi geregi stepdefinitions package'i altinda
    @Before... veya @After... olursa
    her Scenario icin calisacaktir
    Bundan dolayi ozel bir durum yoksa
    Hooks class'ini sadece screenshot icin kullanacagiz
 */
