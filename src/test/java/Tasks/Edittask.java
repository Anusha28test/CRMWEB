package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Edittask 
{
	@Test(priority=1)
	void Edittaskand_update() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	   
    	   try {
    		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
    		   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("No success or error message found.");
    	   }  
	}
 
@Test(priority=1)
void editallfields_task() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'anu16@mailinator.com')])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave modalButton'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'DONE')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ammu");
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//li[contains(text(),'Deal')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'In Progress')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'High')])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class='react-switch-bg'])")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'03:00 AM')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Both')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	   try 
    	   {
    		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
    		   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("No success or error message found.");
    	   }  	
	}
@Test(priority=8)
void edit_product_task() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//li[contains(text(),'Product')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    	   
	    	   try {
	    		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
	    		   // If success message is found, print it
			         System.out.println("Success message: " + successMessage.getText());
	    	   }
	    	   catch(Exception e)
	    	   {
	    		   System.out.println("No success or error message found.");
	    	   }  
	    }		

@Test(priority=7)
void edit_quotes_task() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//li[contains(text(),'Quote')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(4000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    	   
	    	   try {
	    		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
	    		   // If success message is found, print it
			         System.out.println("Success message: " + successMessage.getText());
	    	   }
	    	   catch(Exception e)
	    	   {
	    		   System.out.println("No success or error message found.");
	    	   }  			
     }
@Test(priority=6)
void edit_salesorder_task() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Sales Order')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }  
  }
@Test(priority=5)
void edit_purchaseorder_task() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Purchase Order')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }  
}
@Test(priority=4)
void edit_Invoice_task() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Invoice')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }  
}
@Test(priority=3)
void edit_Campaign_task() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Campaign')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }  
}
@Test(priority=2)
void edit_vendor_task() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='clear-button'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Vendor')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task updated Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }  
}

}

