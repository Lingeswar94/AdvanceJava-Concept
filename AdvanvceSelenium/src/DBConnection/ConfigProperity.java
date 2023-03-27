package DBConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigProperity {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =null;

		FileInputStream fileInputStream = new FileInputStream("Config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String browser = properties.getProperty("Browser");
		String location = properties.getProperty("Driverlocation");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", location);
			driver = new ChromeDriver();
			//driver.get("https://phptravels.net/login");
			
		} else if (browser.equalsIgnoreCase("firebox")) {
			System.setProperty("webdriver.gecko.driver", location);
			driver = new FirefoxDriver();
		}
		 driver.get("https://www.google.com/");
	}

} 
