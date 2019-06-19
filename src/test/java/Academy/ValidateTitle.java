package Academy;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.TitlePage;
import utility.ReadConfig;

@Listeners(Academy.Listeners.class)

@Test
public class ValidateTitle extends Base{
	
	WebDriver driver;
	Properties prop;
	
	public static Logger log=LogManager.getLogger(ValidateTitle.class.getName());
	
	public void title_validate() throws Exception
	{
		ReadConfig rc=new ReadConfig();
		prop=rc.readConfigFile();
	
		
		driver=initializeDriver();
		driver.get(prop.getProperty("URL"));
		
		log.info("hit the URL");
		
		TitlePage tp=new TitlePage(driver);
		String actual_text=tp.getTitle().getText();
		
		log.info("The actual text got is : "+actual_text);
		
		String exp_text="FEATURED";
		
		Assert.assertEquals(actual_text, exp_text);	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("Closing the driver");
		//driver=null;
	}
	
}
