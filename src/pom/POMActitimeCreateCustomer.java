package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCreateCustomer 
{
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerSubmitButton;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']")
	private WebElement editButton;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionsbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletePermanentlyButton;
	
	@FindBy(xpath="//div[@class='nameLabel'][contains(text(),'Harshit Aggarwal')]")
	private WebElement customerName;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement editCustomerNameTextField;
	
	public POMActitimeCreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCustomerMethod() 
	{
		customerNameTextField.sendKeys("Harshit Aggarwal");
		createCustomerSubmitButton.click();		
	}
	
	public void deleteCustomerMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		editButton.click();
		Thread.sleep(2000);
		actionsbutton.click();
		Thread.sleep(2000);
		deleteButton.click();
		Thread.sleep(2000);
		deletePermanentlyButton.click();
	}
	
	public void editNameMethod() throws AWTException, InterruptedException 
	{	
		Thread.sleep(5000);
		editButton.click();
		Thread.sleep(3000);
		customerName.click();
		editCustomerNameTextField.sendKeys(Keys.SPACE);
		editCustomerNameTextField.sendKeys("Ji");
		Robot r = new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ESCAPE);
	}
	
}
