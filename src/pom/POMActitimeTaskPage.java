package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeTaskPage {
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProjectOption;
	
	public POMActitimeTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void creatingCustomerMethod() 
	{
		addNewButton.click();
		newCustomerOption.click();
	}
	
	public void creatingProjectMethod()
	{
		addNewButton.click();
		newProjectOption.click();
	}
	
}
