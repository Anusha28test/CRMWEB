package Massfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DealsMassdelete 
{
	/*@Test
	void testMassdelete_Deal() throws InterruptedException
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
				driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
				Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal details deleted successfully.')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals deleted successfully");
				}
				else 
				{
					System.out.println("Deals is not deleted successfully");                          
				}	
     	}
	@Test
	void deals_Masstransfer() throws InterruptedException
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
			driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer px-1'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'Standard')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave modalButton'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click(); //Updated Successfully !
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Updated Successfully !')])"));  
			if(button.isEnabled())
			{
				System.out.println("Deals transfered successfully");
			}
			else 
			{
				System.out.println("Deals is not transferred successfully");                          
			}	
	}
	@Test
	void deal_massupdate_Amount() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Amount')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("6556");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deals updated successfully");
		}
		else 
		{
			System.out.println("Deals is not updated successfully");                          
		}
	}
	@Test
	void deals_amountempty_update() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Amount')])[2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("6556");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Value cannot be empty')])"));  
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("Deals is updated successfully");                          
		}
	}
	@Test
	void delas_Campaignsource_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Campaign Source')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='clear-button-campaign d-flex justify-content-end'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[contains(text(),'lokesh')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("Campaign source updated successfully");
		}
		else 
		{
			System.out.println("Campaign source  not updated successfully");                          
		}
	}
	@Test
	void empty_campaignsource_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Campaign Source')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("Campaign source updated successfully");
		}
		else 
		{
			System.out.println("Campaign source  not updated successfully");                          
		}
	}
	@Test
	void deals_closingdate_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Closing Date')])[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("Campaign source updated successfully");
		}
		else 
		{
			System.out.println("Campaign source  not updated successfully");                          
		}
	}
	@Test
	void deals_empty_closingdate_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Closing Date')])[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Value cannot be empty')])"));  
		if(button.isEnabled())
		{
			System.out.println("Closing date display error message");
		}
		else 
		{
			System.out.println("Closing date not updated successfully");                          
		}
	}
	@Test
	void deals_dealname_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Deal Name')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("jncsjjn");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deal name updated successfully");
		}
		else 
		{
			System.out.println("Deal name not updated successfully");                          
		}	
	}
	@Test
	void deal_empty_dealname_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Deal Name')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Value cannot be empty')])"));  
		if(button.isEnabled())
		{
			System.out.println("Closing date display error message");
		}
		else 
		{
			System.out.println("Closing date not updated successfully");                          
		}
	}
	@Test
	void dealnameinvalid_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Deal Name')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("@#$%^&^%$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Value cannot be empty')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deal name updated successfully");
		}
		else 
		{
			System.out.println("Deal name not updated successfully");                          
		}	
	}
	@Test
	void dealname_invalidnum_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Deal Name')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("234567876");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Value cannot be empty')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deal name updated successfully");
		}
		else 
		{
			System.out.println("Deal name not updated successfully");                          
		}
	}
	@Test
	void deal_Leadsource_empty_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Lead Source')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("lead source updated successfully");
		}
		else 
		{
			System.out.println("lead source not updated successfully");                          
		}	
	}
	@Test
	void deal_leadsource_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Lead Source')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Employee Referral')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("lead source updated successfully");
		}
		else 
		{
			System.out.println("lead source not updated successfully");                          
		}	
	}
	@Test
	void deals_nextstep_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Next Step')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("anu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("next step updated successfully");
		}
		else 
		{
			System.out.println("next step not updated successfully");                          
		}
	}
	@Test
	void deal_nextstep_invalid_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Next Step')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("@#$%^&%$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Value cannot be empty')])"));  
		if(button.isEnabled())
		{
			System.out.println("next step updated successfully");
		}
		else 
		{
			System.out.println("next step not updated successfully");                          
		}
	}
	@Test
	void deal_stage_empty_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[contains(text(),'Stage')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("stage updated successfully");
		}
		else 
		{
			System.out.println("stage not updated successfully");                          
		}
	}
	@Test
	void deals_stage_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[contains(text(),'Stage')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Value Proposition')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("stage updated successfully");
		}
		else 
		{
			System.out.println("stage not updated successfully");                          
		}
	}
	@Test
	void Type_empty_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[contains(text(),'Type')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("stage updated successfully");
		}
		else 
		{
			System.out.println("stage not updated successfully");                          
		}
	}*/
	@Test
	void deal_type_massupdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='vehicle1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[contains(text(),'Type')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Existing Business')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Value cannot be empty
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));  
		if(button.isEnabled())
		{
			System.out.println("Type updated successfully");
		}
		else 
		{
			System.out.println("Type not updated successfully");                          
		}
	}
}
