package Create;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createdeal
{
	@Test
	   void testcreatedeal() throws InterruptedException
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
				driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='closingDate']")).click();
				Thread.sleep(10000);
				//while(driver.findElement(By.xpath("//input[@name='closingDate']")).getText().contains(Jan)
				//driver.findElement(By.xpath("//input[@name='closingDate']")).sendKeys("2024-09-28");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Identify Decision Makers')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='nextStep']")).sendKeys("2000jfdjj");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//img[@src='/static/media/campaign.ac6c8f73889235a81de741ec650e947c.svg'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'Conference')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("2000nsadbjshfhdsfghdsfdhghfsdhfgshdfjshj");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Deal Created Succesfully
				Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals created successfully");
				}
				else 
				{
					System.out.println("Deals is not created ");                          
				}	
			}
	@Test
	void deal_with_mandatoryfields() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Deal Created Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deals created successfully");
		}
		else 
		{
			System.out.println("Deals is not created ");                          
		}
	}
	@Test
	void dealscreatewith_saveandnew() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();  //Deal Created Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Deals created successfully");
		}
		else 
		{
			System.out.println("Deals is not created ");                          
		}
	}
	@Test
	void dealwith_invalid_dealname() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("@#$%^%$#@$%^");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Deal Created Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Deal name.')])"));  
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("deals is created");                          
		}
	}
	@Test
	void deal_emptydealname() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Deal Created Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Deal Name cannot be empty.')])"));  
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("deals is created");                          
		}
	}
	@Test
	void deal_emptyamount() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Deal Created Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Amount cannot be empty.')])"));  //Closing date cannot be empty.
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("deals is created");                          
		}
	}
	@Test
	void deal_emptyclosingdate() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("88");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Closing date cannot be empty.')])"));  //Closing date cannot be empty.
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("deals is created");                          
		}
	}
	@Test
	void deal_emptyaccountname() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("88");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		/*driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Account cannot be empty.')])"));  //Closing date cannot be empty.
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("deals is created");                          
		}
	}*/
	@Test
	void deal_contactnameempty() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Deal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("88");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='closingDate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		/*driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);*/
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Contact cannot be empty.')])"));  //Closing date cannot be empty.
		if(button.isEnabled())
		{
			System.out.println("proper error message");
		}
		else 
		{
			System.out.println("deals is created");                          
		}
	}
}
