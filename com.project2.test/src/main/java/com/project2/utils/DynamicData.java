package com.project2.utils;

import org.testng.annotations.DataProvider;

public class DynamicData {
	
	@DataProvider
	public Object [][] dataFeed(){
	return new Object[][] {
			{"henry@chapsmail.com","Pass@1234"}
	};
	}
}
