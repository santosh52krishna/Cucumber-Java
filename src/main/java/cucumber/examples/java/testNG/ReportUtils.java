package cucumber.examples.java.testNG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

import cucumber.examples.java.testNG.runners.Property;


public class ReportUtils {
	public static Property configProps = new Property("config.properties");
	public static String projectPath=configProps.getProperty("projectPath"); 
	public static String filePath = projectPath+"/target/cucumber-report";
	public static String galenReportCorePath =projectPath+"/target/galen-html-reports";
	public static String galenReportPath="";
	public static String suiteTimeStamp;
	
	public static void main(String args[]) throws IOException, ParseException{
		//CreateACollectionInDataBase();
		CreateReportAndSaveToDataBase();
	}
	public void CreateACollectionInDataBase() throws UnknownHostException{
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
		
	}
	
	public static void CreateReportAndSaveToDataBase() throws IOException, ParseException{
	    System.out.println("Project Path is "+filePath);
		File[] files = new File(filePath).listFiles();
		Map result=new HashMap();
		//Get Mongo Instance Object
		Mongo mongo = new Mongo("localhost", 3001);
		DB db = mongo.getDB("meteor");
		DBCollection collection = db.getCollection("testReport");
		for (File file : files) {
			if (file.isDirectory()) {
				String currentFolder=file.getName();
				String dummyFilePath = projectPath+"/target/cucumber-report";
				filePath = dummyFilePath + "/" + file.getName() + "/cucumber.json";
				int Passed = 0, Failed = 0;
				String scenarioRes;
				JSONParser parser = new JSONParser();
				JSONObject jsonComplex = new JSONObject();
				jsonComplex.put("Device Name", file.getName());
				jsonComplex.put("name", file.getName()+"Results");
				JSONObject notification = new JSONObject();
				JSONObject targetJsonObject = new JSONObject();
				JSONArray targetJsonArray = new JSONArray();
				try {
					JSONArray obj = (JSONArray) parser.parse(new FileReader(filePath));
					System.out.println("OBJ :" + obj);
					for (int i = 0; i < obj.size(); i++) {
						JSONObject jsonObject = (JSONObject) obj.get(i);
						System.out.println("name :" + jsonObject.get("name"));
						targetJsonObject.put("name", jsonObject.get("name"));
						JSONArray elementsArr = new JSONArray();
						elementsArr = (JSONArray) jsonObject.get("elements");
						JSONArray sectionsElementsArr = new JSONArray();
						for (int elementsCnt = 0; elementsCnt < elementsArr.size(); elementsCnt++) {
							scenarioRes = "passed";
							JSONObject sectionEltObj = (JSONObject) elementsArr.get(elementsCnt);
							System.out.println("section OBj :" + sectionEltObj.get("name"));
							JSONObject preparJjsonObject = new JSONObject();
							preparJjsonObject.put("name", sectionEltObj.get("name"));
							sectionsElementsArr.add(preparJjsonObject);
							JSONArray stepsArr = new JSONArray();
							stepsArr = (JSONArray) sectionEltObj.get("steps");
							JSONArray objectsArr = new JSONArray();
							for (int stepsCnt = 0; stepsCnt < stepsArr.size(); stepsCnt++) {
								JSONObject stepObj = (JSONObject) stepsArr.get(stepsCnt);
								JSONObject prepareStepNameJsonObject = new JSONObject();
								JSONObject prepareStepSpecJsonObject = new JSONObject();
								prepareStepNameJsonObject.put("name",stepObj.get("keyword") + " " + stepObj.get("name"));
								prepareStepSpecJsonObject.put("status", ((JSONObject) stepObj.get("result")).get("status").toString().replace("passed", "info").replace("failed", "error"));
								if (((JSONObject) stepObj.get("result")).get("status").toString().equals("failed")) {
									scenarioRes = "failed";
									JSONArray errArr = new JSONArray();
									errArr.add(((JSONObject) stepObj.get("result")).get("error_message"));
									prepareStepSpecJsonObject.put("errors", errArr);
								}
								JSONArray specsArr = new JSONArray();
								specsArr.add(prepareStepSpecJsonObject);
								prepareStepNameJsonObject.put("specs", specsArr);
								if (stepObj.get("name").toString().contains("Layout")) {
									String reportFileName=getGalenReportFileName(currentFolder,sectionEltObj.get("name").toString());
									galenReportPath=galenReportCorePath+"/"+reportFileName;
									prepareStepNameJsonObject.put("sections", getGalenReport(galenReportPath));
									prepareStepNameJsonObject.put("objects", getGalenReportObjects(galenReportPath));
									prepareStepNameJsonObject.put("screenshot",getGalenReportScreenShot(galenReportPath));
									prepareStepNameJsonObject.put("type", getGalenReportType(galenReportPath));
								}
								objectsArr.add(prepareStepNameJsonObject);
							}
							if (scenarioRes.equals("passed")) {
								Passed++;
							} else {
								Failed++;
							}
							preparJjsonObject.put("objects", objectsArr);
						}
						targetJsonObject.put("sections", sectionsElementsArr);
						targetJsonObject.put("objects", getGalenReportObjects(galenReportPath));
						targetJsonObject.put("screenshot", getGalenReportScreenShot(galenReportPath));
						targetJsonObject.put("type", getGalenReportType(galenReportPath));
						targetJsonArray.add(targetJsonObject);
					}
					notification.put("nodes", targetJsonArray);
					jsonComplex.put("report", notification);
					jsonComplex.put("PassedScenario", Passed);
					jsonComplex.put("FailedScenario", Failed);
					System.out.println(currentFolder + jsonComplex);
					result.put(currentFolder, jsonComplex);
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		BasicDBObject document = new BasicDBObject();
		BasicDBObject documentDetail = new BasicDBObject();
		Iterator it = result.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        documentDetail.put((String) pair.getKey(), pair.getValue());
	    }
	    document.put("results",documentDetail);
	    document.put("TimeStamp",suiteTimeStamp );
	    collection.insert(document);

	}
	
	private static String getGalenReportFileName(String currentFolder, String string) {
		
		File[] galenFiles = new File(galenReportCorePath).listFiles();
		String fileName=null;
		for (File jsonFiles : galenFiles) {
			fileName=jsonFiles.getName().toLowerCase();
			System.out.println("The Current Report Name is : "+fileName);
			if (fileName.contains(".json")&&fileName.contains(currentFolder.split("_")[0].toLowerCase())&&fileName.contains(string.toLowerCase().replace(" ","-"))) {
				System.out.println("The Galen Report Name is : "+fileName);
				return fileName;
			}
		}
		galenFiles=null;
		return fileName;
	}

	private static String getScenarioStatus(JSONObject sectionEltObj) {
		String ScenarioStatus = null;
		JSONArray scenarioObj = (JSONArray) sectionEltObj.get("after");
		JSONObject scenarioArr = (JSONObject) scenarioObj.get(0);
		JSONObject scenarioRes = (JSONObject) scenarioArr.get("result");
		if (scenarioRes.get("status").toString().equals("passed")) {
			return "passed";
		} else {
			return "failed";
		}
	}

	private static String getGalenReportType(String fileName) {
		JSONObject galenReportObj = new JSONObject();
		String jArr = null;
		try {
			JSONParser parser = new JSONParser();
			galenReportObj = (JSONObject) parser.parse(new FileReader(fileName));
			JSONArray nodesArr = new JSONArray();
			JSONObject reportObj = (JSONObject) galenReportObj.get("report");
			nodesArr = (JSONArray) reportObj.get("nodes");
			JSONObject nodesObj = (JSONObject) nodesArr.get(0);
			nodesObj.get("sections");
			return nodesObj.get("type").toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return jArr;
		}
	}

	private static JSONObject getGalenReportObjects(String fileName) {
		JSONObject galenReportObj = new JSONObject();
		JSONObject jArr = new JSONObject();
		try {
			JSONParser parser = new JSONParser();
			galenReportObj = (JSONObject) parser.parse(new FileReader(fileName));
			JSONArray nodesArr = new JSONArray();
			JSONObject reportObj = (JSONObject) galenReportObj.get("report");
			nodesArr = (JSONArray) reportObj.get("nodes");
			JSONObject nodesObj = (JSONObject) nodesArr.get(0);
			nodesObj.get("objects");
			return (JSONObject) nodesObj.get("objects");
		} catch (Exception ex) {
			ex.printStackTrace();
			return jArr;
		}
	}

	private static JSONArray getGalenReport(String fileName) {
		JSONObject galenReportObj = new JSONObject();
		JSONArray jArr = new JSONArray();
		try {
			JSONParser parser = new JSONParser();
			galenReportObj = (JSONObject) parser.parse(new FileReader(fileName));
			JSONArray nodesArr = new JSONArray();
			JSONObject reportObj = (JSONObject) galenReportObj.get("report");
			nodesArr = (JSONArray) reportObj.get("nodes");
			JSONObject nodesObj = (JSONObject) nodesArr.get(0);
			nodesObj.get("sections");
			return (JSONArray) nodesObj.get("sections");
		} catch (Exception ex) {
			ex.printStackTrace();
			return jArr;
		}
	}

	private static String getGalenReportScreenShot(String fileName) {
		JSONObject galenReportObj = new JSONObject();
		String res = null;
		try {
			JSONParser parser = new JSONParser();
			galenReportObj = (JSONObject) parser.parse(new FileReader(fileName));
			JSONArray nodesArr = new JSONArray();
			JSONObject reportObj = (JSONObject) galenReportObj.get("report");
			nodesArr = (JSONArray) reportObj.get("nodes");
			JSONObject nodesObj = (JSONObject) nodesArr.get(0);
			nodesObj.get("sections");
			return nodesObj.get("screenshot").toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return res;
		}
	}

}
