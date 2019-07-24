package script;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReusualWebGeneric;
import page.DashBoardPage;


public class Test3 extends BaseTest
{
	@Test (description = "Verifying Adding Item to Chart" , priority =1, groups = {"smoke"})
	public void TestCase_1_ValidHomepage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		ReusualWebGeneric.LoginApplication();
		
		DashBoardPage dashBoard = new DashBoardPage(driver);
		dashBoard.VerifyUserNameTab();
		dashBoard.VerifyMoreTab();
		dashBoard.VerifyChartTab();
		
		WebElement MenTab = driver.findElement(By.xpath("//span[@class = '_1QZ6fC _3Lgyp8'][text() = 'Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(MenTab).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title = 'Mi'][@href = '/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']")).click();
		Thread.sleep(3000);
		String ShoeXpath = "//div[text() =  'Redmi Note 7 Pro (Space Black, 64 GB)']";
		driver.findElement(By.xpath(ShoeXpath)).click();
		Thread.sleep(3000);
		
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(1));
		
		
		
		//driver.findElement(By.xpath("//a[@class = '_1TJldG _2I_hq9 _2UBURg'][text() = '8']")).click();
		driver.findElement(By.xpath("//button[@class = '_2AkmmA _2Npkh4 _2MWPVK']")).click();
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//div[@class = 'gdUKd9'][text() = 'Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class = 'gdUKd9 _3Z4XMp _2nQDKB'][text() = 'Remove']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title = 'Flipkart']")).click();
		Thread.sleep(3000);
		ReusualWebGeneric.LogOutApplication();
		
		ReusualWebGeneric.CloseBrowser();
	}
}
	
	