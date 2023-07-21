package ListBox;
		
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class Practice {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.drover", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Surekha");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Surawase");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8980492090");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("1234567");
		
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
		String DOB = "9/Feb/2022";	
		String Arr[] = DOB.split("/");
			
		System.out.println(Arr.length);
		System.out.println();
		ListBox(Day, Arr[0]);
		ListBox(Month, Arr[1]);
		ListBox(Year, Arr[2]);
	    		
	}
		public static void ListBox(WebElement element, String text) {
			
			Select S1 = new Select(element);
			
			List<WebElement> ListValues = S1.getOptions();
			
			
			for(int i = 0; i<ListValues.size(); i++) {
				String value =ListValues.get(i).getText();
				System.out.println(value);
				if(value.equals(text)) {
					ListValues.get(i).click();
				}
			}
		}
	}