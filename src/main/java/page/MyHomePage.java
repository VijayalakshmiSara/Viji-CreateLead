package page;



import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	public CreateLeadPage clickCreateLead() throws InterruptedException {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	public MyLeadsPage clickLead() {
		driver.findElementByXPath("(//div[@class = 'x-panel-header'])[2]").click();
		return new MyLeadsPage();
	}
}
