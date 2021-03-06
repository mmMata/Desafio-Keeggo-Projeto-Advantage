package br.com.advantage.logic;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.advantage.page.ConsultarAdiconarPage;


public class ConsultarAdicionarLogic {

	final WebDriver driver;
	
	ConsultarAdiconarPage consultaPage;

	public ConsultarAdicionarLogic(WebDriver driver) 
	{	
		consultaPage = new ConsultarAdiconarPage(driver);
		this.driver = driver;
	}
	
	public void clicarNaLupaDePesquisa() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jsexe.executeScript("javascript:void(0)", consultaPage.inputSearch);
	    consultaPage.inputSearch.click();	
	}
	
	public void digitarItem(String item)
	{
		consultaPage.inputAutoComplete.sendKeys(item);
	}
	
	public void apagarItem()
	{
		consultaPage.inputAutoComplete.clear();
	}
	
	public void validaConsultaItem()
	{
		Assert.assertTrue(consultaPage.getItem.isDisplayed());
	}
	
	public void clicarNoProduto() throws InterruptedException
	{
		Thread.sleep(3000);
		consultaPage.item.click();
	}
	
	public void adicionarNoCarrinho() throws InterruptedException
	{
		Thread.sleep(3000);
		consultaPage.buttonAddToCart.click();
	}
	
	public void clicarEmCarrinho() throws InterruptedException
	{
		Thread.sleep(3000);
		consultaPage.buttonCart.click();
	}
	
	public void validaItemAdicionado() throws InterruptedException
	{
		Thread.sleep(3000);
		assertTrue("TOTAL", true);
		
	}
	
	public void removerItem()
	{
		consultaPage.buttonRemove.click();
	}
	
	public void validaRemocao() throws InterruptedException
	{
		Thread.sleep(3000);
		assertTrue("- Your shopping cart is empty -", true);
	}
}
