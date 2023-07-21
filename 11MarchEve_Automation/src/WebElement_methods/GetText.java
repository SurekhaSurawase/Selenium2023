package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		String ExpText = "Facebook helps you connect and share with the people in your life.";
		
		String Actualtext= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]")).getText();
		
		if(ExpText.equals(Actualtext))
			System.out.println("Correct text");
		else
			System.out.println("Incorrect text");
		
		driver.quit();

	}

}
