package sirmayaCRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sirmayaCRM_ObjectsRepo.ClientsListingPage_Repo;
import sirmayaCRM_ObjectsRepo.Loginpage_Repo;
import sirmayaCRM_ObjectsRepo.add_clientpage_Repo;
import statmetrix.Random_String_Generator;

public class Main_Test extends Base_invocationTest{

	public static WebDriver driver;
	

	
	Random_String_Generator r = new Random_String_Generator();

	@BeforeClass
	public void Initialsetup() {
		setup();
		driver = new ChromeDriver();
		
	}
	

	
	public static void timeout() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	@Test(priority = 1)
	@Parameters({ "URL" })
	public void opensite(String s1) throws InterruptedException {

		driver.get(s1);
	timeout();
	driver.manage().window().maximize();	
	
	}
	
	@Test(priority = 2)
	public void invalidcredentials() throws InterruptedException {
	
	
	Loginpage_Repo obj1=new Loginpage_Repo(driver);	
      timeout();
		
    obj1.email().sendKeys("admin@wast.com");
	obj1.password().sendKeys("aslsa");
	obj1.loginbutton().click();

	WebElement actual=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));

//Will check if error msg comes
	Assert.assertEquals(actual, driver.findElement(By.xpath("//div[@class='alert alert-danger']")));
	
	}
	
	
	@Test(priority = 3)
	public void validcredentials() throws InterruptedException {
		Loginpage_Repo obj1=new Loginpage_Repo(driver);	
		timeout();
		
		//first clear the fields then put the valid credentials
    obj1.email().clear();
    obj1.email().sendKeys("admin@admin.com");
	
    obj1.password().clear();
    obj1.password().sendKeys("secret");
	
	
	obj1.loginbutton().click();
	
	}
	
	
	@Test(priority=4)
	
	public static void Searchingclient() throws InterruptedException {
		
		SearchingClient_Test obj = new SearchingClient_Test(driver);
		
	  obj.single_invalidsearching();
	  obj.all_invalidsearching();
	  
	  
	  obj.single_validsearching();
	  obj.all_validsearching();
	    
//	  Clientadvance_search_Test ac = new Clientadvance_search_Test(driver);
		
//	    ac.singleinvalid_client_adv_search();    
		
		
		
	}
	

@Test(priority = 5)

public static void clientadding_checks() throws InterruptedException {
	
	Addclient_Test ac = new Addclient_Test(driver);
	
    
	ac.emptydetails_check();
    
	ac.addclient_cell_withlessthan_10chars_check();
	
	ac.addclient_with_emptycell();
	
	ac.addclient_cell_withpressing_plusicon();
	
	ac.addclient_cellnumber_repetitioncheck();
	
	ac.addclient_cellnumber_and_phonenumber_repetitioncheck();
	
	ac.addclient_cellnumber_update_repetitioncheck();
	
	
	
}	


@Test(priority = 6)

public static void addleads_checks() throws InterruptedException {
	
	Addlead_Test ac = new Addlead_Test(driver,"regression");
	
    ac.addlead_emptydetail_check();
	ac.addlead_negativevalue_validation_checks();
	ac.addlead_maxvalue_validation_checks();
	ac.addlead_check();
	
}


@Test(priority = 7)

public static void updateclient_checks() throws InterruptedException {
	
	Updateclient_Test ac = new Updateclient_Test(driver);
	
    ac.updateclient_cellnumber_repetitioncheck();
    ac.updateclient_cellnumber_and_phonenumber_repetitioncheck();
    
    ac.updateclient_cellnumber_onupdate_repetitioncheck();
    ac.updateclient_cell_withpressing_plusicon();

}

@Test(priority = 8)

public static void addleads_fromsidemenu_button_checks() throws InterruptedException {
	
	Addnewlead_listingpage_Test ac = new Addnewlead_listingpage_Test(driver);
   Addlead_Test t=new Addlead_Test(driver,"regression");
    
   
   ac.addnewlead_fromclientslisting();
   t.addlead_negativevalue_validation_checks();
   t.addlead_maxvalue_validation_checks();
   t.addlead_check();
   ac.viewclient_detail();
   
}


}
