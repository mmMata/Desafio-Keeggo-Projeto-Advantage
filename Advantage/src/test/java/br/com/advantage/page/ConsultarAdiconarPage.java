package br.com.advantage.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConsultarAdiconarPage {

	final WebDriver driver;

	public ConsultarAdiconarPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='SEARCH']/*[@id='menuSearch' and name()='svg']")

	public WebElement inputSearch;

	@FindBy(how = How.XPATH, using = "//input[@id='autoComplete']")

	public WebElement inputAutoComplete;

	@FindBy(how = How.XPATH, using = "//a[@class='productName ng-binding']")

	public WebElement getItem;

	@FindBy(how = How.XPATH, using = "//img[@src='/catalog/fetchImage?image_id=2100']") 

	public WebElement item;

	@FindBy(how = How.XPATH, using = "//button[@name='save_to_cart']")

	public WebElement buttonAddToCart;

	@FindBy(how = How.XPATH, using = "//a[@id='shoppingCartLink']/*[@id='menuCart' and name()='svg']")

	public WebElement buttonCart;

	@FindBy(how = How.XPATH, using = "//a[@class='remove red ng-scope']")

	public WebElement buttonRemove;

}
