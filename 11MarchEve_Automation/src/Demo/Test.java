package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chromedriver.chromium.org/");
		
		
		
	}

}