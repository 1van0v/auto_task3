package task3.pages;

import java.time.LocalDateTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Category {

	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor jse;
	private String name = "kedy" + LocalDateTime.now();
	private By catalogLink = By.xpath("//*[@data-submenu='9']");
	private By category = By.xpath("//*[@data-submenu='11']");
	private By addCatBtn = By.id("page-header-desc-category-new_category");
	private By catName = By.id("name_1");
	private By catSave = By.id("category_form_submit_btn");
	private By searchByName = By.name("categoryFilter_name");
	private By filterBtn = By.id("submitFilterButtoncategory");
	
	public Category(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10, 500);
		this.jse = (JavascriptExecutor) driver;
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
	
	public void addCategory() {
		wait.until(ExpectedConditions.elementToBeClickable(addCatBtn));
		driver.findElement(addCatBtn).click();
	}
	
	public void addName() {
		wait.until(ExpectedConditions.elementToBeClickable(catName));
		driver.findElement(catName).sendKeys(name);
	}
	
	public void submit() {
		WebElement save = driver.findElement(catSave);
		jse.executeScript("arguments[0].scrollIntoView();", save);
		save.click();
	}
	
	public void fillSearchField() {
		wait.until(ExpectedConditions.elementToBeClickable(searchByName));
		driver.findElement(searchByName).sendKeys(name);
	}
	
	public void filterCat() {
		driver.findElement(filterBtn).click();
	}
}
