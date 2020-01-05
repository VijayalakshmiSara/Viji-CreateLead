package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	@BeforeMethod
	public void browserLanch() {
		System.setProperty("window.chrome.driver", "hromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/contrl/main");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
