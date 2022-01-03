package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {

	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	

	public static void getProperties() {
		try {
			String projectPath = System.getProperty("user.dir");
			//System.out.println(projectPath);
			
			InputStream input = new FileInputStream("C:\\Users\\admin\\shaanstraning\\Selenium4Project\\src\\test\\java\\config\\config.properties");
			//using forward slash in combination of projectPath has not worked somehow, may need to check it later
			
			prop.load(input);

			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			TestNG_Demo.browserName = prop.getProperty("browser");
			
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	public static void setProperties() {
		
		try {
			
		OutputStream output = new FileOutputStream("C:\\Users\\admin\\shaanstraning\\Selenium4Project\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, "changing browser");
		} catch(Exception e) {
			e.printStackTrace();
		
		
	}

	}

}
