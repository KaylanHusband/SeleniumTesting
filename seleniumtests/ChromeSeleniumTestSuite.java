package com.sevatec.gsalegacyquery.seleniumtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sevatec.gsalegacyquery.GSALegacyQuery;
import com.sevatec.gsalegacyquery.controllers.inquiry.InquiryController;
import com.sevatec.gsalegacyquery.domains.Inquiry;
import com.sevatec.gsalegacyquery.domains.Stakeholder;
import com.sevatec.gsalegacyquery.repositories.InquiryRepository;
import com.sevatec.gsalegacyquery.serviceimpls.InquiryServiceImpl;
import com.sevatec.gsalegacyquery.services.MasterService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;


@Service
public class ChromeSeleniumTestSuite {
	
	private static WebDriver driver;
	private Select dropDown;
	
	
	@Autowired
	InquiryRepository inquiryRepository;
	
	@Test
	public void launchBrowser() {
		//inquiryRepository.deleteAll();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		assertEquals("http://localhost:4200/",driver.getCurrentUrl());
	}
	
	@Test
	public void createNewApplication() {
		driver.findElement(By.id("New Application")).click();
		driver.findElement(By.id("userInput")).sendKeys("Test");
		driver.findElement(By.id("submit2")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dropDown = new Select(driver.findElement(By.id("application")));
		//System.out.println(dropDown.getAllSelectedOptions());
		//dropDown.selectByVisibleText("Test");
		
	}
	
	@Test
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
	
	@Test
	public void updateStaffing() {
		driver.findElement(By.id("staffing")).click();
		assertEquals("http://localhost:4200/main/staffing",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateSecurity() {
		driver.findElement(By.id("security")).click();
		assertEquals("http://localhost:4200/main/security",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateEnvironment() {
		driver.findElement(By.id("environment")).click();
		assertEquals("http://localhost:4200/main/environment",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
		
	}
	
	@Test
	public void updateDevelopment() {
		driver.findElement(By.id("development")).click();
		assertEquals("http://localhost:4200/main/development",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateRuntime() {
		driver.findElement(By.id("runtime")).click();
		assertEquals("http://localhost:4200/main/runtime",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateMonitoring() {
		driver.findElement(By.id("monitoring")).click();
		assertEquals("http://localhost:4200/main/monitoring",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateNetwork() {
		driver.findElement(By.id("network")).click();
		assertEquals("http://localhost:4200/main/network",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateAccess() {
		driver.findElement(By.id("access")).click();
		assertEquals("http://localhost:4200/main/access",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateAgreement() {
		driver.findElement(By.id("agreement")).click();
		assertEquals("http://localhost:4200/main/agreement",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void updateOperation() {
		driver.findElement(By.id("operation")).click();
		assertEquals("http://localhost:4200/main/operation",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void  updateDocumentation() {
		driver.findElement(By.id("documentation")).click();
		assertEquals("http://localhost:4200/main/documentation",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void  updateProjects() {
		driver.findElement(By.id("projects")).click();
		assertEquals("http://localhost:4200/main/projects",driver.getCurrentUrl());
		driver.findElement(By.id("input")).sendKeys("Test Data");
	}
	
	@Test
	public void reviewTest() throws InterruptedException {
		driver.findElement(By.id("review")).click();
		assertEquals("http://localhost:4200/main/review",driver.getCurrentUrl());
		driver.findElement(By.id("expand")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("collapse")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exit")).click();
	}

}