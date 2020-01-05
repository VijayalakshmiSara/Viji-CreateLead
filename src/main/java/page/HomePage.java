package page;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public MyHomePage clickCRMLink() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);	
		return new MyHomePage();
	}
}
