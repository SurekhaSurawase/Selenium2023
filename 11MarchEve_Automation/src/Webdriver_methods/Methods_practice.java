package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //Maximixe()
		
		driver.get("https://www.google.com/"); //get()
		
		String Title = driver.getTitle();//getTitle()
		
		System.out.println(Title);
		
		String ExpTitle = "Google";
		
		if(Title.equals(ExpTitle))
			System.out.println("Correct Title");
		else
			System.out.println("Title is incorrect");
		
		String URL = driver.getCurrentUrl();//getCurrentUrl()
		System.out.println(URL);
		
		String ExpUrl = "https://www.google.com/";
		
		if(URL.equals(ExpUrl))
			System.out.println("Correct URL");
		else
			System.out.println("Incorrect URL");

		driver.navigate().to("https://www.facebook.com/"); //navigate()
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Dimension D1 = new Dimension(500,300);
		
		driver.manage().window().setSize(D1);
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(5000);
		
		driver.close();//close()
		
	}

}
