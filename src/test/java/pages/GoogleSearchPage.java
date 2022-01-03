package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
		
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement textbox_click_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		
		element = driver.findElement(By.name("btnK"));
		return element;		
		
	}
	
	public static WebElement search_commonarea(WebDriver driver) {
		
		element = driver.findElement(By.id("gws-output-pages-elements-homepage_additional_languages__als"));
		return element;
	}

}
