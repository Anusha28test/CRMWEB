package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createtask
{
	@Test(priority=6)
	void createtask_withmandatoryfields() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Task')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("anju");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Task Created Succesfully
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Tasks created successfully");
		}
		else 
		{
			System.out.println("Tasks is not created successfully");                          
		}
	}
	@Test(priority=5)
	void createtask_allfields() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Task')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("anju");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@value='Lead'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[contains(text(),'Contact')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Deferred')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Normal')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='react-switch-handle'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'02:30 AM')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Pop Up')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='react-switch-handle'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' css-gz24nq-indicatorContainer'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'Monthly')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@value='After'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("jdhjdsfh$#%^&54324564");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Task Created Succesfully
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Tasks created successfully");
		}
		else 
		{
			System.out.println("Tasks is not created successfully");                          
		}
	}
	@Test(priority=4)
	void createtask_saveandnew() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Task')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("anju");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[1]")).click(); //Task Created Succesfully
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Tasks created successfully");
		}
		else 
		{
			System.out.println("Tasks is not created successfully");                          
		}
	}
	@Test(priority=3)
	void invalidsubjectspecialcharacters_task() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Task')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("#$%^&*^%$%^");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Task Created Succesfully
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid  Subject name.')])"));  
		if(button.isEnabled())
		{
			System.out.println("Enter valid subject name");
		}
		else 
		{
			System.out.println("Tasks is not created successfully");                          
		}	
	}
	@Test(priority=2)
	void validsubnumbers_createtask() throws InterruptedException
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
		driver.findElement(By.xpath("(//button[contains(text(),'Create Task')])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("45678");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Task Created Succesfully
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Task Created Succesfully')])"));  
		if(button.isEnabled())
		{
			System.out.println("Task created successfully");
		}
		else 
		{
			System.out.println("Tasks is not created successfully");                          
		}	
	}
	@Test(priority=1)
	void emptyduedate_createtask() throws InterruptedException
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
			driver.findElement(By.xpath("(//button[contains(text(),'Create Task')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("45678");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Task Created Succesfully
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Due date cannot be empty.')])"));  
			if(button.isEnabled())
			{
				System.out.println("Due date is mandatory");
			}
			else 
			{
				System.out.println("Tasks is not created successfully");                          
			}	
	}
}
