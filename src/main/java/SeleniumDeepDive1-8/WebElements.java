package SeleniumDeepDive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.get("http://www.spicejet.com/");
		Thread.sleep(2000L);
		/* --------------AutoSuggest Dropdown------------  
		// ***Select Country***
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000L);
		WebElement opp = driver.findElement(By.cssSelector("li[class='ui-menu-item'] a"));
		//System.out.println("opp",opp.toString());
		//System.out.print(opp);
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement op : options)
		{
			if(op.getText().equalsIgnoreCase("india"))
			{
				op.click();
				break;
			}
		}
		System.out.print("*********Country is*********");
		System.out.println(driver.findElement(By.id("autosuggest")).getText());
		
		
		/* -----------------Radio Buttons---------------- */
		// ***Select Roundtrip***
		System.out.print("*********Trip Type is*********");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		Thread.sleep(2000L);
		
		/* ------------Dynamic Dropdown------------------ */
		// ***select from and to city***
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@value=\'BLR\']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click(); 
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value=\'MAA\'])[2]")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click(); 
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCJ']")).click();
		Thread.sleep(3000L);
		System.out.print("*********From city is*********");
		//System.out.println(driver.findElement(By.cssSelector("input[name='ctl00_mainContent_ddl_originStation1_CTXT']")).getCssValue("input[name='ctl00_mainContent_ddl_originStation1_CTXT']"));
		System.out.print("*********To city is**********");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
		
		
		/* ------------------Calendars----------------- */
		// ***Select Departure Date***
		System.out.print("*********Departure Date is*********");
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(3000L);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getText());

		
		/* ---------Validating elements are enabled or disabled on UI---------------*/
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Return Date is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		Thread.sleep(3000L);
		
		// ***Select Return Date***
		System.out.print("*********Return Date is*********");
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default']")).click());
		Thread.sleep(3000L);
		
		/* ------------Select Dropdown------------- 
		// ***Select Passengers - 3 adults***
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.print("*********No of Adults is**********");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		
		 */	
		
		/* ----------------Static Dropdown-------------------- */
		// ***Select Currency***
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		Thread.sleep(2000L);
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.print("**********Currency is**********");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		/* ------------Checkboxes---------------- */
		// ***Passenger Type***
		Thread.sleep(3000L);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.print(checkboxes);
		System.out.println("*********Passenger Type is*********");
		System.out.print(driver.findElement(By.id("discount-checkbox")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		
		// ***Search***
		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']//input")).click();
		
		/* -----------Handling Java Alerts--------------- */
		// ***Normal Alert***
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Ankita");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// ***Confirm Alert***
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}
}
