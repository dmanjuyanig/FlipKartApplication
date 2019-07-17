package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReusualWebGeneric;


public class T2_FunctionalTestCases extends BaseTest
{
	@Test (description = "Verifying Adding Item to Chart" , priority =1, groups = {"smoke"})
	public void TestCase_1_ValidHomepage() throws InterruptedException
	{
		ReusualWebGeneric.LoginApplication();
		ReusualWebGeneric.LogOutApplication();
		ReusualWebGeneric.CloseBrowser();
		
		
		

	}
}
	
	