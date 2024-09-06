package testDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDom2 {

	WebDriver driver;

	@Test
	public void shadowDom2() throws InterruptedException {

// Method 1 - 

		/*
		 * ChromeOptions opts = new ChromeOptions(); opts.setAcceptInsecureCerts(true);
		 * driver = new ChromeDriver(opts); driver.manage().window().maximize();
		 * driver.get("https://practice.expandtesting.com/shadowdom");
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		 * Thread.sleep(5000); JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * WebElement lunchTime = (WebElement) jse.
		 * executeScript("return document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')"
		 * ); String jss = lunchTime.getText();
		 * System.out.println("Button text is :"+jss);
		 * jse.executeScript("arguments[0].click();", lunchTime); Thread.sleep(1000);
		 * driver.quit();
		 */

// Method 2
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement elem = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot()
				.findElement(By.cssSelector("#my-btn"));

		String btnText = elem.getText();
		System.out.println("Shadow button text is :" + btnText);
		Thread.sleep(2000);

		driver.quit();

	}
}
