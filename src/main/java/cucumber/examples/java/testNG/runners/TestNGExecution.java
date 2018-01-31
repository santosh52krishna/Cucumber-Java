package cucumber.examples.java.testNG.runners;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.nio.file.Paths;
import java.sql.Array;
import java.util.Properties;
import java.nio.charset.Charset;
import java.nio.file.Files;
import org.json.simple.JSONObject;


public class TestNGExecution {
	public static String currentModule = null;
	public static void main(String[] args) throws Throwable {
		File file = new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\ExecutionSetup.properties");
		String loc="target/test-classes/features/";
		String device="Mobile";
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\ExecutionSetup.json"));
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println("This is JSON Reading");
		File executionProperties = new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\ExecutionSetup.properties");
    	Properties writeproperties = new Properties();
		//Create A TestNg Suite
    	XmlSuite suite = new XmlSuite();
		suite.setName("YPO Execution");
		suite.setThreadCount(2);
		suite.setParallel("tests");
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		
		test.setPreserveOrder("true");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		XmlClass testClass = new XmlClass();
		FileUtils.cleanDirectory(new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\src\\test\\resources\\RunTimeFeatures\\")); 
		//Itearte On the JSON from UI
		for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
		    String key = (String) iterator.next();
		    JSONArray arr = (JSONArray) jsonObject.get(key);
		    if(arr.size()>0){
		    	if(key.contains("Desktop")){
		    		device="Desktop";
		    	}
		    	for (int i=0;i<arr.size();i++){
		    		FileUtils.copyFileToDirectory(new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\src\\test\\resources\\features\\"+device+"\\"+arr.get(i)), new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\src\\test\\resources\\RunTimeFeatures\\"+key));
		       	}
		    	testClass = new XmlClass();
				testClass.setName("cucumber.examples.java.testNG.runners.RunCukesTestIn"+key.replace("Desktop","").replace("Windows","").replace("Mobile","").replace("Safari","").replace("Safari","").replace("iPad",""));
				Map<String, String> parameters = new HashMap<String, String>();
				parameters.put("browserName", key.replace("Desktop","").replace("Windows","").replace("Mobile","").replace("Safari","").replace("iPad",""));
				testClass.setParameters(parameters);
				classes.add(testClass);
				test.setParameters(parameters);
		    }
		}
		test.setXmlClasses(classes);
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
		
