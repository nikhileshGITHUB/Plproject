package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyfile {


		
		
		public static String readpropertyfile(String login) throws Exception
		{
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream("D:\\IMP Data\\framework\\src\\testdata\\propertyfiles");
			prop.load(file);
			return prop.getProperty(login);
			
			
			
		}
	}

