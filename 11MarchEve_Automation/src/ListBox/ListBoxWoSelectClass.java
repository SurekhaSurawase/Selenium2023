package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxWoSelectClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\Chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("Vaibhav");
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9405585888");
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("asdjfdkn");
		
		String Day = "//select[@id=\"day\"]//option";
		String Month = "//select[@id=\"month\"]/option";
		String Year = "//select[@id=\"year\"]/option";
		
		String DOB = "15/Aug/2022";
		String arr[] = DOB.split("/");
		
		dropdown(Day, arr[0]);
		dropdown(Month, arr[1]);
		dropdown(Year, arr[2]);
		
	}
	
	public static void dropdown(String element, String text) {
		List<WebElement> list= driver.findElements(By.xpath(element));
		
		System.out.println();
		System.out.println("Total elements in dropdown are: "+list.size());
		
		for(int i=0; i<list.size(); i++) {
			String value = list.get(i).getText();
			
			if(value.equals(text)) {
				list.get(i).click();
			}
		}
	}

}
