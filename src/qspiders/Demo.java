package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin");
		 Thread.sleep(3000);
	WebElement text = driver.findElement(By.name("pwd"));
		 text.sendKeys("manager");
		 
		// Thread.sleep(2000);
		 text.submit();
      //  driver.findElement(By.className("initial")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("View Time-Track")).click();
		//driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		
//        driver.findElement(By.partialLinkText("Lock")).click();
        
//        driver.findElement(By.cssSelector("#username")).sendKeys("admin");
//        driver.findElement(By.name("pwd")).sendKeys("manager");
//        driver.findElement(By.cssSelector(".initial")).click();
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//        driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
//        driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("admin");
//        driver.findElement(By.xpath("//a[contains(text(),'Lock')]")).click();
//        
      
       

}}
