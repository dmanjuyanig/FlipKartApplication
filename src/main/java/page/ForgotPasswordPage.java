package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage 
{
	private WebDriver driver;
	
	//***************************************************************************************
	/*@FindBy(id="mail")
	private WebElement EmailTextField;
	
	@FindBy(id="submitBtn")
	private WebElement SendButton;
	
	@FindBy(id="button-cancelButton")
	private WebElement CancelButton;*/
	
	@FindBy(xpath="//a[@class = '_21JmK0 _1__46T']")
	private WebElement ForgotPasswordLink;
	
/*	@FindBy(xpath="//*[@id=\"centerbody\"]/p")
	private WebElement HeaderTitle;*/
	
	//***************************************************************************************
	public ForgotPasswordPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		//***************************************************************************************
	public void clickForgotPasswordLink()	
	{
		ForgotPasswordLink.click();
	}
	
	
	/*public String headerMessage()
	{
		return HeaderTitle.getText();
	}*/
}
