package Delete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dealsdelete 
{
	@Test
	void Delete_deal() throws InterruptedException
	{
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
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//td[contains(text(),'gfdanu')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary bg-white text-dark border border-primary\"])[2]")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
				//Thread.sleep(4000);
		}
}
}
