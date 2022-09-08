package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchTheBrowser{

	public static void main(String[] args) throws Throwable
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Create New Account")).click();
	
	WebElement dayList =driver.findElement(By.id("day"));
	dayList.click();
	dayList.sendKeys(Keys.ARROW_UP);
	dayList.sendKeys(Keys.ARROW_UP);
	dayList.sendKeys(Keys.ENTER);
	
	}

}
