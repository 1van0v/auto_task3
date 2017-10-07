package task3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage {
	
	private static String link = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
	private static String login = "webinar.test@gmail.com";
	private static String passwd = "Xcg7299bnSmMuRLp9ITw";
	private WebDriver driver;
	private By loginField = By.id("email");
	private By passwdField = By.id("passwd");
	private By loginBtn = By.name("submitLogin");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void open() {
		driver.get(link);
	}
	
	public void fillLogin() {
		driver.findElement(loginField).sendKeys(login);
	}
	
	public void fillPasswd() {
		driver.findElement(passwdField).sendKeys(passwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
}
	