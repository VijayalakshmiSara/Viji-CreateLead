package page;

import org.openqa.selenium.Keys;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage enterUserName() {
		
			driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager",Keys.TAB);
		
		return this;
		
	}
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	public HomePage clickLogin() throws InterruptedException {
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		Thread.sleep(2000);
		return new HomePage();
	}
}
