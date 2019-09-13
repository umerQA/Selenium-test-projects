package sirmayaCRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import sirmayaCRM_ObjectsRepo.Clientadvance_searchpage_Repo;

public class Clientadvance_search_Test {


public WebDriver driver;


public Clientadvance_searchpage_Repo obj;

public Random_String_GeneratorTest r;

Clientadvance_search_Test(WebDriver driver){
	
	this.driver=driver;
	
	this.obj=new Clientadvance_searchpage_Repo(driver);
	
	this.r=new Random_String_GeneratorTest();
	
}


public void singleinvalid_client_adv_search() throws InterruptedException{
	
	Thread.sleep(3000);
	
	
	obj.advancesearch_link().click();
	
	obj.citysearch_field().sendKeys(r.random_String()+r.random_String());
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy('0','150')");
	Thread.sleep(3000);
	obj.searchbutton().click();
	
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy('0','150')");
	Thread.sleep(3000);
	obj.clearbutton().click();
	
	obj.advancesearch_link().click();
	
	Select s=new Select(obj.countrysearch_dropdown());
	s.selectByIndex(8);
	

	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("window.scrollBy('0','150')");
	Thread.sleep(3000);
	
	JavascriptExecutor js3=(JavascriptExecutor)driver;
	js3.executeScript("window.scrollBy('0','150')");
	obj.searchbutton().click();
	
	Thread.sleep(3000);
	JavascriptExecutor js4=(JavascriptExecutor)driver;
	js4.executeScript("window.scrollBy('0','150')");
	obj.clearbutton().click();
	
	obj.advancesearch_link().click();
	
	obj.faxsearch_field().sendKeys(r.random_number()+r.random_number());
	JavascriptExecutor js5=(JavascriptExecutor)driver;
	js5.executeScript("window.scrollBy('0','150')");
	Thread.sleep(3000);
	
	JavascriptExecutor js6=(JavascriptExecutor)driver;
	js6.executeScript("window.scrollBy('0','150')");
	obj.searchbutton().click();
	
	
	Thread.sleep(3000);
	JavascriptExecutor js7=(JavascriptExecutor)driver;
	js7.executeScript("window.scrollBy('0','150')");
	obj.clearbutton().click();
	
	
	obj.advancesearch_link().click();
	
	
	Select s1=new Select(obj.ratingsearch_dropdown());
	s1.selectByIndex(3);
	JavascriptExecutor js8=(JavascriptExecutor)driver;
	js8.executeScript("window.scrollBy('0','150')");
	Thread.sleep(3000);
     
	JavascriptExecutor js9=(JavascriptExecutor)driver;
	js9.executeScript("window.scrollBy('0','150')");
	obj.searchbutton().click();
 	Thread.sleep(3000);
     
 	JavascriptExecutor js10=(JavascriptExecutor)driver;
	js10.executeScript("window.scrollBy('0','150')");
 	obj.clearbutton().click();
	
 	obj.advancesearch_link().click(); 
 	
	Select s2=new Select(obj.interestsearch_dropdown());
	s2.selectByIndex(3);
	JavascriptExecutor js11=(JavascriptExecutor)driver;
	js11.executeScript("window.scrollBy('0','150')");
	Thread.sleep(3000);
     obj.searchbutton().click();
 	
     Thread.sleep(3000);
     JavascriptExecutor js12=(JavascriptExecutor)driver;
 	js12.executeScript("window.scrollBy('0','150')");
     obj.clearbutton().click();
	
     obj.advancesearch_link().click();
	
	
}


}
