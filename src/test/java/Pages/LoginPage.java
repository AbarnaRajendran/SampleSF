package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;



public class LoginPage {
    
	WebDriver driver;
	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_Login = By.id("Login");
	By lbl_logo = By.id("logo");
	By btn_viewAllCard = By.xpath("(//*[@class='slds-button' and contains(text(), 'View All Cards')])[2]");
	By btn_category = By.id("combobox-button-228");
	By btn_Home =By.xpath("(//*[@class='verticalNavMenuListItem slds-var-m-top_x-small'])[1]");

	
	By btn_contact =By.xpath("(//*[@class='verticalNavMenuListItem slds-var-m-top_x-small'])[2]");
	By btn_account =By.xpath("(//*[@class='verticalNavMenuListItem slds-var-m-top_x-small'])[3]");
	By btn_sales =By.xpath("(//*[@class='verticalNavMenuListItem slds-var-m-top_x-small'])[4]");
	By btn_service =By.xpath("(//*[@class='verticalNavMenuListItem slds-var-m-top_x-small'])[5]");
//	By btn_Contact_import =By.xpath("//*[text()='Import']");
	By btn_Contact_import =By.xpath("(//*[@class=\"forceActionLink\"])[1]");
	By btn_Contact_SendListEmail =By.xpath("//*[text()='Send List Email']");
	By btn_Contact_AddToCadence =By.xpath("//*[text()='Add to Cadence']");
	By btn_Contact_New =By.xpath("//*[text()='New']");
	By btn_Contact_AssignLable =By.xpath("//*[text()='Assign Label']");

	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
	}


	
	public void clickViewAll() {
		driver.findElement(btn_viewAllCard).click();
	
	}
	public void clickCategory() {
	 driver.findElement(btn_category).click();
	
	}
	public void selectContact() {
		 driver.findElement(btn_contact).click();
		
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
    public void click_Home() {
    	driver.findElement(btn_Home).click();
    	
    }
    public void click_contact() {
    	driver.findElement(btn_contact).click();
    	
    }
    public void click_accounts() {
    	driver.findElement(btn_account).click();
    	
    }
    public void click_sales() {
    	driver.findElement(btn_sales).click();
    	
    }
    public void click_service() {
    	driver.findElement(btn_service).click();
    	
    }
    
	
    public void isContact_Import_Displayed() {
    	driver.findElement(btn_Contact_import).isDisplayed();
   
    }
    public void isContact_SendListEmail_Displayed() {
    	driver.findElement(btn_Contact_SendListEmail).isDisplayed();
   
    }
    public void isContact_AddToCadence_Displayed() {
    	driver.findElement(btn_Contact_AddToCadence).isDisplayed();
   
    }
    public void isContact_New_Displayed() {
    	driver.findElement(btn_Contact_New).isDisplayed();
   
    }
    public void isContact_AssignLable_Displayed() {
    	driver.findElement(btn_Contact_AssignLable).isDisplayed();
    }

}
