package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	//By email=By.cssSelector("input[type='email']");
	
	@FindBy(css="input[type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='user_password']")
	WebElement password;
	
	@FindBy(css="[type=submit]")
	WebElement login;
	
	public WebElement Enter_Email()
	{
		return email;
	}
	
	public WebElement Enter_pass()
	{
		return password;
	}
	
	public WebElement Login()
	{
		return login;
	}

}
