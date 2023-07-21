package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(),'New Releases')]"));

		driver.get("https://www.amazon.in/");
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
		waits.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[contains(text(),'New Releases')]")))).click();
	}

}
