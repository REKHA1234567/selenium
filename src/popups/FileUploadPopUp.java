package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");

		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		WebElement file = driver.findElement(By.id("file-upload"));
		file.sendKeys("C:\\Users\\Shobha\\Downloads\\extentReportDoc.txt");
		System.out.println("uploaded sucessfully");
		
	}
}
