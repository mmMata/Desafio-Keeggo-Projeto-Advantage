package br.com.advantage.logic;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.advantage.page.LoginLogoutPage;

public class LoginLogoutLogic {

	private LoginLogoutPage loginPage;
	

	final WebDriver driver;

	public LoginLogoutLogic(WebDriver driver) 
	{
		
		loginPage = new LoginLogoutPage(driver);
		this.driver = driver;
	}
	
	public void validarSite()
	{
		driver.getCurrentUrl().equals("http://advantageonlineshopping.com/#/");
	}
	
	public void clicarNoIconeUser() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jsexe.executeScript("javascript:void(0)", loginPage.buttonUser);
		loginPage.buttonUser.click();
	}
	
	public void preencherUsuario(String usuario) throws InterruptedException
	{
		
		Thread.sleep(3000);
		loginPage.inputUsername.sendKeys(usuario);
		
	}
	
	public void preencherSenha(String senha) throws InterruptedException
	{
		Thread.sleep(1000);
		loginPage.inputPassword.sendKeys(senha);
		
	}
	
	public void clicarEmEntrar()
	{
		loginPage.buttonSignIn.click();
	}
	
	public void validarLogin() throws InterruptedException
	{
		Thread.sleep(1000);
		Assert.assertTrue(loginPage.getName.isDisplayed());
		
	}
	
	public void validarTelaDeLogin()
	{
		Assert.assertTrue(loginPage.getOR.isDisplayed());
		
	}
	
	public void clicarEmSignOut() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jsexe.executeScript("javascript:void(0)", loginPage.buttonSignOut);
		loginPage.buttonSignOut.click();
	}
	
	public void validaLogOut()
	{
		driver.getCurrentUrl().equals("http://advantageonlineshopping.com/#/");
	}
}
