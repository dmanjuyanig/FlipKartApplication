package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebGeneric;

public class LoginPage 
{
	private WebDriver driver;
	
	//***************************************************************************************
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement UsernamTextField;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement LoginButton;

	
	/*@FindBy(id="imgbtnloginsso")
	public WebElement LoginButton;*/
	
	@FindBy(id="imgbtnCancel")
	private WebElement CancelButton;
	
	@FindBy(xpath="//a[@class = '_21JmK0 _1__46T']")
	private WebElement ForgotPasswordLink;
	
	@FindBy(xpath="//span[@class = 'ZAtlA-']")
	private WebElement ErrorMessage;

	//***************************************************************************************
	public LoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		//***************************************************************************************
	public void setUserName(String un) throws InterruptedException
		{
			UsernamTextField.sendKeys(un);
		}
	
	public void setPassword(String pw)
		{
		PasswordTextField.sendKeys(pw);
		}
	
	public void clickLoginButton()	
		{
			LoginButton.click();
		}
	

	
	public void clickCancelButton()
		{
			CancelButton.click();
		}
	public void clickForgotPasswordLink()
	{
		ForgotPasswordLink.click();
	}
	
	public String getErrorMessage()
	{
		return ErrorMessage.getText();
	}

	//***************************************************************************************
	
	public void VerifyUserNameField()
	{
		WebGeneric.WebelementPresent(UsernamTextField);
	}
	
	public void VerifyPasswordField()
	{
		WebGeneric.WebelementPresent(PasswordTextField);
	}
	
	public void VerifyLoginButton()
	{
		WebGeneric.WebelementPresent(LoginButton);
	}
	
	public void VerifyCancelButton()
	{
		WebGeneric.WebelementPresent(CancelButton);
	}
	
//***************************************************************************************
	
	/*public void VerifyUserNameField(long time)
	{
		WenGeneric.waitForVisibilityAndClick(driver, time, unTB);		
	}
	
	public void VerifyPasswordField(long time)
	{
		WenGeneric.waitForVisibilityAndClick(driver, time, pwTB);		
	}
	
	public void VerifyLoginButton(long time)
	{
		WenGeneric.waitForVisibilityAndClick(driver, time, loginBTN);		
	}*/
}
