package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.tagName("input")).sendKeys("Surekha");
		//by default index of tagname is 1. we can not use indexing to jump to particular web element. 
		//hence we dont use tagname to locate the web elements
		driver.quit();
		

	}

}
