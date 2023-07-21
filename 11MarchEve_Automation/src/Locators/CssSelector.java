package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//1. #ID
//		driver.findElement(By.cssSelector("#email")).sendKeys("shiv@gmail.com");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("1456455");
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//2. Tagname and ID
		//Syntax: tagname#Id
		
//		driver.findElement(By.cssSelector("input#email")).sendKeys("shiv@gmail.com");
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("shiv@gmail.com");
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//3. attribute value and attribute name
		//[attribute name = attribute value]
		
//		driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("surekha");
//		driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("123456");
//		driver.findElement(By.cssSelector("[name=\"login\"]")).click();
//		
		//4. tagname and attributevalue

//		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("shiv");
//		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("1234568");
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//5.tagname and classname
		
//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("surekha");
//		driver.findElement(By.cssSelector("input._6luy")).sendKeys("455647864");
//		driver.findElement(By.cssSelector("button._42ft")).click();
		
		//6.tagname, inputtext, classname
		
		driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext _55r1 _6luy\"]")).sendKeys("shiv@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("8796451123");
		driver.findElement(By.cssSelector("button[name=\"login\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
