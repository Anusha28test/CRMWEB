package Filters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DealsFilters
{
@Test(priority=11)
void deals_alldeals() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'All Deals')])[2]")).click();
	//Thread.sleep(4000);
	System.out.println("Opened All deals page");
}
@Test(priority=10)
void deals_Closingnextmonth() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Closing Next Month')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to Closing next month details");
}
@Test(priority=9)
void deals_Closingthismonth() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Closing This Month')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to Closing this month details");
}
@Test(priority=8)
void deals_DealsSharedByMe() throws InterruptedException
{
	WebDriver driver;
	driver = new ChromeDriver();
	System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
	driver.get("https://backoffice.chaincrm.io/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Deals Shared by Me')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to Deals shared by me details");
}
@Test(priority=7)
void deals_DealsSharedToMe() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Deals Shared to Me')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to Deals shared To me details");
}
@Test(priority=6)
void deals_MyDeals() throws InterruptedException 
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Deals')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to My Deals details");
}
@Test(priority=5)
void Deals_MyDealsClosingThisMonth() throws InterruptedException
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
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Deals Closing This Month')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to My Deals closing this month details");
}
@Test(priority=4)
void deals_NewLastWeek() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'New Last Week')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to New last week details");
}
@Test(priority=3)
void deals_NewThisWeek() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'New This Week')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to New This week details");
}
@Test(priority=2)
void deals_RecentlyCreatedDeals() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Recently Created Deals')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to Recently Created Deals details");
}
@Test(priority=1)
void deals_RecentlyModifiedDeals() throws InterruptedException
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Recently Modified Deals')])")).click();
	//Thread.sleep(4000);
	System.out.println("Navigate to Recently modified Deals details");
}
}
