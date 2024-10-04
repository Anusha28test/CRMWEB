package Securitycontrol;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class newprofile 
{
//@Test(priority=1)
void add_newprofile()
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
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'New Profile')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='profileName'])")).sendKeys("lokeshbro7");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='clear-button-profile'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[1]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='unassignButton px-4'])")).click();  ///Profile added successfully
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
//@Test(priority=2)
void empty_profilename()
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
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'New Profile')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='profileName'])")).sendKeys("");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='clear-button-profile'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[1]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='unassignButton px-4'])")).click();  ///Profile added successfully
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try 
	   {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Profile Name cannot be empty.')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //One of the required field is empty or contains invalid data, please check your input(s).
	   }
}
}
