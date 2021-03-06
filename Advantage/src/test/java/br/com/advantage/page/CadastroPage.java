package br.com.advantage.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

	final WebDriver driver;

	public CadastroPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@id='hrefUserIcon']")

	public WebElement buttonUser;

	@FindBy(how = How.XPATH, using = "//a[@class='create-new-account ng-scope']")

	public WebElement buttonNewAccout;

	@FindBy(how = How.XPATH, using = "//input[@name='usernameRegisterPage']")

	public WebElement inputUsernameRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='emailRegisterPage']")

	public WebElement inputEmailRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='passwordRegisterPage']")

	public WebElement inputPasswordRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='confirm_passwordRegisterPage']")

	public WebElement inputConfirmPasswordRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='first_nameRegisterPage']")

	public WebElement inputFirstNameRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='last_nameRegisterPage']")

	public WebElement inputLastNameRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='phone_numberRegisterPage']")

	public WebElement inputPhoneNumberRegister;

	@FindBy(how = How.XPATH, using = "//select[@name='countryListboxRegisterPage']")

	public WebElement boxCountryRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='cityRegisterPage']")

	public WebElement inputCityRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='addressRegisterPage']")

	public WebElement inputAdressRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='state_/_province_/_regionRegisterPage']")

	public WebElement inputSPRRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='postal_codeRegisterPage']")

	public WebElement inputPostalCodeRegister;

	@FindBy(how = How.XPATH, using = "//input[@name='i_agree']")

	public WebElement inputIAgreeRegister;

	@FindBy(how = How.XPATH, using = "//button[@id='register_btnundefined']")

	public WebElement buttonRegister;

}
