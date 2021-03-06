package br.com.advantage.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.advantage.logic.ConsultarAdicionarLogic;
import br.com.advantage.logic.DriverElement;
import br.com.advantage.logic.LoginLogoutLogic;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ConsultarAdicionarStep {

	private WebDriver driver;
	private LoginLogoutLogic loginLogic;
	private ConsultarAdicionarLogic consultaLogic;

	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);
	}

	@Dado("que eu esteja na pagina")
	public void que_eu_esteja_na_pagina() {
		
		driver = DriverElement.getChromeDriver();
		loginLogic = PageFactory.initElements(driver, LoginLogoutLogic.class);
		consultaLogic = PageFactory.initElements(driver, ConsultarAdicionarLogic.class);
		loginLogic.validarSite();
	}

	@Quando("clico no icone de user")
	public void clico_no_icone_de_user() throws InterruptedException {
	  
		loginLogic.clicarNoIconeUser();
	}

	@E("preencho o login")
	public void preencho_o_login() throws InterruptedException {
	   
		loginLogic.preencherUsuario("Max_Steel249");
	}

	@E("preencho a password")
	public void preencho_a_password() throws InterruptedException {
	   
		loginLogic.preencherSenha("123456aA");
	}

	@E("clico em sign in")
	public void clico_em_sign_in() {
	
		loginLogic.clicarEmEntrar();
	}

	@E("clico na lupa de pesquisa")
	public void clico_na_lupa_de_pesquisa() throws InterruptedException {
	   
		consultaLogic.clicarNaLupaDePesquisa();
	}

	@E("digito o nome de um item")
	public void digito_o_nome_de_um_item() {
	  
		consultaLogic.digitarItem("HP H2310 In-ear Headset");
	}

	@E("clico na lupa de pesquisa novamente")
	public void clico_na_lupa_de_pesquisa_novamente() throws InterruptedException {
	 
		consultaLogic.clicarNaLupaDePesquisa();
	}

	@Entao("realizo a consulta do item")
	public void realizo_a_consulta_do_item() {
	  
		consultaLogic.validaConsultaItem();
	}

	@Entao("apago o nome do item pesquisado")
	public void apago_o_nome_do_item_pesquisado() {
	   
		consultaLogic.apagarItem();
	}
	
	@E("clico no produto")
	public void clico_no_produto() throws InterruptedException {
	    
		consultaLogic.clicarNoProduto();
	}

	@E("clico em adicionar ao carrinho")
	public void clico_em_adicionar_ao_carrinho() throws InterruptedException {
	    
		consultaLogic.adicionarNoCarrinho();
	}

	@E("clico no carrinho")
	public void clico_no_carrinho() throws InterruptedException {
	    
		consultaLogic.clicarEmCarrinho();
	}

	@Entao("valido que o item foi adicionado")
	public void valido_que_o_item_foi_adicionado() throws InterruptedException {
	  
		consultaLogic.validaItemAdicionado();
	}
	
	@E("valido que o item esta no carrinho")
	public void valido_que_o_item_esta_no_carrinho() throws InterruptedException {
	  
		consultaLogic.validaItemAdicionado();
	}

	@E("clico em remove")
	public void clico_em_remove() {
	    
		consultaLogic.removerItem();
	}

	@Entao("valido que o item foi removido")
	public void valido_que_o_item_foi_removido() throws InterruptedException {
	  
		consultaLogic.validaRemocao();
	}


}
