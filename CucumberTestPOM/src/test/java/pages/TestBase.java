package pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBase {  
public WebDriver driver;  

	public void initializeWebDriver() throws IOException {  
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");  
		driver = new ChromeDriver();  

		// To maximize browser  
		driver.manage().window().maximize();  

		// Implicit wait  
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// To open VV page site  
		//driver.get("https://bit.ly/3jOMrR9");
		driver.get("http://www.lourencodemonaco.com.br/vvtest");

	}  

	public void quitDriver() {  
		driver.quit();  
	}  
}