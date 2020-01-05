package page;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	public FindLeadsPage enterFirstName() {
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Viji");
		return this;
	}
	public FindLeadsPage clickFindLeads() {
		driver.findElementByXPath("(//button[@class = 'x-btn-text'])[7]").click();
		return this;
	}
	
}
