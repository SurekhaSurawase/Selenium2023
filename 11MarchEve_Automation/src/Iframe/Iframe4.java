package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException {
		//iframe by using index
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");//selenum's focus is at main page
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		
		String text2= driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText();
		System.out.println(text2);
		
		driver.switchTo().parentFrame();
		String text1= driver.findElement(By.xpath("//p[contains(text(),'You can use the height')]")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
	}

}
