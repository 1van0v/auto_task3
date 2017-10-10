package task3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Category {

	private WebDriver driver;
	private By catalogLink = By.xpath("//*[@data-submenu='9']");
	private By category = By.xpath("//*[@data-submenu='11']");
	private WebDriverWait wait;
	
	public Category(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, 10, 500);
	}
	
	public void hoverOver() {
		
		wait.until(ExpectedConditions.elementToBeClickable(catalogLink));	
		WebElement catalog = driver.findElement(catalogLink);
		Actions hover = new Actions(driver);
		hover.moveToElement(catalog).perform();
	}
	
	public void clikcCategory() {
		wait.until(ExpectedConditions.elementToBeClickable(category));
		driver.findElement(category).click();
	}
	
}
