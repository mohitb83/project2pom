package testDriven;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project2.core.BaseClassGridLocal;

public class SeleniumGridLocal extends BaseClassGridLocal{
	public SeleniumGridLocal() {
		super();
	}
	
	@Test
	@Parameters({"browserName"})
	public void cloudTest(String bs) throws MalformedURLException, InterruptedException {
		baseLambda(bs);
		Thread.sleep(1000);
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
		driver.quit();		
	}
}