package Meetings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Overviewandtimeline
{
//@Test(priority=1)
void Timeline_meetings()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'rakshachandan')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
	//Thread.sleep(4000);
	System.out.println("Timeline is displayed");
}
//@Test(priority=2)
void Overview_meetings()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'rakshachandan')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[contains(text(),'Info')])")).click();
	//Thread.sleep(4000);
	System.out.println("Info page is displayed");
}
@Test(priority=3)
void editallfields_overviewMeetings() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anuj')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer meetings_edit_icon'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).clear();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("anuj");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='location'])")).sendKeys("smg");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@class='hours_box position-relative'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='cursorPointer'])[7]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anu16@mailinator.com')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'DONE')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='m-0'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1x4ez8u-option'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ms-1'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-3993q7-option'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[@class='cursorPointer list-group-item'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='save_btn'])")).click();  //Meeting Details updated Successfully
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
//@Test(priority=4)
void addparticipants_meetings()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'rakshachandan')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1x4ez8u-option'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ms-1'])[1]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='ms-1'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='save_btn py-2 border border-0 rounded-2 h-100'])")).click();  //Successful
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
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
//@Test(priority=5)
void addnotes_meetings() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'rakshachandan')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@name='description'])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("jdjfjjk");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("jdjfjjk");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='file'])")).sendKeys("C:\\Users\\AnushaM\\Downloads\\image - 2024-09-25T080755.600.png");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='editNoteButton'])")).click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Notes added Successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
@Test(priority=6)
void notesdelete_Meetings() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Meetings')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anuj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//img[@src=''])")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@class='deleteButton px-4 p-1'])")).click();
	//Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Notes Deleted Successfully')])")));
		   // If success message is found, print it
	         System.out.println("Success message: " + successMessage.getText());
	   }
	   catch(Exception e)
	   {
		   System.out.println("No success or error message found.");
	   }
}
}
