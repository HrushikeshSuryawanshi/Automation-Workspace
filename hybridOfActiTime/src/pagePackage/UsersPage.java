package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	@FindBy(linkText="Users") private WebElement usersTab;
	@FindBy(xpath = "//input[@type='button' and (@value='Create New User')]") private WebElement createUser;
	@FindBy(name = "username") private WebElement usnTextBox;
	@FindBy(name = "passwordText") private WebElement passTextBox;
	@FindBy(name = "passwordTextRetype") private WebElement retypePassTextBox;
	@FindBy(name = "firstName") private WebElement firstNameTextBox;
	@FindBy(name = "lastName") private WebElement lastNameTextBox;
	@FindBy(xpath = "//input[@type='submit' and (@value='   Create User   ')]") private WebElement createUserButton;
	@FindBy(xpath = "//input[@type='button' and (@value='      Cancel      ')]") private WebElement cancelButton;
	
	// Initialization
	
	public UsersPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	// Utilization
	
	public WebElement getUsersTab() {
		return usersTab;
	}


	public WebElement getCreateUser() {
		return createUser;
	}


	public WebElement getUsnTextBox() {
		return usnTextBox;
	}


	public WebElement getPassTextBox() {
		return passTextBox;
	}


	public WebElement getRetypePassTextBox() {
		return retypePassTextBox;
	}


	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}


	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}


	public WebElement getCreateUserButton() {
		return createUserButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	// Operational Methods
	
	public void validUsn(String validUser)
	{
		getUsnTextBox().sendKeys(validUser);
	}
	
	public void validPass(String validPassword)
	{
		getPassTextBox().sendKeys(validPassword);
	}
	
	public void reTypePass(String retypePassword)
	{
		getRetypePassTextBox().sendKeys(retypePassword);
	}
	
	public void firstName(String fname)
	{
		getFirstNameTextBox().sendKeys(fname);
	}
	
	public void lastName(String lname)
	{
		getFirstNameTextBox().sendKeys(lname);
	}
	
	public void clickOnCreateButton()
	{
		getCreateUserButton().click();;
	}
	
	public void clickOnCreateUserButton()
	{
		getCreateUserButton().click();;
	}
	
	public void clickOnCancelButton()
	{
		getCancelButton().click();;
	}
	
	public void clickOnTab()
	{
		getCreateUser().click();;
	}


	

}
