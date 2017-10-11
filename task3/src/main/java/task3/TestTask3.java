package task3;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import task3.pages.LoginPage;
import task3.pages.Category;

public class TestTask3 extends BaseScript{

	public static void main(String[] args) {
		
	EventFiringWebDriver driver = getConfDriver();
	
	
	
	LoginPage logPage = new LoginPage(driver);
	logPage.open();
	logPage.fillLogin();
	logPage.fillPasswd();
	logPage.clickLoginBtn();
	
	Category category = new Category(driver);
	category.hoverOver();
	category.clikcCategory();
	category.addCategory();
	category.addName();
	category.submit();
	category.fillSearchField();
	category.filterCat();
	
	driver.quit();
	
	}

}
