package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Installer");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//System: Class Name
		//set.Property : Method name
		//WebDriver: version of Selenuim
		//chrome: name of browser
		//driver: browser
		//2 values: path of chromedriver.xe file
	}
}
