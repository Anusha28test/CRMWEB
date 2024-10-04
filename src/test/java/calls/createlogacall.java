package calls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class createlogacall 
{
//@Test(priority=1)
void create_logcall_withallfields() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='minutes'])")).sendKeys("17");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='seconds'])")).sendKeys("11");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ashokbro");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='callAgenda'])")).sendKeys("he is from db team");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[4]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='description'])")).sendKeys("bhsfjsdf$%^&5456436543");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Call Created Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
//@Test(priority=2)
void createcall_withcontact_inbound() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-15lsz6c-indicatorContainer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Inbound')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ashokbro1");
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='minutes'])")).sendKeys("11");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='seconds'])")).sendKeys("11");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='description'])")).sendKeys("11nfhdsjhdsbfhjds");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Call Created Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }	
}
//@Test(priority=3)
void createlogcall_deal_outbound() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ashokbro2");
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='minutes'])")).sendKeys("11");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='seconds'])")).sendKeys("11");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='description'])")).sendKeys("11nfhdsjhdsbfhjds");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Call Created Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }	
}
//@Test(priority=4)
void createcall_quote_missed() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ashokbro2");
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class=' css-15lsz6c-indicatorContainer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Missed')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("lokeshbro");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='hours_box position-relative'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Call Created Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
@Test(priority=1)
void emptysubject_logacall() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='minutes'])")).sendKeys("11");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='seconds'])")).sendKeys("11");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Please enter a valid subject.')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
@Test(priority=2)
void emptycallduration_logacall() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ashokbro3");
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Invalid call duration')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
@Test(priority=3)
void empty_callstarttime() throws InterruptedException  //Call start time selection is required.
{
	WebDriver driver = new ChromeDriver();
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Call')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Log a Call')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("ashokbro3");
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='minutes'])")).sendKeys("11");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='seconds'])")).sendKeys("11");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Call start time selection is required.')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
}
