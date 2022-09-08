package Session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionHandlingCase1 {

	public static void main(String[] args) throws Throwable  {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Bluetooth");
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.tagName("li"));
	for(WebElement wb:list)
	{
		System.out.println(wb.getText());
	if(wb.getText().contains("bluetooth speakers"))
		{
			wb.click();
			break;
		}
	}

	}

}
