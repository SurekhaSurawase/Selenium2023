package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Shiv");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Pawar");
		
		driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Swarajya nagar, beed");
	
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("surekha9033@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("8980492090");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
		
//		//WebElement Lang= driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
//		//List<WebElement> lang = driver.findElements(By.xpath("//div[@id=\"msdd\"]"));
//		WebElement lang1 = driver.findElement(By.xpath("//div[@id=\"msdd\"]/div"));
//		lang1.click();
		
//		for(int i=0; i<lang.size();i++) {
//			String value = lang.get(i).getText();
//			
//			if(value.equals("English")) {
//				lang.get(i).click();
//			}

		WebElement skills = driver.findElement(By.id("Skills"));
		Select S1 = new Select(skills);
		
		S1.selectByVisibleText("APIs");
		
		WebElement country = driver.findElement(By.xpath("//select[@ng-init=\"country=''\"]"));
		Select S2 = new Select(country);
		S2.selectByVisibleText("Select Country");
//		
//		WebElement country1 = driver.findElement(By.xpath("//span[@id=\"select2-country-container\"]"));
//		Select S3 = new Select(country1);
//		S3.selectByVisibleText("India");
//		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		WebElement day =driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		
		String DOB = "1923-June-8";
		String arr[] = DOB.split("-");
		
		dob(year,arr[0]);
		dob(month,arr[1]);
		dob(day,arr[2]);
		
	}

	public static void dob(WebElement element, String text) {
		Select Dob1 = new Select(element);
		Dob1.selectByVisibleText(text);
	}
	
	
}
