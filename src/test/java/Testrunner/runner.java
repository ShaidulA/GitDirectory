package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\Users\\owner\\Workspace\\Shaidul\\Nexxvali\\cucumber\\Cucumber_BDD\\src\\test\\resouce\\Features"
		,glue="stepDefinition"
		,monochrome=true
		,tags="@unrequired"
		,plugin={"usage","html:C:\\Users\\owner\\Workspace\\Shaidul\\Nexxvali\\cucumber\\Cucumber_BDD\\target\\report.html"}
		)


public class runner extends AbstractTestNGCucumberTests {

}
