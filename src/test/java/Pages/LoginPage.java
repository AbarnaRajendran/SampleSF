package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;



public class LoginPage {
    
	WebDriver driver;
    JavascriptExecutor jsExecutor;

	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_Login = By.id("Login");
	By lbl_logo = By.id("logo");
	By btn_viewAllCard = By.xpath("(//*[contains(text(),'View All Cards')])[1]");
	By btn_category = By.id("combobox-button-228");
	By btn_Home =By.xpath("(//*[contains(text(),'Home')])[6]//parent::a");
	By btn_Home_Report =By.partialLinkText("View Report");
    By btn_Home_RecentRecords = By.xpath("//*[contains(text(),'Recent Records')]");
	By btn_Home_Explorecards=By.xpath("(//*[contains(text(),'Explore Cards')])[3]");
	By btn_account =By.xpath("(//span[contains(text(),'Accounts')]/parent::a)[1]");
	By btn_sales =By.xpath("(//span[contains(text(),'Sales')]/parent::a)[1]");
	By btn_service =By.xpath("(//span[contains(text(),'Service')]/parent::a)[1]");
	By btn_ViewReport=By.xpath("(//*[contains(text(),'View Report')])[1]");
    By btn_ViewProfile=By.id("tt-for-48:205;a");
//	By btn_Contact_import =By.xpath("//*[text()='Import']");

	By btn_Analytics=By.xpath("(//*[contains(text(),'Analytics')])[1]");
	By btn_Contact_import =By.xpath("(//*[@class=\"forceActionLink\"])[1]");
	By btn_Contact_SendListEmail =By.xpath("//*[text()='Send List Email']");
	By btn_Contact_AddToCadence =By.xpath("//*[text()='Add to Cadence']");
	By btn_Contact_New =By.xpath("//*[text()='New']");
	By btn_Contact_AssignLable =By.xpath("//*[text()='Assign Label']");
	By btn_contact =By.xpath("(//*[contains(@class,'verticalNavMenuListItem ')])[2]");

	By btn_Accounts_New=By.xpath("(//*[@class='forceActionLink'])[1]");
	By btn_Accounts_Import=By.xpath("(//*[@class='forceActionLink'])[2]");
	By btn_Accounts_AssignLabel=By.xpath("(//*[@class='forceActionLink'])[3]");

	By btn_FirstName_1 =By.xpath("(//*[@data-label='First Name'])[1]");
	By btn_FirstName_2 =By.xpath("(//*[@data-label='First Name'])[3]");
	By btn_FirstName_3 =By.xpath("(//*[@data-label='First Name'])[5]");
	By btn_LastName_1 =By.xpath("(//*[@data-label='Last Name'])[1]");
	By btn_LastName_2 =By.xpath("(//*[@data-label='Last Name'])[3]");
	By btn_LastName_3 =By.xpath("(//*[@data-label='Last Name'])[5]");

	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		  this.jsExecutor = (JavascriptExecutor) driver; 
	}

	  public void jsClick(By elementLocator) {
	        WebElement element = driver.findElement(elementLocator);
	        jsExecutor.executeScript("arguments[0].click();", element);
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
   //     jsExecutor = (JavascriptExecutor) driver;
        jsClick(btn_Home); // JS click instead of regular click()

    //	driver.findElement(btn_Home).jsClick();
    	
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
    public void click_viewProfile() {
    	driver.findElement(btn_ViewProfile).click();
    	
    }
    
	
    public void isContact_Import_Displayed() {
    	driver.findElement(btn_Contact_import).isDisplayed();
   
    }
    public void isAccount_New_Displayed() {
    	driver.findElement(btn_Accounts_New).isDisplayed();
   
    }
    public void isAccount_Import_Displayed() {
    	driver.findElement(btn_Accounts_Import).isDisplayed();
   
    }
    public void isAccount_AssignLabel_Displayed() {
    	driver.findElement(btn_Accounts_AssignLabel).isDisplayed();
   
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
    public void btn_Analytics() {
    	driver.findElement(btn_Contact_AssignLable).click();
    }

    public void scrollReport() {
        WebElement Scroll_Report =	driver.findElement(btn_Home_Report);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Scroll_Report);
    }
    public void scrollToRecentRecords() {
        WebElement Scroll_RecentRecords =	driver.findElement(btn_Home_RecentRecords);
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Scroll_RecentRecords);
    }
    public void scrollToViewReports() {
        WebElement Scroll_ViewReports =	driver.findElement(btn_ViewReport);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Scroll_ViewReports);
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }
    public void TxtFirstName_1() {
    	WebElement Txt1=	driver.findElement(btn_FirstName_1);
    	String text = Txt1.getText();
    	System.out.println("First Name Text: " + text); 
    }
    public void TxtFirstName_2() {
    	WebElement Txt2=	driver.findElement(btn_FirstName_2);
    	String text = Txt2.getText();
    	System.out.println("First Name Text: " + text); 
    }
    public void TxtFirstName_3() {
    	WebElement Txt3=	driver.findElement(btn_FirstName_3);
    	String text = Txt3.getText();
    	System.out.println("First Name Text: " + text); 
    }
    public void TxtLastName_1() {
    	WebElement Txt11=	driver.findElement(btn_LastName_1);
    	String text = Txt11.getText();
    	System.out.println("First Name Text: " + text); 
    }
    
    public void TxtLastName_2() {
    	WebElement Txt12=	driver.findElement(btn_LastName_2);
    	String text = Txt12.getText();
    	System.out.println("First Name Text: " + text); 
    }
    public void TxtLastName_3() {
    	WebElement Txt13=	driver.findElement(btn_LastName_1);
	String text = Txt13.getText();
	System.out.println("First Name Text: " + text);
    }
    public void Txt_ExploreCards() {
    	WebElement TxtExplore=	driver.findElement(btn_Home_Explorecards);
    	String text = TxtExplore.getText();
    	System.out.println("First Name Text: " + text); 
    }
   
}
