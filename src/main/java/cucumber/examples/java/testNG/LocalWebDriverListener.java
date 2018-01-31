package cucumber.examples.java.testNG;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.IClass;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.BaseTestMethod;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlTest;

import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

import cucumber.examples.java.testNG.stepDefinitions.BaseStepDefs;


/**
 * Based on the LocalDriverFactory found at: onrationaleemotions.wordpress.com
 * @author: Confusions Personified
 * @src: http://rationaleemotions.wordpress.com/2013/07/31/parallel-webdriver-executions-using-testng/
 */
public class LocalWebDriverListener implements IInvokedMethodListener,ISuiteListener,ITestContext,ITestListener  {

    static Logger log = Logger.getLogger(LocalWebDriverListener.class);
   

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        log.debug("BEGINNING: org.stng.jbehave.LocalWebDriverListener.beforeInvocation");
        if (method.isTestMethod()) {
            // get browser name specified in the TestNG XML test suite file
            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
            String OSName=method.getTestMethod().getXmlTest().getLocalParameters().get("OSName");
		//	BaseStepDefs.currentBrowser=browserName;
			//BaseStepDefs.currentOS=OSName;
            // get and set new instance of local WebDriver
            log.info("getting driver for: " + browserName);
            WebDriver driver;
			try {
				driver = LocalDriverFactory.createInstance(browserName);
		        DriverManager.setWebDriver(driver);
	            log.info("Done! Created "+ browserName + " driver!" );
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            log.warn("Provided method is NOT a TestNG testMethod!!!");
        }
        log.debug("END: org.stng.jbehave.LocalWebDriverListener.beforeInvocation");
    }
    


    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        log.debug("BEGINNING: org.stng.jbehave.LocalWebDriverListener.afterInvocation");
        if (method.isTestMethod()) {
            try {
                String browser = DriverManager.getBrowserInfo();
                // change the name of the test method that will appear in the report to one that will contain
                // also browser name, version and OS.
                // very handy when analysing results.
                BaseTestMethod bm = (BaseTestMethod)testResult.getMethod();
                Field f = bm.getClass().getSuperclass().getDeclaredField("m_methodName");
                f.setAccessible(true);
                String newTestName = testResult.getTestContext().getCurrentXmlTest().getName() + " - " + bm.getMethodName() + " - " + browser;
                log.info("Renaming test method name from: '" + bm.getMethodName() + "' to: '" + newTestName + "'");
                f.set(bm, newTestName);
            } catch (Exception ex) {
                System.out.println("afterInvocation exception:\n" + ex.getMessage());
                ex.printStackTrace();
            } finally {
                // close the browser
                WebDriver driver = DriverManager.getDriver();
                if (driver != null) {
                    driver.quit();
                }
            }
        }
        log.debug("END: org.stng.jbehave.LocalWebDriverListener.afterInvocation");
    }
    
    @Override
	public void onTestStart(ITestResult result) {
    	System.out.println(result.getMethod().getXmlTest().getParameter("browserName"));
    			BaseStepDefs.currentBrowser=result.getMethod().getXmlTest().getParameter("browserName");
    			BaseStepDefs.currentOS=result.getMethod().getXmlTest().getParameter("OSName");
		//System.out.println("Start suite " + suite.getName());
		//BaseStepDefs.tests=new LinkedList<GalenTestInfo>();
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Finish suite " + suite.getName());
		 try {
			new HtmlReportBuilder().build(BaseStepDefs.tests, "target/galen-html-reports");
			//commented by me
			/*try{
				CreateACollectionInDataBase();
				writeResultstoMongoDB();
			}
			catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	private void writeResultstoMongoDB() throws IOException, ParseException {
		ReportUtils.CreateReportAndSaveToDataBase();
			
	}
	//commente by me
	/*public void CreateACollectionInDataBase() throws UnknownHostException{
		Mongo mongo = new Mongo("localhost", 3001);
		DB db = mongo.getDB("meteor");
		DBCollection collection = db.getCollection("testReport");

		// 1. BasicDBObject example
		System.out.println("BasicDBObject example...");
		BasicDBObject document = new BasicDBObject();
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		document.put("TimeStamp", df.format(dateobj));
		*/
	
	
	/*public void onTestStart(ITestContext context){
		for (XmlClass test : context.getCurrentXmlTest().getXmlClasses()) {
			context.getCurrentXmlTest().getLocalParameters().get("browserName");
			 for (XmlInclude method : test.getIncludedMethods()) {
			 System.out.println(method.getAllParameters());
			 }
			 }
		BaseStepDefs.currentBrowser=context.getCurrentXmlTest().getLocalParameters().get("browserName");;
		BaseStepDefs.currentOS=context.getCurrentXmlTest().getLocalParameters().get("OSName");;;
	}*/



	@Override
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Date getStartDate() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Date getEndDate() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getPassedTests() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getSkippedTests() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getFailedButWithinSuccessPercentageTests() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getFailedTests() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String[] getIncludedGroups() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String[] getExcludedGroups() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getOutputDirectory() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ISuite getSuite() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ITestNGMethod[] getAllTestMethods() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Collection<ITestNGMethod> getExcludedMethods() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getPassedConfigurations() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getSkippedConfigurations() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IResultMap getFailedConfigurations() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public XmlTest getCurrentXmlTest() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Module> getGuiceModules(Class<? extends Module> cls) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Injector getInjector(List<Module> moduleInstances) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Injector getInjector(IClass iClass) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addInjector(List<Module> moduleInstances, Injector injector) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onStart(ISuite suite) {
		BaseStepDefs.tests=new LinkedList<GalenTestInfo>();
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		ReportUtils.suiteTimeStamp = df.format(dateobj);
		try {
			if((new File(ReportUtils.galenReportCorePath).exists())){
				FileUtils.forceDelete(new File(ReportUtils.galenReportCorePath));
			//	FileUtils.cleanDirectory(new File(ReportUtils.galenReportCorePath));
			}
			if(new File(ReportUtils.projectPath+"/target/cucumber-report").exists()){
				FileUtils.forceDelete(new File(ReportUtils.projectPath+"/target/cucumber-report"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}