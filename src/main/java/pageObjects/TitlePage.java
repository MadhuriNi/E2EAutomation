package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitlePage {
	
WebDriver driver;

	public TitlePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//By title=By.xpath("//div[@class='text-center']/h2");
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	WebElement title;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']")
	WebElement navbar;
	
	
	public WebElement getTitle()
	{
		return title;
	}

	public WebElement get_NavBar()
	{
		return navbar;
	}
	
}