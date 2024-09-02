package com.project2.pages;

import org.openqa.selenium.By;

import com.project2.core.BaseClass;

public class LoginPage extends BaseClass{
	
	By username = By.cssSelector("input[name='email']");
	By password = By.cssSelector("input[name='password']");
	By captcha = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div[3]/div/div[1]/img");
	By captInput = By.cssSelector("input[Placeholder='Enter Captcha']");
	By lgnBtn = By.cssSelector("button[type='submit']");
			
//	@FindBy(id="")		
//	private WebElement elm1;
	
	public void userLogin(String usrname, String pass) {
		drv.findElement(username).clear();
		drv.findElement(username).sendKeys(usrname);
		drv.findElement(password).clear();
		drv.findElement(password).sendKeys(pass);
		String elem1 = drv.findElement(captcha).getAttribute("alt");
//		URL url = null;
//		String imgURL = drv.findElement(By.xpath("")).getAttribute("src");
//		try{
//			url = new URL(imgURL);
//
//		} catch(MalformedURLException e){
//
//		e.printStackTrace();
//		}
//
//		BufferedImage image1 = ImageIO.read(url);
////	//	Tesseract tesseract = new Tesseract();
////		tesseract.setDatapath("F:\\project2pom\\com.project2.test\\src\\main\\resources\\testData");
////		tesseract.setLanguage("eng");
////
////		String extractedText = tesseract.doOCR(image1);
////		System.out.println("Extracted Text "+extractedText);
//		
		
		drv.findElement(captInput).sendKeys(elem1);
		drv.findElement(lgnBtn).click();
	}
}
