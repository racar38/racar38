package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"}, // rapor olusturmak icin yazdik
        features = "src/test/resources/features",
        glue = "stepdefinitions", // java kodlarimiz -- javayla baglayan
        tags = "@smoke",
        dryRun = false
)

public class ParalelRunner1 {
}
