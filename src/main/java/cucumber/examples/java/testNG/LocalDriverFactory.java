package cucumber.examples.java.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.mobile.*;


import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Based on the LocalDriverFactory found at: onrationaleemotions.wordpress.com
 * @author: Confusions Personified
 * @src: http://rationaleemotions.wordpress.com/2013/07/31/parallel-webdriver-executions-using-testng/
 */
public class LocalDriverFactory {
	  public static final String USERNAME = "rajuvemu2";
	  public static final String AUTOMATE_KEY = "zBgAnyNYA8q4zpwL3H8r";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static WebDriver createInstance(String browserName) throws MalformedURLException {
        WebDriver driver;
        DesiredCapabilities caps = new DesiredCapabilities();
        browserName = (browserName != null) ? browserName : "firefox";

        switch (Browser.valueOf(browserName.toUpperCase())) {
            case FIREFOX:
            	caps.setCapability("browser", "Firefox");
            	caps.setCapability("browser_version", "38.0");
            	caps.setCapability("os", "Windows");
            	caps.setCapability("os_version", "7");
            	caps.setCapability("resolution", "1024x768");
            	driver = new RemoteWebDriver(new URL(URL), caps);
            	driver.manage().window().maximize();
                break;
            case ANDROID:
            	caps.setCapability("browserName", "android");
            	caps.setCapability("platform", "ANDROID");
            	caps.setCapability("device", "Samsung Galaxy S5");
            	driver = new RemoteWebDriver(new URL(URL), caps);
            	break;
            case IPHONE:
            	caps.setCapability("browserName", "iPhone");
            	caps.setCapability("platform", "MAC");
            	caps.setCapability("device", "iPhone6");
            	driver = new RemoteWebDriver(new URL(URL), caps);
            	break;
            case IPAD:
            	caps.setCapability("browserName", "iPad");
            	caps.setCapability("platform", "MAC");
            	caps.setCapability("device", "iPad Pro");;
            	driver = new RemoteWebDriver(new URL(URL), caps);
            	break;
            case SAFARI:
            	caps.setCapability("browser", "Safari");
            	caps.setCapability("browser_version", "8.0");
            	caps.setCapability("os", "OS X");
            	caps.setCapability("os_version", "Yosemite");
            	caps.setCapability("resolution", "1024x768");
            	driver = new RemoteWebDriver(new URL(URL), caps);
            	driver.manage().window().maximize();
            	break;
            case IE:
                driver = new InternetExplorerDriver();
                break;
            case CHROME:
            	caps.setCapability("browser", "Chrome");
            	caps.setCapability("browser_version", "43.0");
            	caps.setCapability("os", "Windows");
            	caps.setCapability("os_version", "7");
            	caps.setCapability("resolution", "1024x768");
            	driver = new RemoteWebDriver(new URL(URL), caps);
            	driver.manage().window().maximize();
                break;
          /*  case HTMLUNIT:
            //    driver = new HtmlUnitDriver();
                break;
            case HTMLUNITJS:
              //  driver = new HtmlUnitDriver(true);
                break;*/
            default:
                driver = new FirefoxDriver();
                break;
        }
               
        return driver;
    }

    private static enum Browser {
        FIREFOX,
        CHROME,
        IE,
        IPAD,
        HTMLUNIT,
        HTMLUNITJS,
        IPHONE,
    	ANDROID,
    	SAFARI;
    }
}