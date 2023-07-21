package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String>IDs = driver.getWindowHandles();
		
		//to read data using iterator
		Iterator<String> itr = IDs.iterator();
		String ParentID = itr.next();
		String ChildID = itr.next();
		System.out.println(ParentID);
		System.out.println(ChildID);
		Thread.sleep(5000);
		
		//Switch between windows
		driver.switchTo().window(ParentID);
		System.out.println("Parent window title: "+driver.getTitle());

		driver.switchTo().window(ChildID);
		System.out.println("Child window title: "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("surekha@gmail.com");
 		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
 		
 		driver.switchTo().window(ParentID);
 		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("surekha");
 		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12365444");
 		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
