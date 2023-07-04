package SeleniumDeepDive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Driver Object
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver();
		/* Facebook Login
		driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("ankitaagrawal2393@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("ankitaagrawal2393@gmail.com");
        //driver.findElement(By.className("test")).sendKeys("ankitaagrawal2393@gmail.com");
        driver.findElement(By.linkText("Create a Page")).click();
        */
		/* Selenium Dev 
        driver.get("https://www.selenium.dev/documentation/en/getting_started/");
        driver.findElement(By.xpath("//*[@id=\'sidebar\']/div[2]/ul/li[1]")).click();
        //driver.findElement(By.cssSelector("#sidebar > div.highlightable.ps-container.ps-theme-default.ps-active-y > ul > li.dd-item.visited > a")).click();
        */
		//Salesforce Login
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("ankitaagrawal2393@gmail.com");
        driver.findElement(By.name("pw")).sendKeys("ankitaagrawal2393@gmail.com");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        driver.findElement(By.cssSelector("#error")).getText();
	}

}
