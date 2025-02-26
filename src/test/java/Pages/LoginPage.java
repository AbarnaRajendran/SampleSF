package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
    
	WebDriver driver;
	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_Login = By.id("Login");
	By lbl_logo = By.id("logo");
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	
	}
	public void loginValidUser(String username,String password) {
		driver.findElement(txt_username).sendKeys(username);

		driver.findElement(txt_password).sendKeys(password);
	driver.findElement(btn_Login).click();
	}
	
	public void clickLogin() {
		driver.findElement(btn_Login).click();
	
	}
    public void isAppLogoDisplayed() {
    	driver.findElement(lbl_logo).isDisplayed();
    	
    }
	




}
