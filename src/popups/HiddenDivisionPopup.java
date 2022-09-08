package popups;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		 driver.findElement(By.cssSelector("div#container_tasks")).click();
		 //by using multiple attribute
		 driver.findElement(By.xpath("//div[@class='text' and text()='AA']")).click();
		 driver.findElement(By.xpath("//div[@class='checkbox inactive']/div[@class='img'][1]")).click();
		 driver.findElement(By.cssSelector("div.delete.button")).click();
         driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		 
	}

}
	