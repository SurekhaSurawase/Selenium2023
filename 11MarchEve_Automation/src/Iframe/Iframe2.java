package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		//iframe by using id
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");//selenum's focus is at main page
		driver.findElement(By.xpath("//a[@class=\"analystic\"]")).click();
		//to navigate to iframe we use below statement and passing argument as id value.
		driver.switchTo().frame("singleframe"); //focus shifted to iframe
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Success");

		//to navigate the focus at main page there are two ways 1. defaultContent(); 2.parentFrame();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
	}

}
