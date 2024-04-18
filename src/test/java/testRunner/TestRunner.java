package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//FeatureFiles/"},
					//features= {"@target/rerun.txt"},
					glue="stepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html", 
							 "rerun:target/rerun.txt",
							 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
							dryRun=false,    // checks mapping between scenario steps and step definition methods
							monochrome=true,    // to avoid junk characters in output
							publish=true   // to publish report in cucumber server
							
							//tags="@smoke"  //this will execute scenarios with sanity tag
							//tags="@regression" //this will execute scenarios with regression tag
							//tags="@functional" //this will execute scenarios with functional tag
							//tags="@smoke and @regression" //this will execute scenarios with sanity and regression tag
							//tags="@smoke or @regression" //this will execute scenarios with sanity or regression tag
			)
					
public class TestRunner extends AbstractTestNGCucumberTests {

 }
