package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	//isDisplayed() method is present in WebElement interface with boolean as return type
	//It is used to check if particular webelement is displayed on the page or not
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement link = driver.findElement(By.linkText("Create a Page"));
		System.out.println(link.isDisplayed());
		
		driver.quit();

	}

}
