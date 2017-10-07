package task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseScript {
	
	private static String driverName = "/chromedriver";
	private static String osType = System.getProperty("os.type");
	
	public static WebDriver getDriver() {
		
		if (!osType.equals("Linux")) {
			driverName += ".exe";
		}
		
		System.setProperty("webdriver.chrome.driver", driverName);
		return new ChromeDriver();
	}

}
