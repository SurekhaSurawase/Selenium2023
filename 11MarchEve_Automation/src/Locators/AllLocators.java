package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.intl=za&.src=ym");
		//1.ID
//		driver.findElement(By.id("login-username")).sendKeys("shiv@yahoo.com");
//		driver.findElement(By.id("login-signin")).click();

		//2.Name
//		driver.findElement(By.name("username")).sendKeys("shiv@yahoo.com");
//		driver.findElement(By.name("signin")).click();
		
		//3.class name
//		driver.findElement(By.className("phone-no")).sendKeys("shiv@yahoo.com");
//		driver.findElement(By.className("pure-button")).click();
//		
		//4.link text
		
		//driver.findElement(By.linkText("Forgotten username?")).click();
		
		//5.partial linktext
		//driver.findElement(By.partialLinkText("Forgott")).click();
		
		//6.tagname
		//driver.findElement(By.tagName("input"))... not allowed because tagname is duplicate and we cant give indexing
		
		//7.cssSelector
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("shiv@yahoo.com");
//		driver.findElement(By.cssSelector("#login-signin")).click();
		
		//8.xpath by attribute
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("shiv@yahoo.com");
		driver.findElement(By.xpath("//input[@name=\"signin\"]")).click();
		
		driver.quit();
	}

}
