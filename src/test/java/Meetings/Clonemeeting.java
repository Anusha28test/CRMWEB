package Meetings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Clonemeeting 
{
/*@Test(priority=1)
void clonemeeting() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'raksha')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary ms-2'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Clone')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create')])")).click();  //Meeting details added successfully 
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
}*/
@Test(priority=2)
void Clone_editallfields_Meeting() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'raksha')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary ms-2'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Clone')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).clear();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("Anaga");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='location'])")).sendKeys("india");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[6]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[7]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='m-0'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-o3khks-option'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[@class='cursorPointer list-group-item'])[6]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[@class='cursorPointer list-group-item'])[7]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create')])")).click();  //Meeting details added successfully 
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

