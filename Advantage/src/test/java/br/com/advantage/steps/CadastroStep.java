package br.com.advantage.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.advantage.logic.CadastroLogic;
import br.com.advantage.logic.DriverElement;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastroStep {

	private CadastroLogic cadastroLogic;
	private WebDriver driver;

	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);
	}

	@Dado("que eu esteja no site Advantage")
	public void que_eu_esteja_no_site_advantage() throws Throwable {
		driver = DriverElement.getChromeDriver();
		cadastroLogic = PageFactory.initElements(driver, CadastroLogic.class);
		cadastroLogic.validacaoDoSiteAdvantage();

	}

	@Quando("clico no icone de usuario")
	public void clique_no_icone_de_usuario() throws Throwable {

		cadastroLogic.clicarNoIconeUsuario();

	}

	@E("clico em criar nova conta")
	public void clique_em_criar_nova_conta() throws Throwable {

		cadastroLogic.clicarEmCriarNovaConta();
	}

	@E("preencho o nome de usuario")
	public void preencho_o_nome_de_usuario() {
		
		cadastroLogic.preencherNomeDeUsuario("Max_Steel249");
	}

	@E("preencho o email")
	public void preencho_o_email() {
		
		cadastroLogic.preencherEmail("ggggggg@teste.com");
	}

	@E("preencho a senha")
	public void preencho_a_senha() {
		
		cadastroLogic.preencherSenha("123456aA");
		
	}

	@E("confirmo a senha")
	public void confirmo_a_senha() {
		
		cadastroLogic.confirmarSenha("123456aA");
	}

	@E("preencho o primeiro nome")
	public void preencho_o_primeiro_nome() {
		
		cadastroLogic.preencherPrimeiroNome("Maxxxxy");
	}

	@E("preencho o segundo nome")
	public void preencho_o_segundo_nome() {
		
		cadastroLogic.preencherSegundoNome("Mata");
		
	}

	@E("preencho o numero de telefone")
	public void preencho_o_n_mero_de_telefone() {
		
		cadastroLogic.preencherNumeroDeTelefone("55 22 9999 9999");
		
	}

	@E("selecione o pais")
	public void selecione_o_pais() {
		
		cadastroLogic.selecionarPais("Brazil");
		
	}

	@E("preencho a cidade")
	public void preencho_a_cidade() {
		
		cadastroLogic.preencherCidade("São Paulo");
		
	}

	@E("preencho o endereco")
	public void preencho_o_endere_o() {
		
		cadastroLogic.preencherEndereco("Rua1");
		
	}

	@E("preencho o estado")
	public void preencho_o_estado() {
		
		cadastroLogic.preencherEstado("SP");
	}

	@E("preencho o codigo postal")
	public void preencho_o_c_digo_postal() {
		
		cadastroLogic.preencherCodigoPostal("5555 555");
	}

	@E("clico em concordo com os termos de condicoes")
	public void clico_em_concordo_com_os_termos_de_condicoes() {
		
		cadastroLogic.clicarEmConcordarComOsTermos();
		
	}

	@E("preencho o nome de usuario ja existente")
	public void preencho_o_nome_de_usuario_ja_existente() {
		
		cadastroLogic.preencherNomeDeUsuario("Max_Steel249");
		
	}


	@E("clico em registrar")
	public void clique_em_registrar() {
		cadastroLogic.clicarEmRegistrar();
	}

	@Entao("sou direcionado para tela inicial da pagina")
	public void sou_direcionado_para_tela_inicial_da_pagina() throws Throwable {

		cadastroLogic.validarTelaInicial();
	}

	@Entao("permanesso na tela de cadastro")
	public void permanesso_na_tela_de_cadastro_e_valido_a_mensagem_de_erro() throws Throwable {

		cadastroLogic.validarErroDeCadastro();
	}
}
