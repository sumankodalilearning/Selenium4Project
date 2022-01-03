package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();
		
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in Search text box
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		Thread.sleep(3000);
		
		//click Enter while in Search text box
		GoogleSearchPage.textbox_click_search(driver).sendKeys(Keys.RETURN);
		
		//click on common area
		//GoogleSearchPage.search_commonarea(driver).click();
		
		
		//click on the Search button
		//GoogleSearchPage.button_search(driver).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		
		//close the browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
		
		
		
	}

}
