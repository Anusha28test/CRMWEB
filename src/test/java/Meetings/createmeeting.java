package Meetings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class createmeeting 
{
	@Test(priority=1)
	void createmeeting_withmandatoryfields() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("raksha");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[12]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[12]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[6]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[6]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='m-0'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();  
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();  
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create')])[2]")).click();  
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Meeting details added successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
	@Test(priority=2)
	void createmeeting_withallfileds() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("raksha");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls'])[2]")).sendKeys("Shivmogga");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='mt-1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[10]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[10]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='m-0'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Lead')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='m-0'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Weekly')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='me-3'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();   
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='d-flex input-with-clear'])[2]")).click();   
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();   
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[5]")).click();   
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("asndjs@#$%^543456543456");   
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();   
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Create')])[2]")).click();  
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Meeting details added successfully')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
	}
	@Test
	void invalidtitle_createmeeting() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("@#$%^&%$#$%^%$#");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='m-0'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();  
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Please enter a valid title.')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
	}
	@Test
	void invaliddate_createmeeting() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("23456"); //Hours cannot be Zero h4
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();  
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Hours cannot be Zero')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
	}
	@Test
	void previousdate_createmeeting() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("23456"); //Hours cannot be Zero h4
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='m-0'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Create')])[2]")).click();  
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Meeting details added successfully')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
	}
	@Test
	void futuredate_createmeeting() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='createContactButtonSave py-2'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("28"); 
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cursorPointer'])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='m-0'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();  
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();  
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Meeting details added successfully')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
	}
}
