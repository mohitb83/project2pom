package testDriven;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.project2.core.BaseClass;

public class WindowHandles extends BaseClass{
	
	
	public WindowHandles() {
		super();
	}
	   @Test
	   public void windowHandle() throws Exception {
	  //    WebDriver driver = new ChromeDriver();
		   browser("chrome");
	      drv.get("https://www.tutorialspoint.com/index.htm");
	      drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	      String currentwindow = drv.getWindowHandle();
	      drv.switchTo().newWindow(WindowType.WINDOW);
	      drv.navigate().to("https://www.lambdatest.com/");
	      Thread.sleep(2000);
	      Set<String> allWindows = drv.getWindowHandles();
	      System.out.println("Current Window is: "+currentwindow);
	      for (String wins : allWindows) {
	    	  System.out.println("All window handles: "+wins);
	      }
//	      Iterator<String> i = allWindows.iterator();
//	      while(i.hasNext()){
//	         String childwindow = i.next();
//	         if(!childwindow.equalsIgnoreCase(currentWindow)){
//	            driver.switchTo().window(childwindow);
//	            System.out.println("The child window is "+childwindow);
//	         } else {
//	            System.out.println("There are no children");
//	         }
//	      }
	      drv.quit();
	   }
	}
