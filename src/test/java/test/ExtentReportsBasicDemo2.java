package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ExtentReportsBasicDemo2 {
	
	private static WebDriver driver = null;
	
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest logger;
	
	
	
	public static void main(String[] args) {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/ExtentReport.html");
		
		extent = new ExtentReports();
	
		logger = extent.createTest("Test One");
		
		WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();

		driver = new ChromeDriver();
		
		logger.log(Status.INFO,"First Test Case");

		driver.get("https://google.com");
		
		logger.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		logger.pass("Entered text in search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		logger.pass("Clicked keyboard's Enter key");
		
		driver.close();
		logger.pass("Closed the browser");
		
		logger.info("Test Completed");
		
		extent.flush();
		
	}

}
