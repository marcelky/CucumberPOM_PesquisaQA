package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RespostaBotaoEnviar_Page {
	WebDriver driver;

	By txt_mensagem_pagina = By.xpath("//*[contains(text(),'Your form has been successfully submitted')]");
	
	public RespostaBotaoEnviar_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean lerRespostaEnviarPesquisa() {
		String resultado = driver.findElement(txt_mensagem_pagina).getAttribute("textContent");	
		if (resultado!=null) {
			return true;
		}else {
			return false;
		}			
	}	
}
