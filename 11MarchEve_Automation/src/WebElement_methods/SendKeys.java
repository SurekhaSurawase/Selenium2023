package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	//sendkeys() is present in webElement interface. it takes string as argument.
	//return type is void()
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement UN= driver.findElement(By.id("email"));
		
		UN.sendKeys("shiv@gmail.com");
		
		WebElement PWD = driver.findElement(By.id("pass"));
		
		PWD.sendKeys("21346546");
		
		WebElement ShowPwd = driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]"));
		
		ShowPwd.click();

	}

}
