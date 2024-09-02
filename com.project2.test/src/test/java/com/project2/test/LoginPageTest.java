package com.project2.test;

import org.testng.annotations.Test;

import com.project2.core.BaseClass;

public class LoginPageTest extends BaseClass{
	
	public LoginPageTest() {
		super();
	}

	@Test
	public void launchApp() {
		browser("chrome");
	}
	
	
}
