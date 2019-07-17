package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.LoginPage;


public class T2_HomePageFunctionality extends BaseTest
{
	@Test (description = "Verifying valid login functionality" , priority =1, groups = {"smoke"})
	public void TestCase_1_ValidHomepage() throws InterruptedException
	{
	/*	T1_LoginFunctionality one = new T1_LoginFunctionality();
		one.TestCase_1_ValidLogin();*/
		
		String un=Utility.getJSONData(DATA_JSONPATH,"username", "LoginDetails");
		String pw=Utility.getJSONData(DATA_JSONPATH,"password", "LoginDetails");
		
		LoginPage login=new LoginPage(driver);
		login.VerifyUserNameField();
		login.setUserName(un);
		login.VerifyPasswordField();
		login.setPassword(pw);
		login.VerifyLoginButton();
		login.clickLoginButton();
		Thread.sleep(3000);
		
		//verify that dashboard page is displayed.
		String homepageURL=Utility.getJSONData(DATA_JSONPATH,"homepage", "LoginDetails");
		WebGeneric.VerifyURL(driver, lngETO, homepageURL);
		/*
		//click -> logout
		DashBoardPage home = new DashBoardPage(driver);
		home.clickMyPageImage(lngETO);
		
		MyEmployeePage MyPage = new MyEmployeePage(driver);
		//MyPage.menuHeader();
		MyPage.VerifyOfficialTab();
		MyPage.VerifyPersonalTab();
		MyPage.VerifyBankingTab();
		MyPage.VerifyAcademicPassportTab();
		MyPage.VerifySkillsCertificationTab();
		MyPage.VerifyLeaveHistoryTab();
		MyPage.VerifyStatusHistoryTab();*/
	}
}
	
	