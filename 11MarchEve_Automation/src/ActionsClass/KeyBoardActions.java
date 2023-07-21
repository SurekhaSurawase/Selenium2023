package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		//https://the-internet.herokuapp.com/key_presses
		//https://swisnl.github.io/jQuery-contextMenu/demo.html
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement input1 = driver.findElement(By.id("email"));
		WebElement input2 = driver.findElement(By.id("pass"));
		
		input1.sendKeys("surekha");
		Actions act = new Actions(driver);
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//Ctrl+c
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//add TAB
		act.sendKeys(Keys.TAB);
		act.build().perform();

		//ctrl+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
	
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("copied correctly");
		}
		else {
			System.out.println("copied incorrectly");
		}
		
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	}

}
