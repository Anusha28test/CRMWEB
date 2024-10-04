package RelatedList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invoices
{
	/*@Test(priority=3)
	void deal_invoice() throws InterruptedException
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
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[contains(text(),'Invoices')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'New')])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("abc");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Invoice information details added Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details added Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Invoices added successfully");
		}
		else 
		{
			System.out.println("Invoices is not added successfully");                          
		}
	}
@Test(priority=2)
void deals_invoice_saveandnew() throws InterruptedException
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
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Invoices')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'New')])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("abc");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click(); //Invoice information details added Succesfully
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details added Succesfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("Invoices added successfully");
	}
	else 
	{
		System.out.println("Invoices is not added successfully");                          
	}
}
@Test(priority=1)
void invoice_changeallfields() throws InterruptedException
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
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Invoices')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'New')])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("abc");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anu16@mailinator.com')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='clear-button'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[contains(text(),'anu')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='purchaseOrder'])")).sendKeys("cxds667asd");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='exciseDuty'])")).sendKeys("75754");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Approved')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='salesCommission'])")).sendKeys("465645874");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'Blockn stack')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'lankesh s')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer p-1 overflow_text'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[contains(text(),'Vshshhs737bddbd473(')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='price'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='percentage'])")).sendKeys("66");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add Row')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@name='termsAndConditions'])")).sendKeys("hgshsdhdh#$%^345654345");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@name='description'])[3]")).sendKeys("hgshsdhdh#$%^345654345");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details added Succesfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("Invoices added successfully");
	}
	else 
	{
		System.out.println("Invoices is not added successfully");                          
	}
}*/
@Test
void invoice_manage() throws InterruptedException
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
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Invoices')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//th[@class='text-end cursorPointer position-relative'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[contains(text(),'Manage Columns')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='Billing City'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	Thread.sleep(4000);
}
}
