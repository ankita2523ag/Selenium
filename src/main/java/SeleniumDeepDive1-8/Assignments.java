package SeleniumDeepDive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignments {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/#/index");
		//driver.findElement(By.linkText("Practice Projects")).click();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*
		 *  ---------------Assignment after section 58 --------------------
		 */
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@value='option1']")).isSelected());
		System.out.println("---Check First Checkbox and Assert True---");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@value='option1']")).isSelected());
		System.out.println("---UnCheck First Checkbox and Assert False---");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='checkbox-example'] //input[contains(@id, checkBoxOption)]"));
		System.out.println("---No of Checkboxes---");
		System.out.println("Checkboxes are:: "+ ele.size());
	
		/*
		 *  ---------------Assignment after section 65 --------------------
		 */
	}
}
