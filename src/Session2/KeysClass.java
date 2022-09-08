package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass {

	public static void main(String[] args) throws Throwable {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//case1
//	driver.findElement(By.id("username")).sendKeys("admin");
//	Thread.sleep(1000);
//	WebElement password = driver.findElement(By.name("pwd"));
//password.sendKeys("manager");
//password.sendKeys(Keys.ENTER);

//case2
driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}

}
