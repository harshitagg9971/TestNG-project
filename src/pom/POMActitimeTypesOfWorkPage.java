package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeTypesOfWorkPage 
{	
	public WebDriver driver;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(xpath="//a[contains(text(),\"Harshit's work\")]/../..//a[contains(text(),'delete')]")
	private WebElement deleteLink;
	
	@FindBy(xpath = "//a[contains(text(),\"Harshit's work\")]")
	private WebElement workNameLink;
	
	@FindBy(xpath = "//a[text()='AutomationWORK']/../..//a[contains(text(),'delete')]")
	private WebElement editedDeleteLink;
	
	public POMActitimeTypesOfWorkPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createTypeofWorkMethod()
	{
		createTypeOfWorkButton.click();
	}	
	
	public void deleteWorkMethod() 
	{
		deleteLink.click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void deleteEditedWorkMethod()
	{
		editedDeleteLink.click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	public void editWorkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		workNameLink.click();
	}
}
