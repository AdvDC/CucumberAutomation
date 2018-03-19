package adcLibrary;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
	public static String readProperty(String p) throws IOException {
		// TODO Auto-generated method stub
		String str;
		 
		Properties prop = new Properties();
		String src = ".\\config.properties";
	
		InputStream ins = PropertiesReader.class.getClassLoader().getResourceAsStream(src);
		prop.load(ins);
		str = prop.getProperty(p);
		return str;
	}

}
