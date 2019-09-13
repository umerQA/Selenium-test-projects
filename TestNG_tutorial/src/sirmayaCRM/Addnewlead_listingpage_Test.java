package sirmayaCRM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import sirmayaCRM_ObjectsRepo.add_leads_Listingpage_repo;

public class Addnewlead_listingpage_Test {

WebDriver driver;

add_leads_Listingpage_repo obj;


public Addnewlead_listingpage_Test(WebDriver driver) throws InterruptedException{
	
	
	this.driver=driver;
	this.obj=new add_leads_Listingpage_repo(driver);
	
	Thread.sleep(3000);
	obj.lead_sidemenu_button().click();
	Thread.sleep(3000);
	obj.addnewlead_sidemenu_button().click();
	
	
}

public void addnewlead_fromclientslisting() throws InterruptedException{
	

	
		
		

	JavascriptExecutor js=JavascriptExecutor(driver);
	js.executeScript("window.scrollBy('0','500')");
	
	Thread.sleep(3000);
	int count=obj.addlead_plusicon().size();
	
	for(int i=0;i<count;i++){
		
		
		if(i==1){
			
			
			obj.addlead_plusicon().get(i).click();
			break;
		}
		
		
		
	}
	
}




private JavascriptExecutor JavascriptExecutor(WebDriver driver2) {
	// TODO Auto-generated method stub
	return null;
}

public void viewclient_detail() throws InterruptedException{
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy('0','300')");
	
	int count=obj.clients_names().size();
	
	for(int i=0;i<count;i++){
		
		
		if(i==1){
			
		String name1=obj.clients_names().get(i).getText();
		
		Thread.sleep(3000);
			obj.clients_names().get(i).click();
			Thread.sleep(3000);	
		String name2=	driver.findElement(By.xpath("//*[@id='client-edit-task-form']/div[3]/div/div[2]/div[1]")).getText();
			
if(name1.equalsIgnoreCase(name2)){
	
	Assert.assertTrue(true);
	
	
}
			obj.crossicon().click();
			
		}	
		
		
		}
		
	}
	
	
	
	
	
	
}








