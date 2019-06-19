package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public Properties readConfigFile() throws Exception
	{
		File src=new File("./Configuration/config.property");
		FileInputStream fis=new FileInputStream(src);
		
		prop=new Properties();
		prop.load(fis);
		
		return prop;
		
	}

}
