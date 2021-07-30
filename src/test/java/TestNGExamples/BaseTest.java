package TestNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("***BeforeSuite***");
		//Define extent manager
		//Get build info
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("***AfterSuite***");
		//Delete screenshots
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("***BeforeClass***");
		//Driver creation
		//define server - remote/local/docker
		//Extent report create Parent Test
	}
	 
	@AfterClass
	public void AfterClass() {
		System.out.println("***AfterClass***");
		//Driver quit
	}
	
	@BeforeMethod
	public void ploan2() {
		System.out.println("----BeforeMethod----");
		//Extent report create Child Test, set current test as child
	}
	
	@AfterMethod
	public void ploan3() {
		System.out.println("----AfterMethod----");
		//Extent report - add Screenshot, mark test case as Pass/Fail
	}
	
}


