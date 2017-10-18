package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Page_Repo {
	
	WebDriver driver;

	@FindBy(name="email")
	WebElement UserName;
	
	@FindBy(name="pass")
	WebElement Password;
	
	@FindBy(id="loginbutton")
	WebElement LoginButon;
	
	public FB_Page_Repo(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void SetUser(String UName) {
		UserName.sendKeys(UName);
	}
	
	public void SetPass(String Pass) {
		Password.sendKeys(Pass);
	}
	
	public void ClickLogin() {
		LoginButon.click();
	}
	
	public void LoginFB(String UName1, String Pass1) {
		this.SetUser(UName1);
		this.SetPass(Pass1);
		this.ClickLogin();
	}

}
