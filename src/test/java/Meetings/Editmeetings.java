package Meetings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Editmeetings
{
@Test
void editmeeting_save() throws InterruptedException
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
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create')])")).click();  //Meeting Details updated Successfully
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Meeting Details updated Successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test
void editmeeting_allfields() throws InterruptedException 
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
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("chandan");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='m-0'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'None')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Contact')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='d-flex flex-column'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[6]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@name='description'])[2]")).sendKeys("hfhh#$%^&*456");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Create')])")).click();  //Meeting Details updated Successfully
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Meeting Details updated Successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
}
