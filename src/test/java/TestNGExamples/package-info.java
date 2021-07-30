/**
 * 
 */
/**
 * @author ankiagra
 *
 */
package TestNGExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*

Test NG uses : run finite no of test cases and control them by grouping

Test NG download : download jar from testng.org (testng-6.7.jar)

Test NG Creation and Execution:
	create a java file and write test case with annotations
	run as TestNGTest
	
Test NG Test Case Results:
	When a Test case is run using TestNgTest an output project is automatically created. (test-output)

Test NG XML File:
	xml file is used to execute a fixed no of test cases from a package 
	- can run all test cases from different packages by giving test file names
	- can include/exclude particular test cases
	- can use regex for test case names
	
Test NG Annotations:
	@Test
	@BeforeSuite	@AfterSuite
	@BeforeTest		@AfterTest
	@BeforeClass	@AfterClass
	@BeforeMethod	@AfterMethod
	
Test NG	Groups:
	@Test(groups= {"Smoke"})
	define <groups> <run> in testng.xml

Test NG Helper Attributes:
	@Test(dependsOnMethods={"login","loguser"})
	@Test(enabled=false}
	@Test(timeOut=4000)
	
Test NG DataProviderAnnotation1:
	@Parameters({"URL","APIKey"})
	Define this parameter in XML file
		 <parameter name="URL" value="test.com"/>
	  	<parameter name="APIKey" value="123456asdf"/>
	 can define parameter at Test Suite level or Test File level
	
Test NG DataProviderAnnotation2:
	@Test(dataProvider = "getData")
	public void getUser(String username, String password)
	{
	}
	//rows define no of data sets
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		return data
	}
	
	
	
*/