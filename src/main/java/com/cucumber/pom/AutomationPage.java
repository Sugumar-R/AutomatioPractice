package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage {

	public WebDriver driver;
	
	public AutomationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath =  "//a[@class='login']")
private WebElement signin;

@FindBy(xpath = "//input[@id='email']")
private WebElement email;

@FindBy(xpath = "//input[@id='passwd']")
private WebElement password;

@FindBy(xpath = "//button[@id='SubmitLogin']")
private WebElement submitlogin;

@FindBy(xpath =  "//a[@class='sf-with-ul']")
private WebElement womens;

@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
private WebElement tshirt;

@FindBy(id = "layered_id_attribute_group_3")
private WebElement selectsize;

@FindBy(id = "layered_id_attribute_group_14")
private WebElement selectcolour;

@FindBy(xpath =  "(//img[@class='replace-2x img-responsive'])[2]")
private WebElement productmouseover;

public WebElement getSelecttheproduct() {
	return selecttheproduct;
}
@FindBy(className="product_img_link")
private WebElement selecttheproduct;

@FindBy(xpath = "//p[@id='add_to_cart']")
private WebElement addtocart;

@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
private WebElement proceedtocheck;

@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
private WebElement proceedtocheck1;

@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
private WebElement proceedtocheck2;

@FindBy(xpath = "//input[@id=\"cgv\"]") 
private WebElement agreeselect;



public WebDriver getDriver() {
	return driver;
}

public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSubmitlogin() {
	return submitlogin;
}

public WebElement getWomens() {
	return womens;
}

public WebElement getTshirt() {
	return tshirt;
}

public WebElement getSelectsize() {
	return selectsize;
}

public WebElement getSelectcolour() {
	return selectcolour;
}

public WebElement getProductmouseover() {
	return productmouseover;
}

public WebElement getAddtocart() {
	return addtocart;
}

public WebElement getProceedtocheck() {
	return proceedtocheck;
}

public WebElement getProceedtocheck1() {
	return proceedtocheck1;
}

public WebElement getProceedtocheck2() {
	return proceedtocheck2;
}

public WebElement getAgreeselect() {
	return agreeselect;
}

public WebElement getProceddtocheck3() {
	return proceddtocheck3;
}

public WebElement getBankpay() {
	return bankpay;
}

public WebElement getConfirmorder() {
	return confirmorder;
}
@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
private WebElement proceddtocheck3;

@FindBy(xpath = "//a[@class='bankwire']")
private WebElement bankpay;

@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
private WebElement confirmorder;

@FindBy(xpath = "//a[@class='logout']")
private WebElement logout;

public WebElement getLogout() {
	return logout;

}

}
