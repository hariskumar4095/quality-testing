package checkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driver {
	
	public static void main(String args[]){
		
		//firefox driver
		WebDriver c=new FirefoxDriver();
		c.get("http://google.com");
		c.close();		
				
		//chrome driver 
		System.setProperty("webdriver.chrome.driver","G:\\MS Essential Softwares\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://google.com");
		d.close();
		
		//ie driver
		
		System.setProperty("webdriver.ie.driver","G:\\MS Essential Softwares\\IEDriverServer.exe");
		WebDriver e=new InternetExplorerDriver();
		e.get("http://google.com");
		e.close();
		
		//gaecko driver//if you are using new version
		//System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	}

}
