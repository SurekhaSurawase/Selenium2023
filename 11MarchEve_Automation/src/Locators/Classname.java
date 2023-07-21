package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.intl=za&.src=ym");
		
		//driver.findElement(By.className("pure-button")).click();
		
		driver.findElement(By.linkText("\"/forgot?.intl=za&src=ym&done=https%3A%2F%2Fmail.yahoo.com\"")).click();
	}

}
