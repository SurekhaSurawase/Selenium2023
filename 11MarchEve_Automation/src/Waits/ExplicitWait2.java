package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		//Use ChromeOptions class to disable notifications of browser 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		By source = By.id("src");
		By dest = By.id("dest");	
		waitperiod(driver, source, 20).sendKeys("pune");
		waitperiod(driver, dest, 10).sendKeys("mumbai");

	}
	
	public static WebElement waitperiod(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}

}
