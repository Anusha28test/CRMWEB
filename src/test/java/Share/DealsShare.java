package Share;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DealsShare
{
	/*@Test
	   void testclick_to_deals_publicshare() throws InterruptedException
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'ayioo')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id='public']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Read Write')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();  
				Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Shared successfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals shared successfully");
				}
				else 
				{
					System.out.println("Deals is not shared successfully");                          
				}
		}
	@Test
	void dealsprivate_share() throws InterruptedException
	{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'oiuyt')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[contains(text(),'0 Users')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Add')])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Add')])[3]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Role')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Add')])[3]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();
				Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Shared successfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals shared successfully");
				}
				else 
				{
					System.out.println("Deals is not shared successfully");                          
				}	
	}
	@Test
	void deals_manageshare() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'oiuyt')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Manage Sharing')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@id='public'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Read Only')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Shared successfully')])"));  
			if(button.isEnabled())
			{
				System.out.println("Deals shared successfully");
			}
			else 
			{
				System.out.println("Deals is not shared successfully");                          
			}	
	}*/
	@Test
	void deals_RevokeSharing() throws InterruptedException
	{
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://backoffice.chaincrm.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'kokila')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Revoke Sharing')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Revoke')])")).click();  //Revoked successfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Revoked successfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deals revoked successfully");
		}
		else 
		{
			System.out.println("Deals is not revoked successfully");                          
		}	
	}
	
}
