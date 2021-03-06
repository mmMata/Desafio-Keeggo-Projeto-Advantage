package br.com.advantage.logic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.advantage.page.CadastroPage;

public class CadastroLogic {
	
	private CadastroPage cadastroPage;
	
	final WebDriver driver;
	
	public CadastroLogic(WebDriver driver) 
	{
		cadastroPage = new CadastroPage(driver);
		this.driver = driver;
	}
	
	public void validacaoDoSiteAdvantage() throws InterruptedException 
	{
		
		driver.getCurrentUrl().equals("http://advantageonlineshopping.com/#/");
	}
	
	public void clicarNoIconeUsuario() throws InterruptedException 
	{
		Thread.sleep(3000);
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		jsexe.executeScript("javascript:void(0)", cadastroPage.buttonUser);
		cadastroPage.buttonUser.click();
	}
	
	public void clicarEmCriarNovaConta() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		jsexe.executeScript("javascript:void(0)", cadastroPage.buttonNewAccout);
		cadastroPage.buttonNewAccout.click();
		
	}
	
	public void preencherNomeDeUsuario(String username)
	{
		cadastroPage.inputUsernameRegister.sendKeys(username);
	}
	
	public void preencherEmail(String email)
	{
		cadastroPage.inputEmailRegister.sendKeys(email);
	}
	
	public void preencherSenha(String senha)
	{
		cadastroPage.inputPasswordRegister.sendKeys(senha);
	}
	
	public void confirmarSenha(String csenha)
	{
		cadastroPage.inputConfirmPasswordRegister.sendKeys(csenha);
	}
	
	public void preencherPrimeiroNome(String nome)
	{
		cadastroPage.inputLastNameRegister.sendKeys(nome);
	}
	
	public void preencherSegundoNome(String lnome)
	{
		cadastroPage.inputLastNameRegister.sendKeys(lnome);
	}
	
	public void preencherNumeroDeTelefone(String telefone)
	{
		cadastroPage.inputPhoneNumberRegister.sendKeys(telefone);
	}
	
	public void selecionarPais(String valor)
	{
		WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void preencherCidade(String cidade)
	{
		cadastroPage.inputCityRegister.sendKeys(cidade);
	}
	
	public void preencherEndereco(String endereco)
	{
		cadastroPage.inputAdressRegister.sendKeys(endereco);
	}
	
	public void preencherEstado(String estado) 
	{
		cadastroPage.inputSPRRegister.sendKeys(estado);
	}
	
	public void preencherCodigoPostal(String codigo)
	{
		cadastroPage.inputPostalCodeRegister.sendKeys(codigo);
	}
	
	public void clicarEmConcordarComOsTermos()
	{
		cadastroPage.inputIAgreeRegister.click();
	}
	
	public void clicarEmRegistrar()
	{
		cadastroPage.buttonRegister.click();
	}
	
	public void validarTelaInicial()
	{
		driver.getCurrentUrl().equals("http://advantageonlineshopping.com/#/");
	}
	
	public void validarErroDeCadastro()
	{
		driver.getCurrentUrl().equals("http://advantageonlineshopping.com/#/register");
	}

}
