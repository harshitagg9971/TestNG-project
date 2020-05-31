package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeLoginPage;
import pom.POMActitimeTaskPage;
import pom.POMActitimeCreateProject;
import pom.POMActitimeHomePage;

public class TESTActitimeCreateProject 
{
	@Test(enabled = false)
	public void createProject() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login = new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeHomePage click1 = new POMActitimeHomePage(driver);
		click1.taskTabMethod();
		
		POMActitimeTaskPage click2 = new POMActitimeTaskPage(driver);
		click2.creatingProjectMethod();
		
		POMActitimeCreateProject click3 = new POMActitimeCreateProject(driver);
		click3.createProjectMethod();
		//click3.editProjectName();
		click3.deleteProjectMethod();
	}

}
