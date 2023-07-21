package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		WebElement DoubleClick = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
		act.doubleClick(DoubleClick).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();;
	}

}
