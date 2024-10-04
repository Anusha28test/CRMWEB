package calls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Editcall 
{
@Test
void editallfields() throws InterruptedException
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
	driver.findElement(By.xpath("(//td[@class=' leadName cursorPointer'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='position-relative'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Edit')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-3993q7-option'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])[2]")).clear();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='subject'])[2]")).sendKeys("karma");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Call Created Succesfully
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Call updated Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());  //Invalid call duration
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");  
	   }
}
}
