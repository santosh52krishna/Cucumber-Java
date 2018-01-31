package cucumber.examples.java.testNG.stepDefinitions;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;

public class Configuration {
	static List<GalenTestInfo> tests;
    @BeforeSuite
    public void SuiteSetUp(){
    	System.out.println("SuiteSetUp Started");
          // Creating a list of tests
          tests = new LinkedList<GalenTestInfo>();
          System.out.println("SuiteSetUp End");
    }
    @AfterSuite
    public void CloseSuite() throws IOException{
    	System.out.println("SuiteClose Started");
    	  // Exporting all test reports to html
        new HtmlReportBuilder().build(tests, "target/galen-html-reports"); 
    	System.out.println("After Suite For Amazon Layout is Triggered");
   	
    }

}
