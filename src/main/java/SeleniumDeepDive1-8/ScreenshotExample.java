package SeleniumDeepDive;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Driver Object
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver();
		// ***Normal Alert***
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		getScreenshot(driver);
		driver.findElement(By.id("name")).sendKeys("Ankita");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// ***Confirm Alert***
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

	public static void getScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
}
