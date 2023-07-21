package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement Account = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions act = new Actions(driver);
		act.moveToElement(Account).build().perform();
		
		driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();

	}

}
