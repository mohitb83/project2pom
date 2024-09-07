package com.project2.core;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClassLambda {

	protected WebDriver driver = null;
	
	Properties prop = null;
	File fl = new File("F:\\project2pom\\com.project2.test\\src\\main\\java\\com\\project2\\utils\\config.properties");
	
	public BaseClassLambda() {
	try {
		prop = new Properties();
		FileInputStream fs = new FileInputStream(fl);
		prop.load(fs);
	}catch (Exception e) {
		e.printStackTrace();
	}	
	}
	
	public void baseLambda(String browse) throws MalformedURLException{
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", prop.getProperty("username"));
		ltOptions.put("accessKey", prop.getProperty("accessKey"));
		ltOptions.put("video", true);
		ltOptions.put("build", prop.getProperty("build"));
		ltOptions.put("project", prop.getProperty("project"));
		ltOptions.put("console", prop.getProperty("console"));
		ltOptions.put("selenium_version", prop.getProperty("selenium_version"));
		ltOptions.put("w3c", true);
		
		if(browse.equals(prop.getProperty("browser1"))) {
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName(prop.getProperty("platform"));
			browserOptions.setBrowserVersion(prop.getProperty("browserVersion"));
			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(new URL(prop.getProperty("remoteURL")), browserOptions);
		}
		
		else {
			FirefoxOptions browserOptions = new FirefoxOptions();
			browserOptions.setPlatformName(prop.getProperty("platform"));
			browserOptions.setBrowserVersion(prop.getProperty("browserVersion"));
			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(new URL(prop.getProperty("remoteURL")), browserOptions);
		}
	}
	
	
	
}
