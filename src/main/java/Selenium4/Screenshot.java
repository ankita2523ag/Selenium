package Selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Partial Screenshot
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Screenshots/logo.png"));
		
		//Full page screenshot
		File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file2, new File("Screenshots/fullPage.png"));
		
		

	}

}
