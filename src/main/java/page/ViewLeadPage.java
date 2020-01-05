package page;



import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage verifyFirstName() {
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if(text.contains("Viji")) {
			System.out.println("Test Case Passed");
		}
		else System.out.println("Test Case Failed");
		return this;
	}
}
