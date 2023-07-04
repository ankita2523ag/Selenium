package SeleniumDeepDive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathCSS{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		/* xpath syntax: 
		 * 1:::	//tagName[@attribute='value']
		 * 2:::	//*[@attribute='value']
		 * 
		 * Examples
		 * //input[@value='Log In']
		 * //*[@type='email']
		 * 
		 * Regular Expression in Xpath syntax: //tagName[contains(@attribute, 'value')]
	     * //input[contains(@name,'username')]
	     * 
	     */
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ankita");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("ankita");
		/* CSS syntax: 
		 * 1:::	tagName[attribute='value']
		 * 2:::	[attribute='value']
		 * 3::: tagName#id
		 * 4::: tagName.className
		 * 
		 * Examples
		 * 
		 * input[value='Login']
		 * [type='email']
		 * input#username
		 * input.inputtext
		 * 
		 * Regular Expression in CSS syntax: tagName[Attribute*= 'value')]
		 * 
		 */
	    driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ag");
	    driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("ag");
	    
	    /*When there is no unique attribute to identify an element, user parent - child relationship using tags
	     * 
	     * 
	     */
	    driver.get("http://www.qaclickacademy.com/interview.php");
	    driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
	    driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click(); 
	    System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	    //

	    /*
	    String varaint_Xpath="//div[contains(@dataid,'variantId_')]//button[contains(@class,'spectrum-ActionButton')]"; // 3
		String variant_expanded="//div[contains(@id,'_middle')]//span[contains(text(),'563637521')]"; // var_id
		String add_Action_Last_Btn="(//span[@dataid='add_block_button'])[last()]//button"; // [1] for first button
		String verify_new_actionBlock_Added="//div[contains(@dataid,'_action_') and not(contains(@dataid,'_button'))]"; //check count
		String Last_AB_Menu_Btn="(//div[contains(@dataid,'_action_') and not(contains(@dataid,'_button'))])[last()]//button";
		
		String new_AB_Menu_Edit_Option="//div[@role='presentation']//ul[@role='menu']//li[@role='menuitem']//span[contains(text(),'Edit')]";
		String new_AB_Menu_Duplicate_Option="//div[@role='presentation']//ul[@role='menu']//li[@role='menuitem']//span[contains(text(),'Duplicate')]";
		String new_AB_Menu_Delete_Option="//div[@role='presentation']//ul[@role='menu']//li[@role='menuitem']//span[contains(text(),'Delete')]";
		
		String sidebar_AddActionButton="//div[@id='actionType']//span[text()='Add action']/parent::button[1]";
		String sidebar_waitBlock_wait_TB="//div[@id='actionType']//label[text()='Wait For']/following::input";
		
		String CampaignLoadingLoader="//div[@id='loader' and not(@class='loader--hide')]";
		
		String sidePanelSelectAppsToIncludeDD="(//div[@role='region' and @class='spectrum-Well'])[last()]//label[text()='Apps to include']//following-sibling::div[contains(@class,'spectrum-Dropdown')]/button";
		String sidePanelSelectSurfaceVersionDD="(//div[@role='region' and @class='spectrum-Well'])[last()]//label[text()='Surface Version']//following-sibling::div[contains(@class,'spectrum-Dropdown')]/button";
		
		*/
		
	}

}
