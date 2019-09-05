package com.cucumber.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.cucumber.base.BaseClass;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.pom.AutomationPage;
import com.cucumber.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass
{
public static WebDriver driver=TestRunner.driver;
public static PageObjectManager pr=new PageObjectManager(driver);


@Given("^user hit the Automationpractice website$")
	public void user_hit_the_Automationpractice_website() throws Throwable {
		  //getBrowser("chrome");
		   getUrl("http://automationpractice.com/index.php");
		    
	 	}
@When("^user click on signbutton in header location of the button$")
	public void user_click_on_signbutton_in_header_location_of_the_button() throws Throwable {
		AutomationPage ap=new AutomationPage(driver);

		
		clickOnWebElement(ap.getSignin());
	    
	  
	}

	@When("^user enter email id '(.*)' in the login page$")
	public void user_enter_email_id_sder_gmail_com_in_the_login_page(String username) throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
	    sendkeys(ap.getEmail(),username);
	    
	  
	}

	@When("^user enter password '(.*)' in the login page$")
	public void user_enter_password_sugumar_in_the_login_page(String password) throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
	    sendkeys(ap.getPassword(),password);
	    
	  
	}

	@When("^user click on the login button in the login page$")
	public void user_click_on_the_login_button_in_the_login_page() throws Throwable {
		AutomationPage ap= new AutomationPage(driver);
		clickOnWebElement(ap.getSubmitlogin());
	    
	  
	}

	@When("^user select the womens$")
	public void user_select_the_womens() throws Throwable {
	AutomationPage ap=new AutomationPage(driver);
		 mouseHOverToElement(ap.getWomens());

	  
	}

	@When("^user search the tshirt$")
	public void user_search_the_tshirt() throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
		  clickOnWebElement(ap.getTshirt());
		  
	  
	}

	@When("^user select size$")
	public void user_select_size() throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
	    clickOnWebElement(ap.getSelectsize());
	    
	  
	}

	@When("^user select colour$")
	public void user_select_colour() throws Throwable {
	   AutomationPage ap=new AutomationPage(driver);
	   clickOnWebElement(ap.getSelectcolour());
	   
	  
	}

	@When("^user go to product$")
	public void user_go_to_product() throws Throwable {
	   
		AutomationPage ap= new AutomationPage(driver);
	    mouseHOverToElement(ap.getProductmouseover());
	    }

	@When("^user select the product$")
	public void user_select_the_product() throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
		clickOnWebElement(ap.getSelecttheproduct());
	    }

	@When("^user select addtocart$")
	public void user_select_addtocart() throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
	    clickOnWebElement(ap.getAddtocart());
	    
	  
	}

	@When("^user select proceedtocheck$")
	public void user_select_proceedtocheck() throws Throwable {
		AutomationPage ap=new AutomationPage(driver);
	    clickOnWebElement(ap.getProceedtocheck());
	    
	  
	}

	@When("^user select proceedtocheck(\\d+)$")
	public void user_select_proceedtocheck(int arg1) throws Throwable {
	   
		AutomationPage ap =new AutomationPage(driver);
	    clickOnWebElement(ap.getProceedtocheck1());

	}

	@When("^user select agree$")
	public void user_select_agree() throws Throwable {
	   
		AutomationPage ap =new AutomationPage(driver);
	    clickOnWebElement(ap.getAgreeselect());
	    	  
	}

	@When("^user seleck bankpayment$")
	public void user_seleck_bankpayment() throws Throwable {
	   
		AutomationPage ap =new AutomationPage(driver);
	    clickOnWebElement(ap.getBankpay());

	}

	@When("^user select confirm order$")
	public void user_select_confirm_order() throws Throwable {
	   
		AutomationPage ap=new AutomationPage(driver);
	    clickOnWebElement(ap.getConfirmorder());
	    	  
	}

	@When("^user select the signout$")
	public void user_select_the_signout() throws Throwable {
		AutomationPage ap = new AutomationPage(driver);
	    clickOnWebElement(ap.getLogout());
	    
	  
	}

}