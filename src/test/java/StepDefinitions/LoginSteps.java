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
import org.openqa.selenium.support.ui.FluentWait;
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
	@Given("User launch the browser with Crorrect URl")
	public void user_launch_the_browser_with_crorrect_u_rl() {

		System.setProperty("webDriver.chrome.driver", "C:/Users/10669/git/Demo_Guru/src/test/resources/drivers/chromedriver_proxy.exe");
		 ChromeOptions options = new ChromeOptions();
	     
	        options.addArguments("--incognito");
	        
	       
	         driver = new ChromeDriver(options);
		
	//	driver= new ChromeDriver();
		//driver = new EdgeDriver();
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://automationexercise.com/");
	}

	@When("verify the logo of the page")
	public void verify_the_logo_of_the_page() {
		login = new LoginPage(driver);

	   login.isAppLogoDisplayed();
	}

	@Then("click Login button")
	public void click_login_button() {
		login.clickLogin();
		
	    
	}

	@Then("create new user name")
	public void create_new_user_name() {
	   login.EnterUser();
	}

	@Then("create new email id")
	public void create_new_email_id() {
	    login.EnterEmail();
	}

	@Then("Click the sign up button")
	public void click_the_sign_up_button() {
	    login.clickSignup();
	}

	@Then("verify the Dash board page")
	public void verify_the_dash_board_page() {
	   driver.quit();
	}



	
	
}
	





