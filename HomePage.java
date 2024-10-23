package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basepackage.ProjectSpecific;

public class HomePage extends ProjectSpecific {
	
	public HomePage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public HomePage click_AppLaunchicon()  {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		return this;
		
	}
	
	public  HomePage click_viewAll() {
		
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		return this;
	}
	
	public SalesPage Click_Sales() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		return new SalesPage(driver);
	}

}
