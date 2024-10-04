package RelatedList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Products 
{
/*@Test(priority=2)
void related_products() throws InterruptedException
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
	driver.findElement(By.xpath("(//li[contains(text(),'Products')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Add Product')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();  //Relation added successfully
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Relation added successfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("Products added successfully");
	}
	else 
	{
		System.out.println("Products is not added successfully");                          
	}
}
@Test(priority=1)
void relatedlist_quotes() throws InterruptedException
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
	driver.findElement(By.xpath("(//li[contains(text(),'Quotes')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'New')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputField'])[1]")).sendKeys("njhjdshj");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click(); //Quotes information details added Succesfully
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Quotes information details added Succesfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("quotes added successfully");
	}
	else 
	{
		System.out.println("quotes is not added successfully");                          
	}
	
}*/
@Test
void relatedlist_quotes_saveandnew() throws InterruptedException
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
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'hsdhjfdsj')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//li[contains(text(),'Quotes')])")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'New')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='insertCommonInputField'])[1]")).sendKeys("anusha");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[contains(text(),'anuj')])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click(); 
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click(); //Quotes information details added Succesfully
	Thread.sleep(4000);
	WebElement button = driver.findElement(By.xpath("(//h4[contains(text(),'Quotes information details added Succesfully')])"));  
	if(button.isEnabled())
	{
		System.out.println("quotes added successfully");
	}
	else 
	{
		System.out.println("quotes is not added successfully");                          
	}
}

}
