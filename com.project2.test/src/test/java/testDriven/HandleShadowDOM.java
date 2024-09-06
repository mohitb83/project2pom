package testDriven;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandleShadowDOM {

	static WebDriver driver;
	@Test
	public void main () throws InterruptedException{
		ChromeOptions opts = new ChromeOptions();
		opts.setAcceptInsecureCerts(true);
		driver  = new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement lunchTime = (WebElement) jse.executeScript("return document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')");
		String jss = lunchTime.getText();
		System.out.println("Button text is :"+jss);
		jse.executeScript("arguments[0].click();", lunchTime);
		Thread.sleep(1000);		
		driver.quit();
	
	}
}
