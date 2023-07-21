package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Surekha");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

	}

}
