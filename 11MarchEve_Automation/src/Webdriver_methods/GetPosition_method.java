package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition_method {

	public static void main(String[] args) throws InterruptedException {
		//GetPosition: Used to fetch current position of browser.
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().getPosition();
		
		driver.close();
		
	}

}
