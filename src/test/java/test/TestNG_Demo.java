package test;

//import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestNG_Demo {

	static WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public static void setUp() {
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();
			driver = new FirefoxDriver();
		}
		
	}
			

	@Test
	public static void googleSearch() {

		//goto google.com
		driver.get("https://google.com");

		//enter text in Search text box
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");


		//click Enter while in Search text box
		GoogleSearchPage.textbox_click_search(driver).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public static void tearDown() {

		//close the browser
		driver.close();

		System.out.println("Test Completed Successfully");
	}

}
