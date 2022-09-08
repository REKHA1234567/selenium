package popups;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws Throwable {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
	 driver.findElement(By.linkText("Types of Work")).click();
		 driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	 driver.findElement(By.name("name")).sendKeys("shobharani");
	 driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		 
		 Alert alt = driver.switchTo().alert();
	 
	 String text = alt.getText();
	 System.out.println(text);
	 
		// alt.accept();
		 alt.dismiss();
		 
		 
		
	
	}}
