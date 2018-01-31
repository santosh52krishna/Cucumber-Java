package cucumber.examples.java.testNG.runners;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestngXMLGeneratorRenew{
	public static String currentModule = null;
	public static String browserName;
	public static String OS = null;
	public static void main(String[] args) throws Throwable {
		String device="Mobile";
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("ExecutionSetup.json"));
		JSONObject jsonObject = (JSONObject) obj;
		//Create A TestNg Suite
    	XmlSuite suite = new XmlSuite();
		suite.setName("YPO Execution");
		suite.setVerbose(1);
		suite.setParallel("tests");
		suite.setThreadCount(2);
		List<XmlTest> tests = new ArrayList<XmlTest>();
		//Itearte On the JSON from UI
		for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
		    String key = (String) iterator.next();
		    System.out.println("Key Value is "+ key);
		    JSONArray arr = (JSONArray) jsonObject.get(key);
		    if(arr.size()>0){
		    	if(key.toLowerCase().contains("desktop")){
		    		device="Desktop";
		    	}
		    	else if (key.toLowerCase().contains("ipad")) {
		    		device="Desktop";
				}
		    	
					if(key.toLowerCase().contains("windows")&&key.toLowerCase().contains("firefox")){
						browserName="Firefox";
						OS="Windows";    			
		    		}
		    		else if(key.toLowerCase().contains("windows")&&key.toLowerCase().contains("chrome")){
		    			browserName="Chrome";
						OS="Windows"; 
		    		}
		    		else if(key.toLowerCase().contains("mac")&&key.toLowerCase().contains("safari")){
		    			browserName="Safari";
		    			OS="MAC"; 
		    		}
		    		else if(key.toLowerCase().contains("ipad")&&key.toLowerCase().contains("mac")){
		    			browserName="iPad";
		    			OS="MAC"; 
		    		}
		    		else if(key.toLowerCase().contains("android")){
		    			browserName="Android";
						OS="Android"; 
		    		}
		    		else if(key.toLowerCase().contains("iphone")){
		    			browserName="IPhone";
						OS="iOS"; 
		    		}
		    		else if (key.toLowerCase().contains("ipad")) {
						browserName="iPad";
						OS="MAC";
					}
		    	
		    	String tempfeature="src\\main\\resources\\RenewalFeatures\\"+device+"\\temp";
		    	String featuresList ="";
		    	for (int i=0;i<arr.size();i++){
		    		
		    		if (i==arr.size()-1){
		    			featuresList=featuresList+tempfeature.replaceAll("temp",(String) arr.get(i));
		    		}
		    		else {
		    			featuresList=featuresList+tempfeature.replaceAll("temp",(String) arr.get(i))+",";
		    		}
		    		
		    		
		      	}
		    	System.out.println(featuresList);
		    	XmlTest test = new XmlTest(suite);
				test.setName(key);
				test.setPreserveOrder("true");
				List<XmlClass> classes = new ArrayList<XmlClass>();
				XmlClass testClass = new XmlClass();
		    	testClass = new XmlClass();
				testClass.setName("cucumber.examples.java.testNG.runners.RunCukesTest");
				Map<String, String> parameters = new HashMap<String, String>();
				/*if(key.toLowerCase().contains("iphone")||key.toLowerCase().contains("ipad")){
					parameters.put("browserName", key.replace("Safari","").replace("Mobile","").replace("Mac",""));
					*/
				if(key.toLowerCase().contains("iphone")){
					parameters.put("browserName", key.replace("Safari","").replace("Mobile","").replace("Mac","").replace("iPad",""));
					
				}else{
					if(key.toLowerCase().contains("android")){
						parameters.put("browserName", "Android");
					}
					else if (key.toLowerCase().contains("ipad")) {
						parameters.put("browserName", "iPad");
					}
					else{
						parameters.put("browserName", key.replace("Desktop","").replace("Android","").replace("Windows","").replace("Mobile","").replace("Mac","").replace("iPad",""));
					}
				}
				
				parameters.put("OSName",OS);
				parameters.put("features",featuresList);
				classes.add(testClass);
				test.setParameters(parameters);
				test.setXmlClasses(classes);
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
		
