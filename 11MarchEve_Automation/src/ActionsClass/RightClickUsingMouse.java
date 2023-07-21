package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingMouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
