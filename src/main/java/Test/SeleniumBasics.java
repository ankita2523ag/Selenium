package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Create Driver Object
		String chromedriverpath ="/Users/ankiagra/IdeaProjects/dependencies/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
		System.out.println("Title = "+ driver.getTitle());
		System.out.println("Title = "+ driver.getCurrentUrl());
		System.out.println("Title = "+ driver.getPageSource());
		driver.get("http://www.oracle.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.selenium.dev/documentation/en/getting_started/");
		//driver.close();//close the last opened tab by selenium
		//driver.quit();//close all tabs opened by selenium
	}

}
