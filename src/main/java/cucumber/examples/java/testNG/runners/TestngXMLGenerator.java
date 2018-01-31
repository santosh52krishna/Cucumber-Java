package cucumber.examples.java.testNG.runners;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestngXMLGenerator {
	public static String currentModule = null;
	public static void main(String[] args) throws Throwable {
		System.out.println("James You Won ..!");
		//File file = new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\ExecutionSetup.properties");
		String device="Mobile";
		JSONParser parser = new JSONParser();
		//E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\
		Object obj = parser.parse(new FileReader("ExecutionSetup.json"));
		JSONObject jsonObject = (JSONObject) obj;
		//Create A TestNg Suite
    	XmlSuite suite = new XmlSuite();
		suite.setName("YPO Execution");
		suite.setVerbose(1);
		suite.setParallel("tests");
		suite.setThreadCount(2);
		List<XmlTest> tests = new ArrayList<XmlTest>();
		//E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\src\\main\\
		FileUtils.cleanDirectory(new File("src\\main\\resources\\RunTimeFeatures\\")); 
		//Itearte On the JSON from UI
		for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
		    String key = (String) iterator.next();
		    System.out.println("Key Value is "+ key);
		    JSONArray arr = (JSONArray) jsonObject.get(key);
		    if(arr.size()>0){
		    	if(key.contains("Desktop")){
		    		device="Desktop";
		    	
		    	}
		    	for (int i=0;i<arr.size();i++){
		    		FileUtils.copyFileToDirectory(new File("src\\main\\resources\\features\\"+device+"\\"+arr.get(i)), new File("src\\main\\resources\\RunTimeFeatures\\"+key));
		       	}
		    	XmlTest test = new XmlTest(suite);
				test.setName(key);
				test.setPreserveOrder("true");
				List<XmlClass> classes = new ArrayList<XmlClass>();
				XmlClass testClass = new XmlClass();
		    	testClass = new XmlClass();
				testClass.setName("cucumber.examples.java.testNG.runners.RunCukesTestIn"+key.replace("Desktop","").replace("Windows","").replace("Mobile","").replace("Safari",""));
				Map<String, String> parameters = new HashMap<String, String>();
				parameters.put("browserName", key.replace("Desktop","").replace("Windows","").replace("Mobile","").replace("Safari",""));
				//testClass.setParameters(parameters);
				classes.add(testClass);
				test.setParameters(parameters);
				test.setXmlClasses(classes);
				//suite.addTest(test);
				tests.add(test);
		    }
		}
		suite.setTests(tests);
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		 /*Adding Listeners*/
		List<Class<? extends ITestNGListener>> listnerClasses = new ArrayList<Class<? extends ITestNGListener>>();
		listnerClasses.add(cucumber.examples.java.testNG.LocalWebDriverListener.class);
	    tng.setUseDefaultListeners(true);
	    tng.setListenerClasses(listnerClasses);
		tng.setXmlSuites(suites);
		tng.run();
		System.out.println("End of JSON Reading");
	}
	
}
		
