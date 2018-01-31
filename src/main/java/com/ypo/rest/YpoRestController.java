package com.ypo.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class YpoRestController {
	static HttpComponentsClientHttpRequestFactory requestFactory;
	static HttpHeaders headers;
	static RestTemplate restTemplate;
	static HttpEntity<String> entity;
	static ResponseEntity<String> response;
	static JSONObject obj;
	static JSONObject o;
	static JSONArray o1;
	static JSONObject o3;
	static File f;
	static FileWriter file;
	public static ObjectMapper mapper;
	static HttpStatus status;
	static JSONObject objson;

	@RequestMapping(value = "/getScenarios/{feature}", method = RequestMethod.GET)
	public ResponseEntity<String> getScenarios(@PathVariable("feature") String id) {

		System.out.println("Inside rest call");
		
		runFeatures("E:/CucumberProjects/cucumber-testng-parallel-selenium-master/src/main/resources/features/Desktop/YPO.feature");

		return null;
	}
	
	public void runFeatures(String features) {
		try {
			System.out.println("Run Initiated1");
			String args[] = {features,"-p","json:james/cucumber.json","--dry-run"};
			cucumber.api.cli.Main.run(args, Thread.currentThread().getContextClassLoader());
			System.out.println("Run Initiated2");
			ProcessBuilder builder = new ProcessBuilder(args);
	    	builder.redirectErrorStream(true);
	        Process p = builder.start();
	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line;
	        while (true) {
	            line = r.readLine();
	            if (line == null) { break; }
	            System.out.println(line);
//	    		writer.println(line);
	        }
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public ResponseEntity<String> getResult(@PathVariable("featurePath") String featurePath) throws Exception {
		
		List<String> cmds = new ArrayList<String>();
    	cmds.add("cmd.exe");
    	cmds.add("/c");
    	cmds.add("cd \"D:\\CucumberGridTest\\cucumber_project\" && java -cp \"jars/*;.\" cucumber.api.cli.Main -p pretty -g step_definition/ features/");

//    	cmds.add("cd \"featurePath");
    	System.out.println();
		ProcessBuilder builder = new ProcessBuilder(cmds);
    	builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
//    		writer.println(line);
        }
//        writer.flush();
//		writer.close();
		return null;
	}

}
