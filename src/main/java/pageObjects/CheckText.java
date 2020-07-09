package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckText {
	
	WebDriver driver;

	//By checktext = driver.findElement("//a[text()= 'Home']");
	WebElement checktex = driver.findElement(By.xpath("//a[text()= 'Home']"));
	public WebElement check()
	{
		return checktex ;
		
	}
   
	
	
}
