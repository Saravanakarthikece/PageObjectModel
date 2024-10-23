package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basepackage.ProjectSpecific;

public class SalesPage extends ProjectSpecific {
	
	public SalesPage(ChromeDriver driver) {
		
		this.driver=driver;
		
	}
	
	public OpportunityPage click_Opportunitytab() throws InterruptedException {
		
		WebElement opportunityTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",opportunityTab);
		
		return new OpportunityPage(driver);
		
		
	}

}
