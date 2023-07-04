package SeleniumDeepDive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyAcademyPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * http://www.qaclickacademy.com/
		 * https://rahulshettyacademy.com/#/index
		 * https://rahulshettyacademy.com/dropdownsPractise/
		 * https://rahulshettyacademy.com/AutomationPractice/
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/#/index");
		//driver.findElement(By.linkText("Practice Projects")).click();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
