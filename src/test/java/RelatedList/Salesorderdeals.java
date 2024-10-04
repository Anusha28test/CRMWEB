package RelatedList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Salesorderdeals
{
	/*@Test(priority=3)
	void salesorder_deal() throws InterruptedException
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
	driver.findElement(By.xpath("(//li[contains(text(),'Sales Orders')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'New')])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ananya");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Sales order  details added Succesfully
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Sales order  details added Succesfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("sales order added successfully");
	}
	else 
	{
		System.out.println("sales order is not added successfully");                          
	}
}
	@Test(priority=2)
	void salesorder_saveandnew() throws InterruptedException
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
		driver.findElement(By.xpath("(//li[contains(text(),'Sales Orders')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'New')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ananya");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();  //Sales order  details added Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Sales order  details added Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("sales order added successfully");
		}
		else 
		{
			System.out.println("sales order is not added successfully");                          
		}
	}
	@Test(priority=1)
	void salesorder_manage() throws InterruptedException
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
		driver.findElement(By.xpath("(//li[contains(text(),'Sales Orders')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//th[@class='text-end cursorPointer position-relative'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Manage Columns')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@id='Billing City'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
		Thread.sleep(4000);
		System.out.println("Billing city field is added to columns");
	}*/
	@Test
	void salesorder_changeallfields() throws InterruptedException
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
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[contains(text(),'Sales Orders')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'New')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("anu");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anu16@mailinator.com')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='purchaseOrder'])")).sendKeys("7667456767454");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='customerNo'])")).sendKeys("7667456767454");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Anusha jagadeesh')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'lankesh s')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='exciseDuty'])")).sendKeys("3456");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='pending'])")).sendKeys("3456");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'UPS')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Approved')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'Myntra')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='salesCommission'])")).sendKeys("7645");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[@class='position-absolute cursorPointer end-0'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@id='price'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='w-25 ms-2'])")).sendKeys("43");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anu16@mailinator.com')])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();  //Sales order  details added Succesfully
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Sales order  details added Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("sales order added successfully");
		}
		else 
		{
			System.out.println("sales order is not added successfully");                          
		}
	}
}

