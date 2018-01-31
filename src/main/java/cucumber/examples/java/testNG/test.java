package cucumber.examples.java.testNG;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Properties;

import java.nio.charset.Charset;
import java.nio.file.Files;

import java.io.*;

public class test {

	public static void main(String[] args) throws Exception{
		File file = new File("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\ExecutionSetup.properties");
		FileReader fs = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fs);
		String data = properties.getProperty("Data");
		System.out.println("Data:  "+data);
		fs.close();
		
		Properties writeproperties = new Properties();
		writeproperties.setProperty("Data", "test11111111111111");
		FileWriter fw = new FileWriter(file);
		writeproperties.store(fw, "updated");
		fw.close();
		
		//String content = new String (Files.readAllBytes(file.toPath()),Charset.forName("UTF-8"));
		
		String content1 = new String(Files.readAllBytes(Paths.get("E:\\CucumberProjects\\cucumber-testng-parallel-selenium-master\\ExecutionSetup.properties")));
		System.out.println("content1 : "+content1);
	}
}
