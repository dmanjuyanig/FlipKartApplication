package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_WorkSpace\\22032019-Workspace\\OfficeConnect\\Test_FlipKartApplication\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		System.out.println("Done");
		
		WebElement MenTab = driver.findElement(By.xpath("//a[@href = '/shop/men'][@class = 'desktop-main']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(MenTab).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href = '/men-sunglasses']")).click();
	}
}
