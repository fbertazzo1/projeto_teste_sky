package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;	
	                                              
	public HomePage(WebDriver driver) {   //construtor
		this.driver = driver;             //distinção para local 
	}
	public void clicarProgramacao() {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		WebElement fecharTelaBanner = driver.findElement(By.cssSelector("div[class='modal fade modal-pre-page in'] div[class='modal-dialog modal-lg'] span[class='sky_icon sky_icon-close icon_xs']"));
		js.executeScript("arguments[0].click();", fecharTelaBanner);
		
		WebElement programacao = driver.findElement(By.cssSelector("div[class='collapse navbar-collapse hidden-sm'] a[href=\"/programacao\"]"));
		js.executeScript("arguments[0].click();", programacao);		
		
		WebElement passandoAgora = driver.findElement(By.xpath("//span[text()='Passando Agora']"));
		js.executeScript("arguments[0].click();", passandoAgora);
		
		WebElement filmeAgora = driver.findElement(By.cssSelector("div[class='progress-bar-thumb']"));
		js.executeScript("arguments[0].click();", filmeAgora);
		
		}
}

