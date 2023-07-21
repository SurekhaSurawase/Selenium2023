package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String [] args) throws InterruptedException {
		//1. Get method:
		//Get method is used to open the application or to enter the url in the brower
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
	}
}
