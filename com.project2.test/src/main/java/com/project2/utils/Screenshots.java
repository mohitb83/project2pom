package com.project2.utils;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.project2.core.BaseClass;

public class Screenshots extends BaseClass{
	
	public void screenCapture(String screenName) throws IOException {
		TakesScreenshot screenCap = (TakesScreenshot) drv; 
		File scrFile = screenCap.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\project2pom\\com.project2.test\\screenshots\\"+screenName+".png"));
	}
}