package br.com.advantage.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import br.com.advantage.logic.DriverElement;
import br.com.advantage.logic.LoginLogoutLogic;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginLogoutStep {

	private LoginLogoutLogic loginLogic;
	private WebDriver driver;


	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);
	}

	@Dado("que eu esteja no site")
	public void que_eu_esteja_no_site() {
		
		driver = DriverElement.getChromeDriver();
		loginLogic = PageFactory.initElements(driver, LoginLogoutLogic.class);
		loginLogic.validarSite();
	}

	@Quando("clico no icone user")
	public void clico_no_icone_user() throws InterruptedException {

		loginLogic.clicarNoIconeUser();
	}

	@E("preencho o usuario")
	public void preencho_o_usuario() throws InterruptedException {

		loginLogic.preencherUsuario("Max_Steel249");
		
	}

	@E("preencho uma senha")
	public void preencho_uma_senha() throws InterruptedException {

		loginLogic.preencherSenha("123456aA");
	}

	@E("clico em entrar")
	public void clico_em_entrar() {

		loginLogic.clicarEmEntrar();
	}

	@Entao("realizo o login")
	public void realizo_o_login() throws InterruptedException {

		loginLogic.validarLogin();
	}

	@E("preencho a senha invalida")
	public void preencho_a_senha_invalida() throws InterruptedException {

		loginLogic.preencherSenha("12345Ss");
	}

	@Entao("permanesso na tela de login")
	public void permanesso_na_tela_de_login() {

		loginLogic.validarTelaDeLogin();
	}
	
	@E("clico em user apos o login")
	public void clico_em_user_apos_o_login() throws InterruptedException {
	   
		loginLogic.clicarNoIconeUser();
	}

	@E("cliclo em Sign Out")
	public void cliclo_em_sign_out() throws InterruptedException {
	   
		loginLogic.clicarEmSignOut();
	}

	@Entao("realizo o logout")
	public void realizo_o_logout() {
		
	    loginLogic.validaLogOut();
	}
}
