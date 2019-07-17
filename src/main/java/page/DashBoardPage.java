package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebGeneric;

public class DashBoardPage 
{
	private WebDriver driver;

	//***************************************************************************************
	
	@FindBy(xpath="//div[text() = 'Manju Dhananjaya ']")
	private WebElement UserNameTab;
	
	@FindBy(xpath="//div[@class = '_2aUbKa'][text() = 'More']")
	private WebElement MoreTab;
	
	@FindBy(xpath="//a[@class = '_3ko_Ud']")
	private WebElement ChartTab;
	
	@FindBy(xpath="//div[@class = '_1Q5BxB' ][text() = 'Logout']")
	private WebElement LogoutLink;
	
	
	//***************************************************************************************
	public DashBoardPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
	
	//***************************************************************************************
	public void HowerOnNameTab()	
	{
		Actions action = new Actions(driver);
		action.moveToElement(UserNameTab).build().perform();
	}
	
	public void VerifyUserNameTab()
	{
		WebGeneric.WebelementPresent(UserNameTab);
	}
	public void VerifyMoreTab()
	{
		WebGeneric.WebelementPresent(MoreTab);
	}
	public void VerifyChartTab()
	{
		WebGeneric.WebelementPresent(ChartTab);
	}
	
	public void clickLogoutButton(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, LogoutLink);		
	}

	
	/*public void VerifyLogoutButton()
	{
		WebGeneric.WebelementPresent(LogoutButton);
	}
	
	public void clickLogoutButton(long time)
		{
			WebGeneric.waitForVisibilityAndClick(driver, time, LogoutButton);		
		}
	
	public void VerifyHomeButton()
	{
		WebGeneric.WebelementPresent(HomeButton);
	}
	
	public void VerifyHomeLogo()
	{
		WebGeneric.WebelementPresent(HomePageLogo);
		System.out.println("Logo is displayed in homepage");
	}
	
	public void clickHomeButton(long time)
		{
			WebGeneric.waitForVisibilityAndClick(driver, time, HomeButton);		
		}
	public void clickMyPageImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, MyPageImage);		
	}
	public void clickApplyLeaveImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, ApplyLeaveImage);		
	}
	public void clickHolidayListImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, HolidayListImage);		
	}
	public void clickPolicyDocumentImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, PolicyDocumentImage);		
	}
	public void clickEmployeeHandbookImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, EmployeeHandbookImage);		
	}
	public void clickTimeLiveImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, TimeLiveImage);		
	}
	public void clickTaleoImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, TaleoImage);		
	}
	public void clickualityManagementImage(long time)
	{
		WebGeneric.waitForVisibilityAndClick(driver, time, ualityManagementImage);		
	}*/
	//***************************************************************************************
}
