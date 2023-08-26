package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src\\test\\resources\\appFeatures\\login.feature"},
		glue = {"Steps"}
		)
public class loginRunner extends AbstractTestNGCucumberTests
{
	String aa="";
	

}
