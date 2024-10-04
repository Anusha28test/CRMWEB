package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Deleteandclonetask
{
/*@Test
void deletetask() throws InterruptedException
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
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary d-flex align-items-center'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(4000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			   try {
				   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task deleted successfully.')])")));
				   // If success message is found, print it
			         System.out.println("Success message: " + successMessage.getText());
			   }
			   catch(Exception e)
			   {
				   System.out.println("No success or error message found.");
			   } 
		}*/
@Test(priority=3)
void Clonetask() throws InterruptedException
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
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary d-flex align-items-center'])[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
			Thread.sleep(4000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			   try {
				   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])")));
				   // If success message is found, print it
			         System.out.println("Success message: " + successMessage.getText());
			   }
			   catch(Exception e)
			   {
				   System.out.println("No success or error message found.");
			   }
		}
@Test(priority=2)
void clonetask_saveandnew() throws InterruptedException
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
	driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary d-flex align-items-center'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])[1]")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
	}
@Test(priority=1)
void clone_editallfields() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary d-flex align-items-center'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[contains(text(),'anu17@mailinator.com')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("Shiva");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Waiting for input')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-15lsz6c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1x4ez8u-option'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='react-switch-bg'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("dshshdh#$%^$3u43545uuunncnvnbvnbnnnbvnbvnbfnb");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try {
			   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])")));
			   // If success message is found, print it
		         System.out.println("Success message: " + successMessage.getText());
		   }
		   catch(Exception e)
		   {
			   System.out.println("No success or error message found.");
		   }
	}
}
