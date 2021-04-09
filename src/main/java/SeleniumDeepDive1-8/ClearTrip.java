package SeleniumDeepDive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com/");
		Thread.sleep(3000L);
		//driver.switchTo().alert().accept();
		//Select calendar current date
		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		Thread.sleep(3000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//Select adults
		WebElement adults = driver.findElement(By.id("Adults"));
		Select s = new Select(adults);
		s.selectByIndex(2);
		//Select children
		WebElement child = driver.findElement(By.id("Childrens"));
		Select s1 = new Select(child);
		s1.selectByIndex(2);
		//more options link
		driver.findElement(By.xpath("//a[@title='More search options']")).click();
		//enter airline name
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(3000L);
		List <WebElement> dropdownSearch = driver.findElements(By.xpath("//ul[@id='ui-id-3']//li"));
		for(WebElement ds : dropdownSearch)
		{
			if(ds.getText().equalsIgnoreCase("IndiGo (6E)"))
			{
				ds.click();
				break;
			}
		}
		//Search flights
		driver.findElement(By.xpath("//div//input[@value='Search flights']")).click();
		Assert.assertTrue(driver.findElement(By.id("homeErrorMessage")).isDisplayed());
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
