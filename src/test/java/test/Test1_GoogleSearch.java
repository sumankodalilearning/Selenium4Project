package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

public class Test1_GoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();
		
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in Search text box
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automaton step by step");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//click on the Search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
				
		//click on Search button
		driver.findElement(By.name("btnK")).click();
		
		//close the browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
		
		
		
	}

}
