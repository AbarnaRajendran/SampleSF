package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;



public class LoginPage {
    
	WebDriver driver;
    JavascriptExecutor jsExecutor;

	
	By lbl_Logo = By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By btn_login = By.xpath("//*[contains(text(),' Signup / Login')]");
	
	By txt_user = By.xpath("//input[@placeholder='Name']");
	By txt_email = By.xpath("//input[@data-qa='signup-email']");

	By btn_signup = By.xpath("//button[normalize-space()='Signup']");
	By txt_Valid_email = By.xpath("//input[@data-qa='login-email']");
	By txt_Password = By.xpath("//input[@placeholder='Password']");
    By btn_Log =By.xpath("//button[normalize-space()='Login']");
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		  this.jsExecutor = (JavascriptExecutor) driver; 
	}
	 public void isAppLogoDisplayed() {
	    	driver.findElement(lbl_Logo).isDisplayed();
	    	
	    }
	 public void clickLogin() {
	    	driver.findElement(btn_login).click();
	    	
	    }
	 public void EnterUser() {
	    	driver.findElement(txt_user).sendKeys("Abarna");
	    	
	    }
	 public void EnterEmail() {
	    	driver.findElement(txt_email).sendKeys("abarna.rajendran@expleo");
	    }
	 public void clickSignup() {
	    	driver.findElement(btn_signup).click();
	    }
	 public void EnterValidEmail() {
	    	driver.findElement(txt_Valid_email).sendKeys("abarnaraj@gmail.com");
	    }
	 public void EnterPassword() {
	    	driver.findElement(txt_Password).sendKeys("AbarnaRaj");
	    }
	 public void click_Login() {
	    	driver.findElement(btn_Log).click();
	    	
	    }
	 public void EnterInValidEmail() {
	    	driver.findElement(txt_Valid_email).sendKeys("abarnaraj@gmail.commmm");
	    }
	 public void EnterInPassword() {
	    	driver.findElement(txt_Password).sendKeys("AbarnaRajjjjj");
	    }
}