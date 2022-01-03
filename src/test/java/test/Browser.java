package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		String originalWindow = driver.getWindowHandle();
		
		driver.navigate().to("https://automationstepbystep.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		/*driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();*/
		
		driver.switchTo().window(originalWindow);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.close();

	}

}
