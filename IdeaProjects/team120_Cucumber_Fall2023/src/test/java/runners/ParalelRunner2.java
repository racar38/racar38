package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"}, // rapor olusturmak icin yazdik
        features = "src/test/resources/features",
        glue = "stepdefinitions", // java kodlarimiz -- javayla baglayan
        tags = "@amazon",
        dryRun = false
)
public class ParalelRunner2 {
}
