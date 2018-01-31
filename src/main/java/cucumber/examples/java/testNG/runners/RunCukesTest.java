package cucumber.examples.java.testNG.runners;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Please notice that cucumber.examples.java.testNG.stepDefinitions.BeforeAfterHooks class
 * is in the same package as the steps definitions.
 * It has two methods that are executed before or after scenario.
 * I'm using it to delete cookies and take a screenshot if scenario fails.
 */
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;
import gherkin.formatter.model.Feature;

public class RunCukesTest {
	private TestNGCucumberRunner test;
	/**
	 * 
	 */
	/**
	 * 
	 */
	@Test()
	@Parameters({"browserName","OSName","features"})
	public void runFeatures(String browserName,String OSName,String features) {
		try {
			String[] featureset=features.split(",");
			System.out.println("Run Initiated");
			String[] args = {"-g","cucumber.examples.java.testNG.stepDefinitions","-p","html:target/cucumber-report/"+browserName+"_"+OSName,"-p","json:target/cucumber-report/"+browserName+"_"+OSName+"/cucumber.json"};
			args=(String[])ArrayUtils.addAll(featureset,args);
			cucumber.api.cli.Main.run(args, Thread.currentThread().getContextClassLoader());
			System.out.println("Run Terminated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}