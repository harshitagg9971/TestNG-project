package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeCreateTypeOfNewWork;
import pom.POMActitimeHomePage;
import pom.POMActitimeLoginPage;
import pom.POMActitimeTypesOfWorkPage;

public class TESTActitimeCreateWork 
{
	@Test(groups = "Regression")
	public void createWork() throws InterruptedException
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
		click1.typeOfWorkMethod();
		
		POMActitimeTypesOfWorkPage click2 = new POMActitimeTypesOfWorkPage(driver);
		click2.createTypeofWorkMethod();
		
		POMActitimeCreateTypeOfNewWork click3 = new POMActitimeCreateTypeOfNewWork(driver);
		click3.createWorkMethod();
		
		click2.editWorkMethod();
		click3.editWorkNameMethod();
		
		click2.deleteEditedWorkMethod();
		//click2.deleteWorkMethod();
	}
}
