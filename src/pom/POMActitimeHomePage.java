package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeHomePage {
	@FindBy(id="container_tasks")
	private WebElement taskTab;
	
	@FindBy(id="container_tt")
	private WebElement timeTrackTab;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingsIcon;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeOfWorkOption;
	
	@FindBy(xpath="//a[text()='Leave Types']")
	private WebElement leaveTypesOption;
	
	public POMActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void taskTabMethod()
	{
		taskTab.click();
	}	
	
	public void typeOfWorkMethod() 
	{
		settingsIcon.click();
		typeOfWorkOption.click();		
	}
	
	public void leaveTypesMethod()
	{
		settingsIcon.click();
		leaveTypesOption.click();
	}
}
