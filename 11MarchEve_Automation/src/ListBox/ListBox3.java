package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Surekha");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("shiv@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("456651234545");
		//driver.findElement(By.id("id=\"u_2_g_YT\"")).sendKeys("9405585888");
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("78456361");
		
		WebElement Day= driver.findElement(By.id("day"));
	    WebElement Month= driver.findElement(By.id("month"));
	    WebElement Year= driver.findElement(By.id("year"));
	    
	    String DOB = "9/4/2020";
	    
	    String Arr1[] = DOB.split("/");
	    
	    Thread.sleep(5000);
	    ListBox(Day,Arr1[0]);
	    ListBox(Month,Arr1[1]);
	    ListBox(Year,Arr1[2]);

	}

	public static void ListBox(WebElement element, String text) {
		Select S1 = new Select(element);
		S1.selectByValue(text);
	}
}
