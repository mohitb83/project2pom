package testDriven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindBrokenLinks {
	
	
		
	public static void main(String[] args) throws MalformedURLException {
	
		ChromeOptions optts = new ChromeOptions();
		optts.setAcceptInsecureCerts(true);
		WebDriver drvr = new ChromeDriver(optts);
		
		try {
			drvr.get("http://www.interviewbit.com");
			List<WebElement> links = drvr.findElements(By.tagName("a"));
			for(WebElement linkk : links) {
				String urrl = linkk.getAttribute("href");
				if(urrl !=null && !urrl.isEmpty()) {
					checkLinks(urrl);
				}
			
		}
			
		}catch(StaleElementReferenceException st) {
			st.printStackTrace();
		}
		finally {
			drvr.quit();
		}
	}
	
	public static void checkLinks(String linkurl) {
		
		try {
			URL url = new URL(linkurl);
			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			connect.setRequestMethod("HEAD");
			int responseCode = connect.getResponseCode();
			if(responseCode != HttpURLConnection.HTTP_OK) {
				System.out.println("Broken link: "+linkurl+" Response Code: "+responseCode);
			}
			else {
				System.out.println("Valid link: "+linkurl+" Response Code: "+responseCode);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
