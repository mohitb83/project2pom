package testDriven;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleShadowDOM {

	static WebDriver driver;

	@Test
	public void main() throws InterruptedException {
		ChromeOptions opts = new ChromeOptions();
		opts.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("chrome://settings/security");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		Thread.sleep(1000);
// Method 1	
		/*
		 * WebElement snackTime =
		 * driver.findElement(By.xpath("/html/body/settings-ui")).getShadowRoot()
		 * .findElement(By.cssSelector("settings-main#main")).getShadowRoot()
		 * .findElement(By.cssSelector("settings-basic-page")).getShadowRoot()
		 * .findElement(By.
		 * cssSelector("#basicPage > settings-section.expanded > settings-privacy-page")
		 * ).getShadowRoot()
		 * .findElement(By.cssSelector("#security > settings-security-page")).
		 * getShadowRoot()
		 * .findElement(By.cssSelector("#httpsOnlyModeToggle")).getShadowRoot()
		 * .findElement(By.cssSelector("#control")).getShadowRoot()
		 * .findElement(By.cssSelector("#knob")); Thread.sleep(2000); snackTime.click();
		 * Thread.sleep(1000); snackTime.click();
		 */
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
// Method 2		
		JavascriptExecutor jsss = (JavascriptExecutor) driver;
		WebElement snackTime1 = (WebElement) jsss.executeScript(
				"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\")\r\n"
						+ ".shadowRoot.querySelector(\"settings-basic-page\")\r\n"
						+ ".shadowRoot.querySelector(\"#basicPage > settings-section.expanded > settings-privacy-page\")\r\n"
						+ ".shadowRoot.querySelector(\"#security > settings-security-page\")\r\n"
						+ ".shadowRoot.querySelector(\"#httpsOnlyModeToggle\")\r\n"
						+ ".shadowRoot.querySelector(\"#control\")\r\n" + ".shadowRoot.querySelector(\"#knob\")");
//		jsss.executeScript("scroll, (0,250);");
//      jse.executeScript("arguments[0].click();", snackTime1);

		Thread.sleep(2000);
		snackTime1.click();

		Thread.sleep(1000);
		snackTime1.click();
		
		Thread.sleep(2000);
		driver.quit();

	}
}
