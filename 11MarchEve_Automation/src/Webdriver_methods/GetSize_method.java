package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_method {

	//GetSize method is used to fetch current dimensions of window of browser
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");
		
		Dimension D1 = new Dimension(800, 700);
		driver.manage().window().setSize(D1);
		
		driver.manage().window().getSize();
		driver.close();

	}

}
