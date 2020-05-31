package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCreateTypeOfNewWork 
{
	@FindBy(id="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//input[contains(@value,'Create Type of Work')]")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(id="billingRate_input")
	private WebElement billingRateTextField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement saveButton;
	
	public POMActitimeCreateTypeOfNewWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createWorkMethod()
	{
		nameTextField.sendKeys("Harshit's work");
		billingRateTextField.sendKeys("20");
		createTypeOfWorkButton.click();
	}
	
	public void editWorkNameMethod()
	{
		nameTextField.sendKeys(Keys.CONTROL,"a");
		nameTextField.sendKeys(Keys.BACK_SPACE);
		nameTextField.sendKeys("AutomationWORK");
		saveButton.click();
	}
}
