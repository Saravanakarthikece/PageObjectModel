package testPackage;

import org.testng.annotations.Test;

import basepackage.ProjectSpecific;
import pagePackage.LoginPage;

public class LoginTest01 extends ProjectSpecific {
	
	@Test
	public void login() throws InterruptedException {
		LoginPage tc = new LoginPage(driver);
		tc.Enter_UserName().Enter_Password().ClickLogin()
		.click_AppLaunchicon().click_viewAll()
		.Click_Sales().click_Opportunitytab().click_Newtab().EnterNameField().EnterAmount().EnterTodayDate()
		.clickStageoption().selectNeedAnalysis().ClickSave().verifyName();
		
	}

}
