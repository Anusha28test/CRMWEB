package Generalsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Creategroup
{
//@Test(priority=1)
void creategroup()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='groupName'])")).sendKeys("lokibro");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Successful
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
//@Test(priority=2)
void creategroup_withalreadyexist()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='groupName'])")).sendKeys("anu5");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Successful
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Group already exists')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
//@Test(priority=3)
void creategroup_withallfields()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='groupName'])")).sendKeys("lokibro1");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='groupDescription'])")).sendKeys("Lokibro is the gud person");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Successful
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
//@Test(priority=1)
void edit_group()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='position-absolute'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Edit')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[4]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='groupName'])")).sendKeys("anushaj");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();  
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Group updated successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
//@Test(priority=2)
void rename_group()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='position-absolute'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Rename')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='groupName'])")).sendKeys("charanbro");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Group updated successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
//@Test(priority=3)
void delete_group()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='position-absolute'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'OK')])")).click();  
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Group deleted successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }	
}
//@Test(priority=1)
void addmember_group() throws InterruptedException
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'lokibro')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add Member')])")).click();
	Thread.sleep(7000);
	//driver.findElement(By.xpath("(//button[@id='dropdown-activity'])")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[contains(text(),'Roles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Successful')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
//@Test(priority=2)
void delete_addedmember()
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
	//Thread.sleep(2000)
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Group')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'lokibro')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Roles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Users')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Roles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Remove')])")).click(); //Role removed successfully
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Role removed successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test
void deactivate_users() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	//System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
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
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'User Profiles')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Activate')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='toggle-slider'])[4]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='inActiveTab '])[1]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='dropdown-active-user'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Deactivated Users')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Activate')])[1]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Activate')])[2]")).click();  //User has been activated successfully
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'User has been activated successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
}
