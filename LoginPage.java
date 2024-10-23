package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import basepackage.ProjectSpecific;

public class LoginPage extends ProjectSpecific {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage Enter_UserName() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		return this;

	}
	
	public LoginPage Enter_Password() {
	driver.findElement(By.id("password")).sendKeys("leaf@2024");
	return this;
	}
	
	public HomePage ClickLogin() {
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver);
		
		
	}

}
