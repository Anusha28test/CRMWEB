package CRMusersignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMwebSignup {

	public static void main(String[] args) throws InterruptedException {
		testvalid_user_signup();
		/*testvalid_user_signin();
		testvalid_user_signin_withOTP();
		testvalid_user_signin_withResendOTP();
		testvalid_user_signin_withforgotpassword();
		testinvalid_user_signin();
		testinvalid_user_signin_withoutpswd();
		testinvalid_user_signup_withoutfirstname();
		testinvalid_user_signup_withoutlastname();
		testinvalid_user_signup_withoutmail();
		testinvalid_user_signup_withoutpswd();
		testinvalid_user_signup_withoutphonenumber();
		testinvalid_user_signup_withoutclickcheckbox();
		testinvalid_user_signup_spclcharactersfirstname();
		testinvalid_user_signup_numbersfirstname();
		testvalid_user_signup_minimumcharactersfirstname();
		testinvalid_user_signup_spclcharacterslastname();
		testinvalid_user_signup_numberslastname();
		testinvalid_user_signup_charactersmail();
		testinvalid_user_signup_spclcharactersmail();
		testinvalid_user_signup_numbersmail();
		testvalid_user_signup_minimum_mail();
		testinvalid_user_signup_samecompany();
		testinvalid_user_signup_characterspswd();
		testinvalid_user_signup_numberspswd();
		testinvalid_user_signup_spclcharacterspswd();
		testvalid_user_signup_minimumpswd();
		testvalid_user_signup_maximumpswd();
		testvalid_user_signup_maximumfirstname();
		testvalid_user_signup_maximumlastname();
		testvalid_user_signup_maximummail();
		testinvalid_user_signup_spclcharacterscompanyname();
		testinvalid_user_signup_numberscompanyname();
		testinvalid_user_signup_maximumcompanyname();
		testinvalid_user_signup_minimumcompanyname();
		testinvalid_user_signup_charactersphone();
		testinvalid_user_signup_spclcharactersphone();*/
	}
	static void testvalid_user_signup() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("456754");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("ABD private ltd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Mobile'])")).sendKeys("1234567891");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User Details added successfully");
			}
			else 
			{
				System.out.println("user details is not added successfully");                          
			}	
	}
	/*static void testvalid_user_signin() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email address'])")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Enter Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//p[contains(text(),'Login using OTP')])")).click();
			//Thread.sleep(60000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn mt-1'])")).click();
			Thread.sleep(2000);
			System.out.println("User login successfully");
	}
	static void testvalid_user_signin_withOTP() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email address'])")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Login using OTP')])")).click();
			Thread.sleep(60000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			System.out.println("User login successfully");
	}
	static void testvalid_user_signin_withResendOTP() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email address'])")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Login using OTP')])")).click();
			Thread.sleep(70000);
			driver.findElement(By.xpath("(//p[contains(text(),'Resend OTP')])")).click();
			Thread.sleep(60000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			System.out.println("User login successfully");
	}	
	static void testvalid_user_signin_withforgotpassword() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email address'])")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Forgot Password?')])")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
			Thread.sleep(60000);
			driver.findElement(By.xpath("(//input[@placeholder='New Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Confirm Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
			Thread.sleep(2000);
			System.out.println("forgot password created successfully");
	}	
	static void testinvalid_user_signin() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid email address.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to login ");
			}
			else 
			{
				System.out.println("user enter invalid mail");                          
			}	
	}
	static void testinvalid_user_signin_withoutpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email address'])")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='LoginNextBtn'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//button[contains(text(),'Next')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to login without password ");
			}
			else 
			{
				System.out.println("user enter invalid password");                          
			}
	}	
	static void testinvalid_user_signup_withoutfirstname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("Anu private ltd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("1234567891");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'First Name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}	
	}
	static void testinvalid_user_signup_withoutlastname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("Anu private ltd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("1234567891");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Last Name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}	
	}
	static void testinvalid_user_signup_withoutmail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("Anu private ltd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("1234567891");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Enter valid email address')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}	
	}
	static void testinvalid_user_signup_withoutpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("Anu private ltd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("1234567891");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Password cannot be empty.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}	
	}
	static void testinvalid_user_signup_withoutcompanyname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("1234567891");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Company name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}	
	}
	static void testinvalid_user_signup_withoutphonenumber() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abc tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter valid phone number.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}	
	}
	static void testinvalid_user_signup_withoutclickcheckbox() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abc tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			System.out.println("User unable to add successfully ");	                    
	}
	static void testinvalid_user_signup_spclcharactersfirstname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("#$%^&%$#@$%$#");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abc tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'First Name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_numbersfirstname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("#$%^&%$#@$%$#");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abc tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'First Name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_minimumcharactersfirstname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj77@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcde tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_spclcharacterslastname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("#$%^&*(&^%$#%^&");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj77@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcde tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Last Name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_numberslastname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("34567887654678");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj77@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcde tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Last Name cannot be empty')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_charactersmail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anujmailinatorcom");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcde tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Enter valid email address')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_spclcharactersmail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("#$%^&*(&^%$#@$%^&*(&^%");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcde tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Enter valid email address')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_numbersmail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("324567876543");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcde tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Enter valid email address')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_minimum_mail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("r@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdegh tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   //Already same company name exists ,please add new company name!
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_samecompany() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("p@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdegh tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   //First Name cannot be empty
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Already same company name exists ,please add new company name!')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");   //Already same company name exists ,please add new company name!
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_characterspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("p@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghg tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Password must contain at least one lowercase letter, one uppercase letter, one number, one special character and should be between 8 to 20 characters long.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");   
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_numberspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("p@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("234567898");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghg tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Password must contain at least one lowercase letter, one uppercase letter, one number, one special character and should be between 8 to 20 characters long.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");   
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_spclcharacterspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("p@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("@#$%^&*^%$#@$%^");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghg tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Password must contain at least one lowercase letter, one uppercase letter, one number, one special character and should be between 8 to 20 characters long.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");   
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_minimumpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("p@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha1@");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghg tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_maximumpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("AB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("q@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha1@qwertyuiop");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghq tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_maximumfirstname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABjkhgfdsfgiuytrestyuiouytretyueiuyiuygftdstyuiopi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("y@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghqs tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_maximumlastname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABjkhgfdsfgiuytrestyuiouytretyueiuyiuygftdstyuiopi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("gsaadfghjkljhngbfvdsasdfghjkljhgfdsedrtyuiouytrewr");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("yp@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghqsr tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testvalid_user_signup_maximummail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABjkhgfdsfgiuytrestyuiouytretyueiuyiuygftdstyuiopi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("gsaadfghjkljhngbfvdsasdfghjkljhgfdsedrtyuiouytrewr");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("q@mail.comjhsgdhsahudyuuyusuidfiouweuruweuurweyryweyryweyrweydgh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("abcdeghqsar tech");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_spclcharacterscompanyname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("qp@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("@#$%^&*(&^%$#@#$%^&*^%$#");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_numberscompanyname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("qpr@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("34567897654323456787");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_maximumcompanyname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("qprs@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("sdjkfskjdhfvdjoiugfdgiojihytrdsedfyuiuytresdrtyuio");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_minimumcompanyname() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("qprss@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("s");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("8765432123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(8000);
			WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'User Details added successfully')])"));
			if(button.isEnabled())
			{
				System.out.println("User able to add successfully ");   
			}
			else 
			{
				System.out.println("user unable to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_charactersphone() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("qprssa@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("syu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("jshw");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter valid phone number.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");   //Please enter valid phone number.
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}
	static void testinvalid_user_signup_spclcharactersphone() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("g");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("qprssan@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("syus");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Phone'])")).sendKeys("#$%^&%$#@#$%^$#@");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();   
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter valid phone number.')])"));
			if(button.isEnabled())
			{
				System.out.println("User unable to add successfully ");   //Please enter valid phone number.
			}
			else 
			{
				System.out.println("user able to add successfully");                          
			}                    
	}*/
}
