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
	    driver.close();
	}
	
	@Then("select view all cart")
	public void select_view_all_cart() {
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contentSettings = new HashMap<String,Integer>();
		HashMap<String, Object> profile = new HashMap<String,Object>();
		HashMap<String, Object> prefs = new HashMap<String,Object>();
		
		contentSettings.put("notifications", 2);

    //    options.addArguments("--disable-notifications");  // Disable all notifications

        // Initialize ChromeDriver with the specified options
        driver = new ChromeDriver(options);
	    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
	    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertTriggerButton")));

	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	}
	@And("list out the all drop down values")
	public void list_out_the_all_drop_down_values() {
		login.clickCategory();
	}

	

	




}
