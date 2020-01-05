package page;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage enterCompany() {
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys");		
		return this;
	}
	public CreateLeadPage enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Viji");
		return this;
	}
	public CreateLeadPage enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Lakshmi");
		return this;
	}
	public CreateLeadPage enterNickName() {
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Viji");
		return this;
	}
	public ViewLeadPage clickCreateLeadbutton() {		
		driver.findElementByXPath("//input[@class  = 'smallSubmit']").click();	
		return new ViewLeadPage();
	}
}
