package Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createlead 
{
	String filepath = "C:\\Users\\AnushaM\\Downloads\\image - 2024-09-11T152852.708.png";
	@Test
	   void testcreatedeal() throws InterruptedException
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
				driver.findElement(By.xpath("(//p[contains(text(),'Commerce')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[contains(text(),'Create Product')])")).click();
				Thread.sleep(4000);
				WebElement fileinputFieldElement = driver.findElement(By.xpath("(//input[@type='file'])"));
				fileinputFieldElement.sendKeys(filepath);
				Thread.sleep(4000);
				
		}
}
