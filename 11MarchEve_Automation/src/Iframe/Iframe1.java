package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//driver.findElement(By.xpath("//h2[contains(text(),'My First JavaScript')]")); 
		//As this element is present in other webpage i.e iframe we are going to use driver.swichTo().frame("framename"); synatx.
		
		driver.switchTo().frame("iframeResult");//my first javascript
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	}

}
