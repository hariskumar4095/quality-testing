package checkSelenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class browserinvocation {
	
	public static void main(String[] args){
		
		
		WebDriver d=new FirefoxDriver();
		
		
		//combination firefox<47 selenium 2.5
		//more than that 3.0
		
		
		d.get("https://www.google.com/search?q=google&ie=utf-8&oe=utf-8");
		System.out.println(d.getTitle());   // Google Inc.
		System.out.println(d.getPageSource());
		System.out.println(d.getCurrentUrl());//https://www.google.com/search?q=google&ie=utf-8&oe=utf-8
		d.close();
		
		
		
	}

}
