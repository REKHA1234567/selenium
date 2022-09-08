package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement submit = driver.findElement(By.name("q"));
	submit.sendKeys("selenium");
submit.submit();
	}

}
