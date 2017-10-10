package task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public abstract class BaseScript {
	
	private static String driverName = "/chromedriver";
	private static String osType = System.getProperty("os.name");
	
	public static WebDriver getDriver() {
		 
		//System.out.println(osType);
		if (!osType.equals("Linux")) {
			driverName += ".exe";
		}
		
		System.setProperty("webdriver.chrome.driver", 
				new File(BaseScript.class.getResource(driverName).getFile()).getPath());
		return new ChromeDriver();
	}

}
