package br.com.advantage.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage {
	
	final WebDriver driver;

	public LoginLogoutPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

		this.driver = driver;
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='hrefUserIcon']")

	public WebElement buttonUser;
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")

	public WebElement inputUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")

	public WebElement inputPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@id='sign_in_btnundefined']")

	public WebElement buttonSignIn;
	
	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Max_Steel249')])[2]")

	public WebElement getName;
	
	@FindBy(how = How.XPATH, using = "//label[@id='signInResultMessage']")

	public WebElement getOR;
	
	@FindBy(how = How.XPATH, using = "(//label[@class='option roboto-medium ng-scope'])[3]")

	public WebElement buttonSignOut;
	
	

}
