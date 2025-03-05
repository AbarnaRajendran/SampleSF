package StepDefinitions;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;





public class LoginSteps {

	
	 WebDriver driver;
     LoginPage login;
	@Given("User into the Login Page")
	public void user_into_the_login_page() {
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/10669/git/Demo_Guru/src/test/resources/drivers/chromedriver_proxy.exe");
		driver= new ChromeDriver();
		//driver = new EdgeDriver();
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
	   
	}


	@Given("User Enter {string} and {string}")
	public void user_enter_and(String username, String password) {
    
		login = new LoginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
	}


	@When("Verify the logo of the current page")
	public void verify_the_logo_of_the_current_page() {
	   login.isAppLogoDisplayed();
	   System.out.println("Logo visible");
	}

	@And("User click the login button")
	public void user_click_the_login_button() {
		login.clickLogin();
	   
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    driver.quit();
	}
	
	@Then("select view all cart")
	public void select_view_all_cart() throws InterruptedException {
		Thread.sleep(1000);
	//	login.click_Home();
//	    Alert alert = driver.switchTo().alert();
//	    System.out.println(alert.getText());
//	    alert.accept();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='slds-button' and contains(text(), 'View All Cards')])[2]")));
		//login.clickViewAll();
	}
	@And("list out the all drop down values")
	public void list_out_the_all_drop_down_values() {
		login.clickCategory();
		
	}

	 @Then("select the contact menu")
	    public void select_the_contact_menu() throws InterruptedException {
		 Thread.sleep(1000);
		 login.click_contact();
	 	   System.out.println("contact Menu Visible");

	       
	    }

	    @Then("check whether all listed tap are visible")
	    public void check_whether_all_listed_tap_are_visible() throws InterruptedException {
	    	Thread.sleep(1000);
	    	login.isContact_Import_Displayed();
	 	   System.out.println("Import");

	    	login.isContact_SendListEmail_Displayed();
		 	   System.out.println("SendListEmail");

	    	login.isContact_AddToCadence_Displayed();
		 	   System.out.println("AddToCadence");

	    	login.isContact_New_Displayed();
		 	   System.out.println("New");

	    	login.isContact_AssignLable_Displayed();
		 	   System.out.println("AssignLable");

		 	   driver.quit();
	      
	    }
	    @Then("select Home menu")
	    public void select_home_menu() throws InterruptedException {
	    	Thread.sleep(1000);
	        login.click_Home();
		 	   System.out.println("Home Menu Visible");

	    }

	    @Then("select contact menu")
	    public void select_contact_menu() {
	        login.click_contact();
		 	   System.out.println("contact Menu Visible");

	    }

	    @Then("select Accounts menu")
	    public void select_accounts_menu() {
	        login.click_accounts();
		 	   System.out.println("accounts Menu Visible");

	    }

	    @Then("select Sales menu")
	    public void select_sales_menu() {
	        login.click_sales();
		 	   System.out.println("sales Menu Visible");

	    }

	    @Then("select servies menu")
	    public void select_servies_menu() {
	        login.click_service();
		 	   System.out.println("service Menu Visible");

	        driver.quit();
	    }




	




}
