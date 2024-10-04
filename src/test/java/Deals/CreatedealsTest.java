package Deals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatedealsTest {
  /*@Test
   void testclick_to_dealspage() throws InterruptedException
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
			System.out.println("Navigate to Deals page");
	}
@Test
void testvalid_createDeal() throws InterruptedException
{
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
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("anuj");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='closingDate']")).sendKeys("01/28/2000");
			Thread.sleep(2000);
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
			driver.findElement(By.xpath("//input[@name='nextStep']")).sendKeys("2000jfdjj");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/campaign.ac6c8f73889235a81de741ec650e947c.svg'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'9876543234')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("2000nsadbjshfhdsfghdsfdhghfsdhfgshdfjshj");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Created Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals cretaed successfully");
			}
			else 
			{
				System.out.println("Deals is not created successfully");                          
			}
}
}
@Test
void edit_dealname() throws InterruptedException 
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@name='dealName'])")).sendKeys("anu");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_amount() throws InterruptedException 
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@name='amount'])")).sendKeys("200");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_Accountname() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'Blockn stack')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_stage() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Negotiation/Review')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_Type() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Existing Business')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_Nextstep() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='nextStep']")).sendKeys("abc");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}		
}
@Test
void edit_Leadsource() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Employee Referral')])")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  //Deal Created Succesfully
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_Campaignsource() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//img[@src='/static/media/campaign.ac6c8f73889235a81de741ec650e947c.svg'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'hjdfhjf')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
@Test
void edit_Contactname() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'lankesh s')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}*/
@Test
void edit_description() throws InterruptedException
{
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
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'gfd')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("2000nsadbjshfhdsfghdsfdhghfsdhfgshdfjshj");
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Deal Details Updated Succesfully')])"));  
			if(button.isEnabled())
			{
				System.out.println("Deals updated successfully");
			}
			else 
			{
				System.out.println("Deals is not updated successfully");                          
			}
	}
}
}


