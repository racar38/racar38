package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "s",
        dryRun = false
)
public class Runner {

    /*
    Runner class'i bos bir class'dir.

    bu class'da asil isi
    Class'da kullandigimiz 2 notasyon yapar
     */
}
