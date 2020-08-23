package base;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

//JUnit 5
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;

public class BaseTests {

	private static WebDriver driver;
	protected HomePage homePage;
		
	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\84\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@BeforeEach
	public void carregarPaginaInicial() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
			
		driver.get("http://www.sky.com.br​");
		
		homePage = new HomePage(driver);		
	}	
	@AfterAll
	public static void finalizar() {
		driver.quit();
	}
	
}