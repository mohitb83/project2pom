package com.project2.core;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {
	
	protected static WebDriver drv;
	
	File file = new File("F:\\project2pom\\com.project2.test\\src\\main\\java\\com\\project2\\utils\\config.properties");
	
	public Properties prop = new Properties();
	
	FileInputStream fis;
	
	public BaseClass(){
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void browser(String browserName) {
		if(browserName.equals(prop.getProperty("browser1"))) {
			ChromeOptions opts = new ChromeOptions();
			opts.setAcceptInsecureCerts(true);
			drv = new ChromeDriver(opts);
			drv.manage().deleteAllCookies();
			drv.manage().window().maximize();
			drv.get(prop.getProperty("url"));
			drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(browserName.equals(prop.getProperty("browser2"))) {
			FirefoxOptions opts = new FirefoxOptions();
			opts.setAcceptInsecureCerts(true);
			drv = new FirefoxDriver(opts);
			drv.manage().deleteAllCookies();
			drv.manage().window().maximize();
			drv.get(prop.getProperty("url"));
			drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if (browserName.equals(prop.getProperty("browser2"))) {
			EdgeOptions opts = new EdgeOptions();
			opts.setAcceptInsecureCerts(true);
			drv = new EdgeDriver(opts);
			drv.manage().deleteAllCookies();
			drv.manage().window().maximize();
			drv.get(prop.getProperty("url"));
			drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} else {
			System.out.println("No browser found");
		}
		
	}
}
