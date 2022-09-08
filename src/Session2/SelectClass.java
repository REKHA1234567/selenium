package Session2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create New Account")).click();

//selectByindex()
WebElement daylist = driver.findElement(By.id("day"));
Select sel=new Select(daylist);
sel.selectByIndex(20);


//selectByValue()
WebElement monthlist = driver.findElement(By.id("month"));
Select sele=new Select(monthlist);
sele.selectByValue("2");

//selectByVisibleText()
WebElement yearlist = driver.findElement(By.id("year"));
Select select=new Select(yearlist);
select.selectByVisibleText("2021");
	}

}
