package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\owner\\Workspace\\Shaidul\\Nexxvali\\cucumber\\Cucumber_BDD\\src\\test\\resouce\\Features\\login.feature",
		glue="stepDefinition"
		)


public class runner_Class {

}
