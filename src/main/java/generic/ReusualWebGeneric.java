package generic;

import page.DashBoardPage;
import page.LoginPage;

public class ReusualWebGeneric extends BaseTest
{
		//This method is used to login the appication.
		public static void LoginApplication() throws InterruptedException
		{
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
			
			//verify that dashboard page is displayed or not.
			String homepageURL=Utility.getJSONData(DATA_JSONPATH,"homepage", "LoginDetails");
			WebGeneric.VerifyURL(driver, lngETO, homepageURL);
		}
		
		//This method is used to logout from appication.
		public static void LogOutApplication() throws InterruptedException
		{
			DashBoardPage home = new DashBoardPage(driver);
			home.HowerOnNameTab();
			home.clickLogoutButton(lngETO);
			Thread.sleep(3000);
					
			//verify that login page is displayed or not.
			String loginpageURL=Utility.getJSONData(DATA_JSONPATH,"loginpage", "LoginDetails");
			WebGeneric.VerifyURL(driver, lngETO, loginpageURL);
		}
		
		//This method is used to logout from appication.
		public static void CloseBrowser()
		{
			driver.quit();
		}

}
