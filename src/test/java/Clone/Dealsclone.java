package Clone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dealsclone
{
	@Test
	void clone_deal() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Deals')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals created successfully");
				}
				else 
				{
					System.out.println("Deals is not created successfully");                          
				}
		}
				
	    }
	/*@Test(priority=10)
	void deal_Clone_dealname() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//input[@name='dealName'])")).clear();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Deal name.')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is not cloned successfully");
				}
				else 
				{
					System.out.println("error message is displayed successfully");                          
				}
		}
	}
	@Test(priority=9)
	void Deal_Amount_Clone_fail() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//input[@name='amount'])")).clear();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Amount cannot be empty.')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is not cloned successfully");
				}
				else 
				{
					System.out.println("error message is displayed successfully");                          
				}
		}
	}
	@Test(priority=8)
	void deal_Amountcase_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//input[@name='amount'])")).clear();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@name='amount'])")).sendKeys(".");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Please enter a valid Amount.')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is not cloned successfully");
				}
				else 
				{
					System.out.println("error message is displayed successfully");                          
				}
		}
	}
	@Test(priority=7)
	void deal_Saveandnew_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}
	@Test(priority=6)
	void deal_stage_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Value Proposition')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}
	@Test(priority=5)
	void deal_type_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'New Business')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}
	@Test(priority=4)
	void deal_Leadsource_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(10000);
				driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Advertisement')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}
	@Test(priority=3)
	void deal_Campaignsource_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(10000);
				driver.findElement(By.xpath("(//img[@src='/static/media/campaign.ac6c8f73889235a81de741ec650e947c.svg'])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'lokesh')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}
	@Test(priority=2)
	void deal_contactname_clone() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(10000);
				driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[4]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); 
				//Thread.sleep(4000);
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}
	@Test(priority = 1)
	void deal_description() throws InterruptedException
	{
		{
			 WebDriver driver;
				driver = new ChromeDriver();
				System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
				driver.get("https://backoffice.chaincrm.io/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				//Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
				//Thread.sleep(10000);
				driver.findElement(By.xpath("(//textarea[@name='description'])")).clear();
				driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
				WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  
				if(button.isEnabled())
				{
					System.out.println("Deals is created successfully");
				}
				else 
				{
					System.out.println("deals is not created successfully");                          
				}
		}
	}*/
}


