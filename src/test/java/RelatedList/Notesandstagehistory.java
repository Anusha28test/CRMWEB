package RelatedList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Notesandstagehistory 
{
/*@Test(priority=3)
void notes() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'234567876')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Notes')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@class='notesClass'])")).sendKeys("jndcjdj@#$%^dsfg23456");
	driver.findElement(By.xpath("(//textarea[@class='notesClass'])")).click();
	driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("jndcjdj@#$%^dsfg23456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='file'])")).sendKeys("C:\\Users\\AnushaM\\Downloads\\image - 2024-09-11T152852.708.png");
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	System.out.println("Notes added successfully");
}
@Test(priority=2)
void delete_notes() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Notes')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//img[@src='/static/media/DeleteNote.391e0632849390e2cdb823c1132500dd.svg'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Ok')])[1]")).click(); //Notes Deleted Successfully
	//Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Notes Deleted Successfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("notes  deleted successfully");
	}
	else 
	{
		System.out.println("notes is not deleted successfully");                          
	}
	
}*/
@Test(priority=1)
void edit_notes() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Notes')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("hhfehfeef"); //Notes Deleted Successfully
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Notes Updated Successfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("notes  updated successfully");
	}
	else 
	{
		System.out.println("notes is not updated successfully");                          
	}
}
/*@Test(priority=2)
void stagehistory() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anuj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Stage History')])")).click();
	Thread.sleep(4000);
	System.out.println("Display stage history");
}
@Test(priority=1)
void stagehistory_change() throws InterruptedException
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
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Edit')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Negotiation/Review')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Stage History')])")).click();
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//td[contains(text(),'Negotiation/Review')])"));  
	if(button.isEnabled())
	{
		System.out.println("Stage history updated successfully");
	}
	else 
	{
		System.out.println("stage history is not updated successfully");                          
	}
}*/
}
