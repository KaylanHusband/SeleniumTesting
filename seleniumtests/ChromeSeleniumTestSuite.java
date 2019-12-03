package com.sevatec.gsalegacyquery.seleniumtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ChromeSeleniumTestSuite {
	
	private static WebDriver driver;
	private Select dropDown;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200");
	}
	
	@Test
	public void createNewApplication() {
		driver.findElement(By.id("New Application")).click();
		driver.findElement(By.id("userInput")).sendKeys("New Application 3");
		driver.findElement(By.id("submit2")).click();
	}
	
	public void createStakeHolder() {
		dropDown = new Select(driver.findElement(By.id("application")));
		dropDown.selectByVisibleText("New Application 3");
		driver.findElement(By.id("submit")).click();
		assertEquals("http://localhost:4200/main/stakeholders",driver.getCurrentUrl());
		driver.findElement(By.id("name")).sendKeys("Test Name");
		driver.findElement(By.id("role")).sendKeys("Test Role");
		driver.findElement(By.id("phone")).sendKeys("New Phone");
		driver.findElement(By.id("email")).sendKeys("New Email");
		driver.findElement(By.id("moreInfo")).sendKeys("New More Info");
	}
	
	public void updateStaffing() {
		driver.findElement(By.id("staffing")).click();
		assertEquals("http://localhost:4200/main/staffing",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateSecurity() {
		driver.findElement(By.id("security")).click();
		assertEquals("http://localhost:4200/main/security",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateEnvironment() {
		driver.findElement(By.id("environment")).click();
		assertEquals("http://localhost:4200/main/environment",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
		
	}
	
	public void updateDevelopment() {
		driver.findElement(By.id("development")).click();
		assertEquals("http://localhost:4200/main/development",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateRuntime() {
		driver.findElement(By.id("runtime")).click();
		assertEquals("http://localhost:4200/main/runtime",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateMonitoring() {
		driver.findElement(By.id("monitoring")).click();
		assertEquals("http://localhost:4200/main/monitoring",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateNetwork() {
		driver.findElement(By.id("network")).click();
		assertEquals("http://localhost:4200/main/network",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateAccess() {
		driver.findElement(By.id("access")).click();
		assertEquals("http://localhost:4200/main/access",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateAgreement() {
		driver.findElement(By.id("agreement")).click();
		assertEquals("http://localhost:4200/main/agreement",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void updateOperation() {
		driver.findElement(By.id("operation")).click();
		assertEquals("http://localhost:4200/main/operation",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void  updateDocumentation() {
		driver.findElement(By.id("documentation")).click();
		assertEquals("http://localhost:4200/main/documentation",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void  updateProjects() {
		driver.findElement(By.id("projects")).click();
		assertEquals("http://localhost:4200/main/projects",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	public void reviewTest() throws InterruptedException {
		driver.findElement(By.id("review")).click();
		assertEquals("http://localhost:4200/main/review",driver.getCurrentUrl());
		driver.findElement(By.id("expand")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("collapse")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exit")).click();
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		//Open Application
		ChromeSeleniumTestSuite cst = new ChromeSeleniumTestSuite();
		cst.launchBrowser();
		Thread.sleep(3000);
		
		//Create New Application Entry
//		cst.createNewApplication();
//		Thread.sleep(3000);
		
		//Create New StakeHolder
		cst.createStakeHolder();
		Thread.sleep(3000);
		
		//Navigate to Staffing and test
		cst.updateStaffing();
		Thread.sleep(3000);
		
		//Navigate to Security and test
		cst.updateSecurity();
		Thread.sleep(3000);
		
		//Navigate to Environment and test
		cst.updateEnvironment();
		Thread.sleep(3000);
		
		//Navigate to Development and test
		cst.updateDevelopment();
		Thread.sleep(3000);
		
		//Navigate to Runtime and test
		cst.updateRuntime();
		Thread.sleep(3000);
		
		//Navigate to Monitoring and test
		cst.updateMonitoring();
		Thread.sleep(3000);
		
		//Navigate to Network and test
		cst.updateNetwork();
		Thread.sleep(3000);
		
		//Navigate to Access and test
		cst.updateAccess();
		Thread.sleep(3000);
		
		//Navigate to Agreement and test
		cst.updateAgreement();
		Thread.sleep(3000);
		
		//Navigate to Operation and test
		cst.updateOperation();
		Thread.sleep(3000);
		
		//Navigate to Documentation and test
		cst.updateDocumentation();
		Thread.sleep(3000);
		
		//Navigate to Projects and test
		cst.updateProjects();
		Thread.sleep(3000);
		
		//Review Test
		cst.reviewTest();
	}

}