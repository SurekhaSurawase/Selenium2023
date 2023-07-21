package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_method {

	public static void main(String[] args) throws InterruptedException {
		
		//SetSize method is used to change size of browser which accepts dimensions as arguments
		//SetSize method donot accept width and height directly.
		//We need to create object of dimension class and has to pass arguments in constructor before using setSize method.

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");
		
		Dimension D1 = new Dimension(500, 700);
		
		driver.manage().window().setSize(D1);
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
