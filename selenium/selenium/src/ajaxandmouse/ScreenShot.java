package ajaxandmouse;

import java.io.File;
//import java.io.IOException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			FileUtils.copyFile(screenshot, new File("./screenshot/facebook.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		System.out.println("screenshot taken");

	}

}
