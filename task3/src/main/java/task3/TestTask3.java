package task3;

import org.openqa.selenium.WebDriver;
import task3.pages.LoginPage;

public class TestTask3 extends BaseScript{

	public static void main(String[] args) {
		
	WebDriver driver = getDriver();
	driver.manage().window().maximize();
	
	LoginPage logPage = new LoginPage(driver);
	logPage.open();
	logPage.fillLogin();
	logPage.fillPasswd();
	logPage.clickLoginBtn();
	
	}

}
