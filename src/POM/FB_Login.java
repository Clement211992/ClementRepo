package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB_Login {
	WebDriver driver;
	FB_Page_Repo FB_Page;

	@BeforeTest
	public void setInitials() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Clement\\Documents\\Java_Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Test
	public void LoginMethod() {
		FB_Page = new FB_Page_Repo(driver);
		FB_Page.LoginFB("Hello", "123");
		System.out.println("PAge Opened");
	}

	@Test
	public void print() {

	}

	@AfterTest
	public void close_Browser() {
		driver.close();
		System.out.println("Page Closed");
	}
}
