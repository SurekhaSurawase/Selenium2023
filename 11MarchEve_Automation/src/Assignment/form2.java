package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class form2 {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Shiv");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Pawar");
		
		driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Swarajya nagar, beed");
	
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("surekha9033@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("8980492090");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
		
		String Skills ="//select[@id=\"Skills\"]/option";
		List<WebElement> skillvalues = driver.findElements(By.xpath(Skills));
		//System.out.println(skillvalues);
		for(int i=0; i<skillvalues.size(); i++) {
			String values = skillvalues.get(i).getText();
			System.out.println(values);
			
			if(values.equals("APIs")) {
				skillvalues.get(i).click();
			}
		}

		String Year = "//select[@id=\"yearbox\"]/option";
		String month = "//select[@placeholder=\"Month\"]/option";
		String day = "//select[@placeholder=\"Day\"]/option";
		
		String date = "1923-June-8";
		String arr[] = date.split("-");
		
		DOB(Year, arr[0]);
		DOB(month, arr[1]);
		DOB(day, arr[2]);
	}
	
	public static void DOB(String element, String text) {
		List<WebElement> list = driver.findElements(By.xpath(element));
		System.out.println("Total elements: "+list.size());
		for(int i=0; i<list.size(); i++) {
			String value = list.get(i).getText();
			System.out.println(value);
			
			if(text.equals(value)) {
				list.get(i).click();
			}
		}
	}

}
