package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		//4. GetCurrentUrl: This method is used to get current URL of web page as an o/p.
		//Return type is String and stores in the form of an object
		

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
		String ExpURL = "https://www.facebook.com/";
		
		if(URL.equals(ExpURL))
			System.out.println("Correct URL");
		else
			System.out.println("Incorrect URL");
		
		driver.close();
	}

}
