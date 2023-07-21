package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.id("submit")).click();
	}

}
