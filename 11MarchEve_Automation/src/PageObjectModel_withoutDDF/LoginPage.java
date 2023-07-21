package PageObjectModel_withoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	WebDriver driver;
	//Page object model is a design pattern used to maintain the code effectively.
	
	//we used @FindBy annotation is used to locate the element on the webpage
	
	//url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement button; 
	

	public void Username(String name) {
		username.sendKeys(name);
	}
	
	public void Password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void submit() {
		button.click();
	}
	
}
