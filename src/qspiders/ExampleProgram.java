package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleProgram 
{
	public static void main(String[] args) {
		
	
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.findElement(By.id("gh-shop-a")).click();
	//List<WebElement> list = driver.findElements(By.xpath("//table[@class='gh-tbl']/tbody/tr/td[2]//h3[@class='gh-sbc-parent']//a[text()='Other categories']"));
	List<WebElement> list = driver.findElements(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[3]//ul//li"));
	for(WebElement wb:list)
	{
		System.out.println(wb.getText());
	}
}}
