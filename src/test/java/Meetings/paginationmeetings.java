package Meetings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paginationmeetings 
{
@Test(priority=1)
void recordsperpage10_meetings()
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
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	System.out.println("10 records per page are displayed");
}
@Test(priority=2)
void recordsperpage20_meetings()
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
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();
	//Thread.sleep(4000);
	System.out.println("20 records per page are displayed");
}
@Test(priority=3)
void recordsperpage30_meetings()
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
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'30 Records Per Page')])")).click();
	//Thread.sleep(4000);
	System.out.println("30 records per page are displayed");
}
@Test(priority=4)
void recordsperpage40_meetings()
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
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'40 Records Per Page')])")).click();
	//Thread.sleep(4000);
	System.out.println("40 records per page are displayed");
}
@Test(priority=5)
void recordsperpage50_meetings()
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
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'50 Records Per Page')])")).click();
	//Thread.sleep(4000);
	System.out.println("50 records per page are displayed");
}
}
