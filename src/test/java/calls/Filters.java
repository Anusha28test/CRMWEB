package calls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Filters
{
@Test(priority=1)
void allcalls_filters()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'All Calls')])[2]")).click();
	//Thread.sleep(4000);
	System.out.println("All calls are displaying in calls homepage");
}
@Test(priority=2)
void attendedcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Attended Calls')])[1]")).click();
	//Thread.sleep(4000);
	System.out.println("Attended calls are displaying in calls homepage");
}
@Test(priority=3)
void cancelledcalls_filters()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Cancelled Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("Cancelled calls are displaying in calls homepage");
}
@Test(priority=4)
void completedcalls_filters()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Completed Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("Completed calls are displaying in calls homepage");
}
@Test(priority=5)
void incomingcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Incoming Calls')])[1]")).click();
	//Thread.sleep(4000);
	System.out.println("Incoming calls are displaying in calls homepage");
}
@Test(priority=6)
void missedcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Missed Calls')])[1]")).click();
	//Thread.sleep(4000);
	System.out.println("Missed calls are displaying in calls homepage");
}
@Test(priority=7)
void Myattendedcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Attended Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My attended calls are displaying in calls homepage");
}
@Test(priority=8)
void mycalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My calls are displaying in calls homepage");
}
@Test(priority=9)
void myincomingcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Incoming Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My incoming calls are displaying in calls homepage");
}
@Test(priority=10)
void mymissedcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Missed Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My missed calls are displaying in calls homepage");
}
@Test(priority=11)
void myoutgoingcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Outgoing Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My outgoing calls are displaying in calls homepage");
}
@Test(priority=12)
void myoverduecalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Overdue Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My overdue calls are displaying in calls homepage");
}
@Test(priority=13)
void Myscheduledcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'My Scheduled Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("My scheduled calls are displaying in calls homepage");
}
@Test(priority=14)
void outgoingcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Outgoing Calls')])[2]")).click();
	//Thread.sleep(4000);
	System.out.println("Outgoing calls are displaying in calls homepage");
}
@Test(priority=15)
void Overduecalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Overdue Calls')])[2]")).click();
	//Thread.sleep(4000);
	System.out.println("Overdue calls are displaying in calls homepage");
}
@Test(priority=16)
void scheduled_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Scheduled Calls')])[2]")).click();
	//Thread.sleep(4000);
	System.out.println("Scheduled calls are displaying in calls homepage");
}
@Test(priority=17)
void todayScheduledCalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Scheduled Calls')])[3]")).click();
	//Thread.sleep(4000);
	System.out.println(" Today's Scheduled calls are displaying in calls homepage");
}
@Test(priority=18)
void Unattendedcalls_filter()
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
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Calls')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'Unattended Calls')])")).click();
	//Thread.sleep(4000);
	System.out.println("Unattended calls are displaying in calls homepage");
}
}
