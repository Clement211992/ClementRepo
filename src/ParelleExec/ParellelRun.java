package ParelleExec;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class ParellelRun {
	
	WebDriver driver;
  @BeforeTest
  @Parameters("Browser")
  public void beforeTest(String Browser) {
	  
	  if (Browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Clement\\Documents\\Java_Eclipse\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	  else if(Browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Clement\\Documents\\Java_Eclipse\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
  }

  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
	  System.out.println(driver.getTitle());
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
