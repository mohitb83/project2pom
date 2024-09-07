package testDriven;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project2.core.BaseClassLambda;

public class LambdaTestClass2 extends BaseClassLambda{
	
	public LambdaTestClass2() {
		super();
	}
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		baseLambda("chrome");
	}
	
	@Test
	public void cloudTest() throws MalformedURLException, InterruptedException {
		
		driver.get("https://practice.expandtesting.com/shadowdom");
		Thread.sleep(2000);
		String text = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text);
		driver.findElement(By.xpath("//*[@id=\"my-btn\"]"));
		String text1 = driver.findElement(By.cssSelector(".col-md-9 p")).getText();
		System.out.println("Element text is: "+text1);
		driver.quit();		
	}
}