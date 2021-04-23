package StepDefinitions;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeVV_Page;
import pages.PesquisaQA_Page;
import pages.RespostaBotaoEnviar_Page;
import pages.TestBase;

public class PesquisaQASteps_POM extends TestBase{
	HomeVV_Page vvTestPage;
	PesquisaQA_Page pesquisaQAPage;
	RespostaBotaoEnviar_Page respostaAoEnviarPage;
	

	@Given("que eu acesse a pagina da VV Test")
	public void que_eu_acesse_a_pagina_da_vv_test() throws IOException {
		System.out.println("Inside Given VV Test");
		initializeWebDriver();
		vvTestPage = new HomeVV_Page(driver);	
	}

	@Given("acesse o menu {string}")
	public void acesse_o_menu(String string) {
		pesquisaQAPage = vvTestPage.clickPesquisaQA(string);
	}

	@When("eu preencher todos os campos obrigatorios")
	public void eu_preencher_todos_os_campos_obrigatorios() {
		pesquisaQAPage.inserirNome("Marcelo Koiti");
		pesquisaQAPage.inserirSobrenome("Yamamoto");
		pesquisaQAPage.inserirEmail("mak@tst.com");
		pesquisaQAPage.inserirEmailRep("mak@tst.com");
		pesquisaQAPage.selecionarIdade();
		pesquisaQAPage.selecionarTempoQA("mais de 5 anos");
		pesquisaQAPage.selecionarFatorAtracao("Desafio");
		pesquisaQAPage.selecionarOqueMelhorar();
		pesquisaQAPage.inserirProgramacao("C++, java, android, python");
		respostaAoEnviarPage = pesquisaQAPage.apertarBotaoEnviar();	
	}

	@Then("deve ser direcionado para uma pagina de sucesso")
	public void deve_ser_direcionado_para_uma_pagina_de_sucesso() {
		boolean sucesso = respostaAoEnviarPage.lerRespostaEnviarPesquisa();
		assertEquals(true, sucesso);
	}
	
	@After
	public void closeTest() {
		quitDriver();
	}
}
