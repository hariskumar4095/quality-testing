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
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://google.com");
		d.close();
		
		//ie driver
		
		System.setProperty("webdriver.ie.driver","D:\\softwares\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		WebDriver e=new InternetExplorerDriver();
		e.get("http://google.com");
		e.close();
	}

}
