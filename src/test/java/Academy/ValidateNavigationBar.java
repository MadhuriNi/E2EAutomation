package Academy;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.TitlePage;
import utility.ReadConfig;


@Listeners(Academy.Listeners.class)

@Test
public class ValidateNavigationBar extends Base{
	
	public static Logger log=LogManager.getLogger(ValidateTitle.class.getName());
	Properties prop;
	WebDriver driver;
	

	
	public void navbar_validate() throws Exception
	{
		ReadConfig rc=new ReadConfig();
		prop=rc.readConfigFile();
		
		driver=initializeDriver();
		driver.get(prop.getProperty("URL"));
		
		TitlePage tp=new TitlePage(driver);
		
		log.info("The nav bar is displayed : "+tp.get_NavBar().isDisplayed());
		
		Assert.assertTrue(tp.get_NavBar().isDisplayed(), "The link is displayed");
	}

	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		//driver=null;
	}
}
