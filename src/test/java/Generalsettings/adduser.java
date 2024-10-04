package Generalsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class adduser 
{
@Test(priority=1)
void adduser_settings()
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
	driver.findElement(By.xpath("(//div[contains(text(),'+Add User')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='emailId'])")).sendKeys("loki1235@mailinator.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxDeal mt-1 px-2'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'CEO')])[5]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='Administrator'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add User')])")).click();
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
@Test(priority=2)
void invalid_email()
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
	driver.findElement(By.xpath("(//div[contains(text(),'+Add User')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='emailId'])")).sendKeys("loki108mailinator.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputBoxDeal mt-1 px-2'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'CEO')])[5]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='Administrator'])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add User')])")).click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Please Enter Valid Email Address!')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test(priority=3)
void empty_Role()
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
	driver.findElement(By.xpath("(//div[contains(text(),'+Add User')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='emailId'])")).sendKeys("loki1239mailinator.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add User')])")).click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  //Successful
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Role must be selected.')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
}
