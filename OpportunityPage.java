package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basepackage.ProjectSpecific;

public class OpportunityPage extends ProjectSpecific {
	
	public OpportunityPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public OpportunityPage click_Newtab() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		return this;
	}
	
	public OpportunityPage EnterNameField() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by SaravanaKarthik");
		return this;
	}
	
	public OpportunityPage EnterAmount() {
	driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("45,000");
	return this;
	}
	
	public OpportunityPage EnterTodayDate() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//button[@name='today']")).click();
	Thread.sleep(5000);
	return this;
	}
	
	
	public OpportunityPage clickStageoption() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement StageClick = driver.findElement(By.xpath("//button[@aria-label='Stage']"));
		js.executeScript("arguments[0].click();", StageClick);
		return this;
	}
	public OpportunityPage selectNeedAnalysis() throws InterruptedException {
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		 return this;
	}
   
	public OpportunityViewPage ClickSave() {
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    return new OpportunityViewPage(driver);
	}

}
