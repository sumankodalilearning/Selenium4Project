package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		
		GoogleSearchPageObjects searchObject = new GoogleSearchPageObjects(driver);
		
		searchObject.setTextInSearchBox("A B C D");
		searchObject.clickEnterInSearchBox();
		
		driver.close();

	}

}
