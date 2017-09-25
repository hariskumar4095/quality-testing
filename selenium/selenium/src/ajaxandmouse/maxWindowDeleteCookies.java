package ajaxandmouse;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Cookie;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;

public class maxWindowDeleteCookies {

	
	public static void main(String args[]){
		
		//for accepting untrusted certificate//not mandate
		
		//FirefoxProfile prof=new FirefoxProfile();
		//prof.setAcceptUntrustedCertificates(false);
		//WebDriver driver=new FirefoxDriver(prof);
		
		//kill the process//close applications like note pad, excel,....
		WindowsUtils.tryToKillByName("notepad.exe");
		WindowsUtils.tryToKillByName("excel.exe");
		WindowsUtils.tryToKillByName("chrome.exe");
		WebDriver driver=new FirefoxDriver();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
	   //maximize window
		driver.manage().window().maximize();
		
		
		//handling cookies
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println("the number of cookies are   "+cookies.size() );
		
		//delete all cookies
	      driver.manage().deleteAllCookies();
	      Set<Cookie>cookiesAfterDel=driver.manage().getCookies();
	      System.out.println("cookies after del  "+cookiesAfterDel.size());
	     
		  driver.close();
		  
		  
		
	}
}
