package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeHomePage;
import pom.POMActitimeLeaveTypesPage;
import pom.POMActitimeLoginPage;

public class TESTActitimeCreateLeave 
{
	@Test
	public void createLeave() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login = new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeHomePage click1 = new POMActitimeHomePage(driver);
		click1.leaveTypesMethod();
		
		POMActitimeLeaveTypesPage click2 = new POMActitimeLeaveTypesPage(driver);
		click2.createLeaveTypeMethod();
		Thread.sleep(2000);
		click2.editLeaveNameMethod();
		Thread.sleep(2000);
		click2.deleteLeaveTypeMethod();
	}
}
