package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import basepackage.ProjectSpecific;

public class OpportunityViewPage extends ProjectSpecific {
	
	public OpportunityViewPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public OpportunityViewPage verifyName() {
	    WebElement OppName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
	     
	    String OpportunityName = OppName.getText();
	    System.out.println(OpportunityName);
	    
	    String ExpectingText = "Salesforce Automation by SaravanaKarthik";
	    
	    Assert.assertEquals(OpportunityName, ExpectingText);
	    System.out.println("The opportunity Name is Verified");
	    driver.close();
	    
	    return this;
	}

}
