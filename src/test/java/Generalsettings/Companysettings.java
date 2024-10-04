package Generalsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Companysettings 
{
@Test(priority=1)
void editallfields_companysetting()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Company Settings')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='companyName'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='companyName'])")).sendKeys("Block stack");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='alias'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='alias'])")).sendKeys("company");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='employeeCount'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='employeeCount'])")).sendKeys("1234");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='description'])")).sendKeys("1234sdfgdksjahgdhjkdc");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='phone'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='phone'])")).sendKeys("9876543219");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='mobile'])")).sendKeys("9876543219");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='website'])")).sendKeys("https://www.lsdjdf.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='fax'])")).sendKeys("128589121245");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='street'])")).sendKeys("dsfjsdhfjsejfhj");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click(); 
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Company Details Updated Successfully!')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test(priority=2)
void invalid_employeecount()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Company Settings')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='employeeCount'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='employeeCount'])")).sendKeys("1234764766767");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'The Employee count cannot exceed 1,00,000.')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  //Please enter valid website
	   }
}
@Test(priority=3)
void invalid_website()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Company Settings')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='website'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='website'])")).sendKeys("jdsjfjsnvnbdsjbjfsdj");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Please enter valid website')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
@Test (priority=4)
void empty_companyname()   
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
	driver.findElement(By.xpath("(//span[contains(text(),'Company Settings')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='companyName'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Company Name cannot be empty')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
}
