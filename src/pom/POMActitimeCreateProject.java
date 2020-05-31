package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCreateProject 
{
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectNameTextField;
	
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")
	private WebElement createProjectSubmitButton;
	
	@FindBy(xpath="(//div[.='-- Please Select Customer to Add Project for  --'])[2]")
	private WebElement customerDropDown;
	
	@FindBy(xpath="//div[.='Big Bang Company'][@class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyOption;
	//div[@class='titleEditButtonContainer']//div[@class='editButton']
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']")
	private WebElement editButtonProject;
	
	@FindBy(xpath="//div[@class='editProjectPanelHeader']//div[@class='actionButton']")
	private WebElement actionButtonProject;
	
	@FindBy(xpath="//div[@class='taskManagement_projectPanel']//div[@class='title'][contains(text(),'Delete')]")
	private WebElement deleteButtonProject;
	
	@FindBy(xpath="//span[contains(text(),'Delete permanently')]")
	private WebElement deletePermanentlyButtonProject;
	
	@FindBy(xpath = "//div[contains(@class,'nameLabel')][contains(text(),'Automation Project')]")
	private WebElement projectName;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter Project Name')]")
	private WebElement editProjectNameTextField;
	
	public POMActitimeCreateProject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createProjectMethod()
	{
		projectNameTextField.sendKeys("Automation Project");
		customerDropDown.click();
		bigBangCompanyOption.click();
		createProjectSubmitButton.click();
	}
	
	public void deleteProjectMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		editButtonProject.click();
		Thread.sleep(1000);
		actionButtonProject.click();
		Thread.sleep(1000);
		deleteButtonProject.click();
		Thread.sleep(5000);
		deletePermanentlyButtonProject.click();
	}
	
	public void editProjectName() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		editButtonProject.click();
		Thread.sleep(2000);
		projectName.click();
		Thread.sleep(1000);
		editProjectNameTextField.sendKeys(Keys.SPACE);
		editProjectNameTextField.sendKeys("Work");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ESCAPE);
	}
}
