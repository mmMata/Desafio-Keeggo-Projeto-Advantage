//package br.com.advantage.logic;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import br.com.advantage.helpers.Constant;
//import br.com.advantage.helpers.ExcelUtils;
//
//
//public class Cadastro {
//
//	final WebDriver driver;
//
//	public Cadastro(WebDriver driver) {
//		
//		//PageFactory.initElements(driver, this);
//		this.driver = driver;
//	}
//
//	/**
//	 * Classe que preenche todos os campos da p?gina de registro(RegisterPage):
//	 * Recebe como par?metro um objeto do tipo integer
//	 **/
//	public void setUserRegister(int numberUser) throws Exception {
//
//		CadastroLogic cadastroLogic = PageFactory.initElements(driver, CadastroLogic.class);
//		ExcelUtils.setExcelFile(Constant.File_DataUserRegister, "Users");
//
//		cadastroLogic.preencherNomeDeUsuario(ExcelUtils.getCellData(numberUser, 1));
//		cadastroLogic.preencherEmail(ExcelUtils.getCellData(numberUser, 2));
//		cadastroLogic.preencherSenha(ExcelUtils.getCellData(numberUser, 3));
//		cadastroLogic.confirmarSenha(ExcelUtils.getCellData(numberUser, 3));
//
//		cadastroLogic.preencherPrimeiroNome(ExcelUtils.getCellData(numberUser, 4));
//		cadastroLogic.preencherSegundoNome(ExcelUtils.getCellData(numberUser, 5));
//		cadastroLogic.preencherNumeroDeTelefone(ExcelUtils.getCellData(numberUser, 6));
//
//		cadastroLogic.selecionarPais(ExcelUtils.getCellData(numberUser, 7));
//		cadastroLogic.preencherCidade(ExcelUtils.getCellData(numberUser, 8));
//		cadastroLogic.preencherEndereco(ExcelUtils.getCellData(numberUser, 9));
//		cadastroLogic.preencherEstado(ExcelUtils.getCellData(numberUser, 10));
//		cadastroLogic.preencherCodigoPostal(ExcelUtils.getCellData(numberUser, 11));
//
//	}
//
//}
