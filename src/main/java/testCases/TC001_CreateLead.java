package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import page.*;

public class TC001_CreateLead  extends ProjectSpecificMethods {
	@Test
	public void createLead() throws InterruptedException {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMLink()
		.clickCreateLead()
		.enterCompany()
		.enterFirstName()
		.enterLastName()
		.enterNickName()
		.clickCreateLeadbutton()
		.verifyFirstName();
	}


}
