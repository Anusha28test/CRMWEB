package calls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Massfunctions
{
@Test(priority=8)
void Masstransfer() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='position-absolute h-100 mass_transfer_user pt-1'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anu16@mailinator.com')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])[1]")).click();  //Updated Successfully !
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Updated Successfully !')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
@Test(priority=7)
void massdelete() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();  //Deletion successful
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Deletion successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
@Test(priority=6)
void massupdate() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("vvsxgsfgfwehrnf nef");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=3)
void empty_massupdate() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();  //Successful
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=4)
void callpurpose_update() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ps-2'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Administrative')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=2)
void empty_callpurpose() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ps-2'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=5)
void callresult_massupdate() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ps-2'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1x4ez8u-option'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=1)
void empty_callresult() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ps-2'])[3]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
}
