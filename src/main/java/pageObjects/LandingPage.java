package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//By login=By.cssSelector("a[href*='sign_in']");
	
	@FindBy(css="a[href*='sign_in']")
	WebElement login;
	
	
	public WebElement SignIn()
	{
		return login;
	}
	

}
