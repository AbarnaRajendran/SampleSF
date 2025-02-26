package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Home_ViewAllCart_page;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Home_viewallcards {
	static WebDriver driver;
	Home_ViewAllCart_page Home_ViewAll;
	
	
	@Then("slect viw all cart")
	public void slect_viw_all_cart() {

		Home_ViewAll = new Home_ViewAllCart_page(driver);
		Home_ViewAll.clickViewAll();
	}

	@And("list out the all drop down values")
	public void list_out_the_all_drop_down_values() {
		Home_ViewAll.clickCategory();
	}

}
