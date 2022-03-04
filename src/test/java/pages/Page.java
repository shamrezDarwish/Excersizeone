package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Driver;

public class Page {

	private WebDriver driver = Driver.getDriver();

	By sigIn = By.xpath("//span[text()='Sign in']");
	By usernameInput = By.id("user-identifier-input");
	By passwordInput = By.id("password-input");
	By signInButton = By.id("submit-button");
	By yourAccount = By.xpath("//span[text()='Your account']");
	By weatherElement = By.xpath("(//a[text()='Weather'])[1]");
	By weatherLogo = By.xpath("//a[@class='wr-c-weather-logo']");
	By weatherSearch = By.id("ls-c-search__input-label");
	By weatherSearchListResult = By.xpath("//ul[@id='location-list']/li/a/span[text()]");
	By addToMyLocation = By.xpath("//span[text()=' to My Locations']");
	By addedMessage = By.xpath("//h4[@id='locservices:ui-title']");

	public void getUrl(String url) {
		driver.navigate().to(url);
	}

	public void checkTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "BBC - Homepage";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void login(String userName, String passWord) {
		driver.findElement(sigIn).click();
		driver.findElement(usernameInput).sendKeys(userName);
		driver.findElement(passwordInput).sendKeys(passWord);
		driver.findElement(signInButton).click();
	}

	public void validateloggedIn() {
		String actualMessage = driver.findElement(yourAccount).getText();
		String expectedMessage = "Your account";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	public void navigateToWeatherPage() {
		driver.findElement(weatherElement).click();
		Assert.assertTrue(driver.findElement(weatherLogo).isDisplayed());
	}

	public void searchCity(String value) {
		driver.findElement(weatherSearch).sendKeys(value);
		List<WebElement> result = driver.findElements(weatherSearchListResult);
		for (WebElement element : result) {
			try {
				String text = element.getText();
				System.out.println(text);
				if (text.contains(", Newcastle upon Tyne")) {
					System.out.println(element.getText());
					element.click();

				}
			} catch (StaleElementReferenceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	
	public void addToMyLocation() {
		driver.findElement(addToMyLocation).click();
		Assert.assertTrue(driver.findElement(addedMessage).isDisplayed());
	}
}
