package com.project2.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project2.core.BaseClass;
import com.project2.pages.LoginPage;

public class LoginPageTest extends BaseClass{
	
	public LoginPageTest() {
		super();
	}
	
	LoginPage lpg = new LoginPage();
	
	@BeforeTest
	public void launchBrowser() {
		browser("chrome");
	}

	@Test
	public void launchApp() throws InterruptedException{
		drv.get("https://elektrise.technology/login");
		drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		lpg.userLogin("supradmn@chapsmail.com", "New@1234");
		WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Super Admin')]"))).isDisplayed();
		System.out.println("User is logged in");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void quit() {
		drv.quit();
	}
}
