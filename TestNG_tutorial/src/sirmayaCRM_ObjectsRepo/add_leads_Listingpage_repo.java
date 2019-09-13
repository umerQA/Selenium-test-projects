package sirmayaCRM_ObjectsRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class add_leads_Listingpage_repo {

	

	public WebDriver driver;

		public add_leads_Listingpage_repo(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
			this.driver=driver;
		
		}
		

	By lead_sidemenu_button=By.linkText("Leads");	
		
	By addnewlead_sidemenu_button=By.linkText("Add New Lead");
	
	By crossicon=By.xpath("//button[@class='close p-2 m-0 text-white']");
	
	By addlead_plusicon=By.xpath("//i[@class='fa fa-plus-square']");
	
	By viewclient_detail_eyeicon=By.xpath("//i[@class='fa fa-eye']");
	
	By viewclient_leads_charticon=By.xpath("//i[@class='fa fa-chart-line']");
	
	By addnewclient_button=By.linkText("Add New Client");
	
	By clients_names=By.xpath("//td[@class='col-md-3']/a");
	
	
	
	
	
	
	
public WebElement crossicon(){
		
		return driver.findElement(crossicon);
	}
	
	
	
	
	
	
	
	public WebElement addnewlead_sidemenu_button(){
		
		return driver.findElement(addnewlead_sidemenu_button);
	}
	
	
public WebElement lead_sidemenu_button(){
		
		return driver.findElement(lead_sidemenu_button);
	}
		
	
	public WebElement addnewclient_button(){
		
		return driver.findElement(addnewclient_button);
	}
	
	public List <WebElement> clients_names(){
		
		return driver.findElements(clients_names);
	}
	
	
	public List <WebElement> viewclient_detail_eyeicon(){
		
		return driver.findElements(viewclient_detail_eyeicon);
	}
	
	
	
	public List <WebElement> viewclient_leads_charticon(){
		
		return driver.findElements(viewclient_leads_charticon);
	}
	
	
	
	public List <WebElement> addlead_plusicon(){
		
		return driver.findElements(addlead_plusicon);
	}
	
	
	
	
	
	
	
	
}
