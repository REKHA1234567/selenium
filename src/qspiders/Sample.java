package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("admin");

	//Dimension is a class
/* Dimension dim = username.getSize();
 System.out.println(dim.getHeight()+"--------"+dim.getWidth());
 
 //point is a class
 Point p = username.getLocation();
 System.out.println(p.getX()+"-----"+p.getY());
 //System.out.println(p.getX()+"-------"+p.getY());
 
//Rectangle is a class
 Rectangle rec = username.getRect();
 System.out.println("Height is:"+rec.getHeight());
 System.out.println("width is:"+rec.getWidth());
 System.out.println("X is:"+rec.getX());
 System.out.println("y is:"+rec.getY());*/
 
 //isDisplayed
/* WebElement logo = driver.findElement(By.cssSelector("div.atLogoImg"));
 if(logo.isDisplayed())
 {
	 System.out.println("Logo is visible");
 }
 else
 {
	 System.out.println("Logo is not visible");
 }*/
 
 //isEnable
 /*WebElement username1 = driver.findElement(By.cssSelector("[placeholder=\"Username\"]"));
 if(username1.isEnabled())
 {
	 username1.sendKeys("admin");
 }
 else
 {
	 System.out.println("username field is disabled");
 }*/
 
// username.sendKeys("admin");
 
 //getTagName()
 WebElement password = driver.findElement(By.name("pwd"));
 password.sendKeys("manager");
 System.out.println(password.getTagName());
 
 //getAttribute
 String attribute = password.getAttribute("name");
 System.out.println("name attribute value is:"+attribute);
 
 
 
 //isSelected
/*WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
checkbox.click();
 if(checkbox.isSelected())
 {
	 System.out.println("checkbox is selected");
 }
 else
 {
	 System.out.println("checkbox is not selected");
 }*/
 
}
}