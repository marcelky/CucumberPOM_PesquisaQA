package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PesquisaQA_Page {
	WebDriver driver;
	By txt_nome 		= By.id("nf-field-5");
	By txt_sobrenome 	= By.id("nf-field-6");
	By txt_email 		= By.id("nf-field-7");
	By txt_email_rep	= By.id("nf-field-8");
	By radio_idade      = By.id("nf-label-class-field-10-1");	
	By drop_tempoQA		= By.id("nf-field-11");	
	By drop_atraiu 		= By.id("nf-field-12");	
	By radio_melhorar   = By.id("nf-label-class-field-13-1");
	By txt_programacao  = By.id("nf-field-14");	
	By btn_enviar		= By.id("nf-field-16");
	
	public PesquisaQA_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inserirNome(String nome) {
		driver.findElement(txt_nome).sendKeys(nome);
	}
	
	public void inserirSobrenome(String sobrenome) {
		driver.findElement(txt_sobrenome).sendKeys(sobrenome);
	}	
	
	public void inserirEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void inserirEmailRep(String email) {
		driver.findElement(txt_email_rep).sendKeys(email);
	}
	
	public void selecionarIdade() {
		driver.findElement(radio_idade).click();
	}
	
	public void selecionarTempoQA(String tempo) {
		Select sel_TempoQA = new Select(driver.findElement(drop_tempoQA));
		sel_TempoQA.selectByVisibleText(tempo);
	}

	public void selecionarFatorAtracao(String atracao) {
		Select sel_Atracao = new Select(driver.findElement(drop_atraiu));
		sel_Atracao.selectByVisibleText(atracao);
	}
	
	public void selecionarOqueMelhorar() {
		driver.findElement(radio_melhorar).click();
	}

	public void inserirProgramacao(String prog) {
		driver.findElement(txt_programacao).sendKeys(prog);
	}
	
	public RespostaBotaoEnviar_Page apertarBotaoEnviar() {
		driver.findElement(btn_enviar).click();
		return new RespostaBotaoEnviar_Page(driver);
	}
	
}
