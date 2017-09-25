package checkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//css selector
		// syntax for xpath:  //tagname[@attribute='value']
		// syntax for css:  tagname[attribute='value']
		WebDriver e=new FirefoxDriver();
		e.get("https://login.salesforce.com/");
		e.findElement( By.cssSelector("input[id='username']")).sendKeys("contact4harish@gmail.com");
		e.findElement( By.cssSelector("input[id='password']")).sendKeys("haris123");
		e.findElement( By.xpath("//input[@id='Login']")).click();
		//e.findElement(By.className("fld")).sendKeys("contact4harish@gmail.com");
		
	}

}
