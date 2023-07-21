package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3 {

	public static void main(String[] args) {
		//iframe by using WebElement
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://demo.automationtesting.in/Frames.html");//selenum's focus is at main page
				driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			
				WebElement Frame1 =driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
				driver.switchTo().frame(Frame1);
				String text1= driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
				System.out.println(text1);
				
				WebElement Frame2 = driver.findElement(By.xpath("//div[@class=\"iframe-container\"]/iframe"));
				driver.switchTo().frame(Frame2);
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("java");
				//driver.findElement(By.xpath("//h5[contains(text(),'iFrame Demo')"));
				
				//here we need to go back to home page or to parentframe
				
				driver.switchTo().parentFrame();
				System.out.println(text1);
				
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[text()=\"WebTable\"]")).click();
				


	}

}
