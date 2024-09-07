package testDriven;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LambdaTestClassParallel {
	
	@Test
	@Parameters({"browserName","platform","browserVer"})
	public void cloudTest(String bName, String plat, String bver) throws MalformedURLException, InterruptedException {
		WebDriver driver = null;
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "baluja.mohit7");
		ltOptions.put("accessKey", "oeoBcWkEwBlGyBfJ5i1xHAdZBScXngp5qSeGrBJKxSjtwDgriV");
		ltOptions.put("video", true);
		ltOptions.put("build", "Single and Parallel tests");
		ltOptions.put("project", "NewTest");
		ltOptions.put("console", "true");
		ltOptions.put("selenium_version", "4.23.0");
		ltOptions.put("w3c", true);
		
		if(bName.equalsIgnoreCase("chrome")) {
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName(plat);
			browserOptions.setBrowserVersion(bver);
			
			//let capability = { console: true }
			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
		} else if(bName.equalsIgnoreCase("firefox")) {
			FirefoxOptions browserOptions = new FirefoxOptions();
			browserOptions.setPlatformName(plat);
			browserOptions.setBrowserVersion(bver);
			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
		}
		
		else {
			System.out.println("No borowser found");
		}
		
		driver.get("https://practice.expandtesting.com/shadowdom");
		Thread.sleep(2000);
		String text = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text);
		driver.findElement(By.xpath("//*[@id=\"my-btn\"]"));
		String text1 = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text1);
		driver.findElement(By.xpath("//*[@id=\"my-btn\"]"));
		String text2 = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text2);
		driver.findElement(By.xpath("//*[@id=\"my-btn\"]"));
		String text3 = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text3);
		driver.findElement(By.xpath("//*[@id=\"my-btn\"]"));
		String text4 = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text4);
		driver.findElement(By.xpath("//*[@id=\"my-btn\"]"));
		driver.quit();		
	}
}
