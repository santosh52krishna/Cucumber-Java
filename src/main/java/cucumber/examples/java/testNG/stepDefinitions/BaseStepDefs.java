package cucumber.examples.java.testNG.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.galenframework.reports.GalenTestInfo;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by amit.rawat on 21/12/15.
 */
public class BaseStepDefs {
	static WebDriver driver = null;
	public static List<GalenTestInfo> tests;
	public static String currentBrowser;
	public static String currentOS;
	static Scenario s;
    
	@Before()
    public void before(Scenario scenario) {
		s=scenario;
        scenario.getId();
        System.out.println("This is before Scenario: " + scenario.getName().toString());
        //  driver = new FirefoxDriver();
        System.out.println("Driver Initated");
        //tests = new LinkedList<GalenTestInfo>();
    }

    @After
    public void after(Scenario scenario) throws IOException {
        System.out.println("This is after Scenario: " + scenario.getName().toString());
        //driver.close();
       // driver.quit();
       // new HtmlReportBuilder().build(tests, "target/galen-html-reports"); 
   }
}
