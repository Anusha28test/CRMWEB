package Securitycontrol;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RolesAndSharing
{
//@Test(priority=1)
void add_newrole()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Roles and Sharing')])")).click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add New Role')])")).click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='roleName'])")).sendKeys("appollo");
		//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='reports'])")).click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'chamundidevi')])")).click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); //Role added successfully
		//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	try 
	{
		WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Role added successfully')])")));
		// If success message is found, print it
		    System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
		    }
	catch(Exception e)
	{
		System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	}
}
//@Test(priority=2)
void edit_newrole()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Roles and Sharing')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='hover-icon'])[1]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxNewRole mt-1 px-2'])[1]")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxNewRole mt-1 px-2'])[1]")).sendKeys("mysore");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	try 
	{
		WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Role updated successfully')])")));
		// If success message is found, print it
		    System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
		    }
	catch(Exception e)
	{
		System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	}
}
//@Test(priority=3)
void delete_role()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Roles and Sharing')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='hover-icon'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxNewRole cursorPointer mt-1'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'chamundidevi')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Transfer and Delete')])")).click();  //Role deleted successfully
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	try 
	{
		WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Role deleted successfully')])")));
		// If success message is found, print it
		    System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
		    }
	catch(Exception e)
	{
		System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	}
}
@Test(priority=4)
void collapseall_role()
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
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class='cursorPointer'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'Roles and Sharing')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Collapse All')])")).click();
	//Thread.sleep(2000);
	System.out.println("it is hiding roles under the main role");
}
}
