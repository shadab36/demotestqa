package testRunner;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;

//import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public static AndroidDriver<MobileElement> driver;
	public static Properties property = new Properties(System.getProperties());
	public static String Emulator;
	public static Logger log;
	public static WebElement webelement;
	public static String onmobile;
	@BeforeClass
	public static void before_Class() throws Exception {
		log = Logger.getLogger(BeforeClass.class.getName());
		property.load(new FileReader("config//Config.properties"));
		onmobile = property.getProperty("onmobile");
		Emulator = property.getProperty("Emulator");
		// On real mobile device
	if ((onmobile.equals("yes"))) {
//			 set up appium against a local application
			File app = new File("OI Shopping List_org.openintents.shopping.apk");
			DesiredCapabilities cab = new DesiredCapabilities();
			cab.setCapability(CapabilityType.BROWSER_NAME, "");
			cab.setCapability("deviceName", "Android");
			cab.setCapability("platformName", "Android");
			cab.setCapability("platformVersion", "6.0.1");
			cab.setCapability("noReset", "true");
			cab.setCapability("skipUnlock", "true");
			cab.setCapability("app", app.getAbsolutePath());
			cab.setCapability("appPackage", "org.openintents.shopping");
			cab.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");
			
		
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cab);
			Thread.sleep(2000);
		}
	
		// on virtual device
		else if (Emulator.equals("yes")) {
			File app = new File("OI Shopping List_org.openintents.shopping.apk");
			DesiredCapabilities cab = new DesiredCapabilities();
			cab.setCapability(CapabilityType.BROWSER_NAME, "");
			cab.setCapability("deviceName", "Samsung Galaxy S7 Edge WQHD GoogleAPI Emulator");
			cab.setCapability("platformName", "Android");
			cab.setCapability("platformVersion", "7.0");
			cab.setCapability("app", app.getAbsolutePath());
			cab.setCapability("skipUnlock", "true");
			cab.setCapability("app", app.getAbsolutePath());
			cab.setCapability("appPackage", "org.openintents.shopping");
			cab.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");
//			create a RemoteWebDriver, the default port for Appium is 4723
	 	   driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cab);
			Thread.sleep(2000);
		}
		 else {
			System.out.println("Devices is not connecting");
		}
	}

	@AfterClass
	public static void after_Class() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}
