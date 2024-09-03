package testDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project2.core.BaseClass;
import com.project2.pages.LoginPage;
import com.project2.utils.Screenshots;

public class LoginPageTest extends BaseClass{
	
	public LoginPageTest() {
		super();
	}
	LoginPage lpg = new LoginPage();
	Screenshots scrn = new Screenshots();
	@BeforeTest
	public void launchBrowser() {
		browser("chrome");
	}

//	@Test(dataProvider = "dataFeed", dataProviderClass = DynamicData.class)
//	public void loginfn(String usermail, String userpass) throws InterruptedException{
//		drv.get(prop.getProperty("url"));
//		drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		Thread.sleep(2000);
//		lpg.userLogin(usermail, userpass);
//		WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Super Admin')]"))).isDisplayed();
//		System.out.println("User is logged in");
//		Thread.sleep(2000);
//	}
	
	@Test
	@Parameters({"up","ps"})
	public void loginfn2(String usermail, String userpass) throws InterruptedException{
		drv.get(prop.getProperty("url"));
		drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		lpg.userLogin(usermail, userpass);
		WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Super Admin')]"))).isDisplayed();
		System.out.println("User is logged in");
		Thread.sleep(2000);
	}
	
	// invocationCount
	// Test(groups= {"SmokeTest"}) 
	//(groups ={"smoke", "regression"})
	
	// (priority = 1)
	
	// (dependsOnMethods={"parentTest"}) 
	
	@AfterMethod
	public void quit(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			scrn.screenCapture(result.getMethod().getMethodName());
			System.out.println("Test Case "+result.getMethod().getMethodName()+" is failed");
		}
		else {
			System.out.println("Test Case "+result.getMethod().getMethodName()+" is passed");
		}
		drv.quit();
	}
}
