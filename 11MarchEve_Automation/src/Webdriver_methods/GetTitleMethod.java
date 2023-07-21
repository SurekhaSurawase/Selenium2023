package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String [] args){
		//GetTitle method: is used to fetch the title of web page as o/p.
		//Return type is String
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
	
		System.out.println(title);
		
	    String ExpectedOutput = "Facebook – log in or sign up";
	
		if (title.equals(ExpectedOutput))
			System.out.println("Correct Title");
		else 
			System.out.println("Incorrect Title");
		
		driver.close();
		
	}
}
