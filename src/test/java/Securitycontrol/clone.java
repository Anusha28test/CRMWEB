package Securitycontrol;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class clone 
{
@Test(priority=1)
void rename_profile() throws InterruptedException
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
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Security Control')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Profile')])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@src='/static/media/showGroupImage.6e67e3d4cc42fea757cbca833bca2c3f.svg'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Rename')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxProfile mt-1'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxProfile mt-1'])")).sendKeys("likith");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Rename')])")).click();  //Profile updated successfully
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Profile updated successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=2)
void clone_profile() throws InterruptedException
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
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Security Control')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Profile')])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@src='/static/media/showGroupImage.6e67e3d4cc42fea757cbca833bca2c3f.svg'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxProfile mt-1 px-2'])")).sendKeys("rohit");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create')])")).click();  //Profile updated successfully
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Profile added successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=3)
void delete_profile() throws InterruptedException
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
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Security Control')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Profile')])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@src='/static/media/showGroupImage.6e67e3d4cc42fea757cbca833bca2c3f.svg'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Profile removed successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
@Test(priority=4)
void view_users() throws InterruptedException
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
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Security Control')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Profile')])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@src='/static/media/showGroupImage.6e67e3d4cc42fea757cbca833bca2c3f.svg'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'View Users')])")).click();
	//Thread.sleep(2000);
	System.out.println("number of users in the profile is displayed");
}
}
