package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.Homepage;
import com.cucumber.pom.LoginPage;
import com.cucumber.pom.OrderPage;

public class PageObjectManager {

	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
	
		this.driver=driver;
		
		
	}

	private Homepage hp;
	public WebDriver getDriver() {
		return driver;
	}
	public Homepage getHp() {
		return hp;
	}
	public LoginPage getLp() {
		return lp;
	}
	public OrderPage getOp() {
		return op;
	}

	private LoginPage lp;
	private OrderPage op;
	

}
