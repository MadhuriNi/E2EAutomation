package Academy;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utility.ReadConfig;

@Listeners(Academy.Listeners.class)

public class HomePageLogin extends Base{

	public static Logger log=LogManager.getLogger(ValidateTitle.class.getName());
	
	@Test(dataProvider="data")
	public void basePageNavigation(String username,String password,String text) throws Exception
	{
		ReadConfig rc=new ReadConfig();
		prop=rc.readConfigFile();
		
		driver=initializeDriver();
		driver.get(prop.getProperty("URL"));
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		LandingPage lp=new LandingPage(driver);
		lp.SignIn().click();
		
		LoginPage lpa=new LoginPage(driver);
		lpa.Enter_Email().sendKeys(username);
		lpa.Enter_pass().sendKeys(password);
		log.info(text);
		lpa.Login().click();
	}
	
	
	@DataProvider(name="data")
	public Object[][] getData()
	{
		Object data[][]=new Object[2][3];
		
		data[0][0]="abc@gmail.com";
		data[0][1]="1234";
		data[0][2]="not logged it";
		
		data[1][0]="def@gmail.com";
		data[1][1]="5678";
		data[1][2]="trying to log in";
		
		return data;
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		//driver=null;
	}

}
