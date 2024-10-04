package Deals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createdeals
{
	public static void main(String[] args) throws InterruptedException 
	{
		testclick_to_dealspage();
	}
	static void testclick_to_dealspage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("anuj01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Anusha@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'CRM')])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(4000);
			System.out.println("Navigate to Deals page");
	}
}
