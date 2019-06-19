package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Academy.Base;

public class CaptureScreenshot extends Base{
	
	WebDriver driver;
	
	public void get_Screenshot(String name) throws Exception
	{
		
		System.out.println("inside get screenshot");
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File srcfile=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcfile, new File("./Screenshot/"+name+".png"));
	    System.out.println("ScreenShot Taken !!!!!");
		
	}


}
