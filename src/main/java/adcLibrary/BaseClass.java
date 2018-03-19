package adcLibrary;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
	public WebDriver driver;
	String drivername, urlstring;

	  public void beforeTest() {
//		  System.out.println("Executing Before Test");
	  }
	
	  public void setupApp() throws IOException {
			System.out.println("Executing Before Method");			
			  String ffdrivername = "C:\\Java\\geckodriver-v0.19.1-win64\\geckodriver.exe";
			  String urladdress = "https://poi8.petinsurance.com/benefits/google-inc";
				drivername = ffdrivername; // PropertiesReader.readProperty(ffdrivername); //("ffdrivername");
				urlstring = urladdress; // PropertiesReader.readProperty(urladdress); //("urladdress");
				System.setProperty("webdriver.gecko.driver",drivername);
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(urlstring);			
		}
	
  public void close()
	{
	  System.out.println("Closing the Browser");
	  try {
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
//	  System.out.println("Closing the Browser");
	  driver.quit();
	}

}
