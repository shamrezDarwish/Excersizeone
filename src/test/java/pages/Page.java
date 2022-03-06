package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Driver;

public class Page {

	private WebDriver driver = Driver.getDriver();

	
	@FindBy(xpath = "//input[@id='isc_2J']")
	private WebElement AnimalField;
	
	@FindBy(id = "isc_2G")
	private WebElement MaxLifeSpan;
	
	@FindBy (xpath = "//div[@id='isc_37']")
	private WebElement Sortby;
	
	@FindBy (xpath= "//span[@id='isc_3H']")
	private WebElement Ascending;
	
	@FindBy (id= "Filter")
	private WebElement Filter;
	
	
		public void getUrl(String url) {
		driver.navigate().to(url);
		}
		public void entersAnimal(String animal) {
		AnimalField.sendKeys(animal);
		}
		public void enterMaxLifeSpain(String MaxLifeSpan) {
			MaxLifeSpan.charAt(40);
		}
		public void Sortbyfiled (String Sortby) {
			String.valueOf(Sortby);
		}
		public void selectAcending() {
			if (!Ascending.isSelected())
			Ascending.click();
			
		}
		public void clickonFilter() {
		Filter.click();
			
			
	}
}
