package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeVV_Page {
	WebDriver driver;	
	By lnk_pesquisaQA = By.id("menu-item-226");

	
	//constructor
	public HomeVV_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

     
	public PesquisaQA_Page clickPesquisaQA(String linkName) {
		driver.findElement(lnk_pesquisaQA).click();		
		return new PesquisaQA_Page(driver);
	}
}
