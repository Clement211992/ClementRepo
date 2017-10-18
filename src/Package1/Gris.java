package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Gris {
	WebDriver driver;
	String baseURL;
	String nodeURL;

	@BeforeTest
	public void beforeTest() throws MalformedURLException {

	}

	@Test
	public void f() throws MalformedURLException {
		baseURL = "http://www.facebook.com";
		nodeURL = "http://localhost:4444/wd/hub";

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Clement\\Documents\\Java_Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL), cap);

		driver.get(baseURL);
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
