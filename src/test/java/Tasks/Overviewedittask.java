package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Overviewedittask {

	@Test(priority=1)
	void Overview_editallfields() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='w-100 cursorPointer indvEditInput border-0 indivOwnerInput'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anu17@mailinator.com')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'DONE')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subjectInfo'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subjectInfo'])")).sendKeys("gagan");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ps-2 cursorPointer'])")).click();
		Thread.sleep(7000);
		/*driver.findElement(By.xpath("(//div[@class='d-flex editInput_container '])[3]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[@class='ps-2 cursorPointer'])")).click();
		Thread.sleep(4000);*/
		driver.findElement(By.xpath("(//input[@name='statusInfo'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'In Progress')])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Deferred')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ps-2 cursorPointer'])")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@name='priorityInfo'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Lowest')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'High')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ps-2 cursorPointer'])")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//textarea[@name='descriptionInfo'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//textarea[@name='descriptionInfo'])")).sendKeys("bhjsdfjgus@#$%^3456");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ps-2 cursorPointer'])")).click();
		Thread.sleep(7000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Updated Successfully !')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
		}
	@Test(priority=2)
	void task_timeline() throws InterruptedException
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
		driver.findElement(By.xpath("(//p[contains(text(),'Tasks')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anju')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
		Thread.sleep(4000);
	}
	}


