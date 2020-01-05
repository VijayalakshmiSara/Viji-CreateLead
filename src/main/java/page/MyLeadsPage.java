package page;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public FindLeadsPage clickfindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}
}
