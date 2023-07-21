package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		//Get the current window’s handle and write to the console window. It must be the first window handle.
		Thread.sleep(3000);
		String ParentId =driver.getWindowHandle();
		System.out.println("Parent window ID: "+ParentId);
		
		//Locate the “Visit W3Schools.com!” link and click it.
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();

		//Get the current window’s handle and write to the console window. It must be a second window handle.
		
		//Get all window handles and hold them in a list.
		Set<String> IDs = driver.getWindowHandles();
	
		List<String> Al = new ArrayList(IDs);
		String ChildId=  Al.get(1);
		System.out.println("Child Window handle : "+ChildId);
		
		//Write to total window handle number to the console. It must be 2.
		System.out.println("Total Handled windows are: "+IDs.size());
		
		//Switch t0 the second window
		driver.switchTo().window(ChildId);
	
		
		//Check the upper left side logo in the second window
		driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
		//System.out.println("Logo is present");
		
		//Go back (Switch) to the first window.
		driver.switchTo().window(ParentId);
		
		//Get the current window’s handle and write to the console window. It must be the first window handle.
		String parentId= driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentId);
		
		//Check the See Run Button Text. It must contain “Run >” text.
		driver.findElement(By.xpath("//button[contains(text(),'Run ❯')]")).click();
	}

}
