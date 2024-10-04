package Generalsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Personalprofile
{
@Test(priority=1)
void Personalprofile_edit() throws InterruptedException
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
	driver.findElement(By.xpath("(//span[contains(text(),'Personal Profile')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='firstName'])")).sendKeys("7");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='lastName'])")).sendKeys("7");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='aliasName'])")).sendKeys("7ndsfsf^&*");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).sendKeys("8765456781");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='mobileNumber'])")).sendKeys("8765456781");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='website'])")).sendKeys("https://www.lsdjdf.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='fax'])")).sendKeys("99423485785775785");
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='street'])")).sendKeys("nfgdf@#$%^&543456754");
	//Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='city'])")).sendKeys("nfgdsdhfhs");
	//Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='state'])")).sendKeys("sakdd");
	//Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='zipCode'])")).clear();
	//Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='zipCode'])")).sendKeys("876566");
	//Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='country'])")).clear();
	//Thread.sleep(7000);
	driver.findElement(By.xpath("(//input[@name='country'])")).sendKeys("ghfshgfffg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  
	//Thread.sleep(7000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'User Details Updated successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test(priority=2)
void Invalidwebsite_edit()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Personal Profile')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='website'])")).sendKeys("234564321345643234565432");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  
	//Thread.sleep(7000);
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
@Test(priority=3)
void invalid_Lastname()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Personal Profile')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='lastName'])")).sendKeys("jnscn@#$%^&");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Please enter valid Last Name
	//Thread.sleep(7000);  //Please enter valid First Name
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Please enter valid Last Name')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test(priority=4)
void invalid_firstname()
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
	driver.findElement(By.xpath("(//span[contains(text(),'Personal Profile')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'EDIT')])")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='firstName'])")).sendKeys("jnscn@#$%^&");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();  //Please enter valid Last Name
	//Thread.sleep(7000);  //Please enter valid First Name
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Please enter valid First Name')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
}
