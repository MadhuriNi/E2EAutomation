package Academy;

import java.io.File;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ReadConfig;


public class Base {
	
	public static WebDriver driver;
	Properties prop;
	
	public WebDriver initializeDriver() throws Exception
	{
		ReadConfig rc=new ReadConfig();
		prop=rc.readConfigFile();
		
		String Browser=prop.getProperty("Browser");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("ChromeDriver"), prop.getProperty("ChromePath"));
			driver=new ChromeDriver();
		}
		
		if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(prop.getProperty("FirfoxDriver"), prop.getProperty("FirefoxPath"));
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	
		
		return driver;
		
	}
	
	public void get_Screenshot(String name) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File srcfile=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcfile, new File("./Screenshot/"+name+".png"));
	
		
	}
	
}
