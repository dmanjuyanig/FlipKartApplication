package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_WorkSpace\\22032019-Workspace\\OfficeConnect\\Test_FlipKartApplication\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/a")).click();
		
		/*driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9739313941");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Yanig_1sid");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		WebElement NameTab = driver.findElement(By.xpath("//div[text() = 'Manju Dhananjaya ']"));
		Actions action = new Actions(driver);
		action.moveToElement(NameTab).build().perform();
		*/
/*		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);*/
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class = '_1Q5BxB' ][text() = 'Logout']")).click();
		/*WebElement logout = driver.findElement(By.xpath("//div[@class = '_1Q5BxB' ]"));
		
		action.moveToElement(logout);
		action.click().build().perform();
		
		driver.findElement(By.xpath("//span[@class = '_2ZZi8V']")).click();
		//action.contextClick();
*/		System.out.println("Done");
		
	}
}
