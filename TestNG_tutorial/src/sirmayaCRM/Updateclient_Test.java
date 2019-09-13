package sirmayaCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import sirmayaCRM_ObjectsRepo.ClientEditPage_Repo;
import sirmayaCRM_ObjectsRepo.ClientsListingPage_Repo;
import sirmayaCRM_ObjectsRepo.add_clientpage_Repo;
import statmetrix.Random_String_Generator;

public class Updateclient_Test {
	
	

		public WebDriver driver;
		public ClientsListingPage_Repo Clientlisting_obj;
		public ClientEditPage_Repo Editclientpage_obj;
		public add_clientpage_Repo addclientpage_obj;

		public Updateclient_Test(WebDriver driver) throws InterruptedException {
			super();
			this.driver = driver;
			this.Clientlisting_obj = new  ClientsListingPage_Repo(driver);
			this.Editclientpage_obj = new  ClientEditPage_Repo(driver);
			this.addclientpage_obj = new  add_clientpage_Repo(driver);
		
			Thread.sleep(3000);
			
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy('0','200')");
		   
			
			
		List<WebElement> list = (List<WebElement>) Clientlisting_obj.Edit_client_action_button();
		int size=list.size();
			
			for(int i=0;i<size;i++){
				
				
				if(i==0){
					
					
					list.get(i).click();
					break;
				}
				
			}
			
			//driver.findElement(By.xpath("//a[@title='Edit Client']")).click();
		
		
			//Editclientpage_obj.editclient_pencilbutton().click();
			
		}
			
	


		
	public void updateclient_cellnumber_repetitioncheck() throws InterruptedException {
		

	    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
		
	    
		String addedcell=driver.findElement(By.xpath("//li[@class='list-group-item pb-4']")).getText();
		 
		addclientpage_obj.cell_typefield().sendKeys(addedcell);
		
		Thread.sleep(3000);
		
		Editclientpage_obj.addcell_plus_icon_button().click(); 
		    
		 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible mt-3']")).getAttribute("class").contains("alert-danger"));
		
		 
		System.out.println("Test case passed! We can not add same cell number multiple times.");

		    
			}	
		


	public void updateclient_cellnumber_and_phonenumber_repetitioncheck() throws InterruptedException {
		
		
	    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
		
	    
		String addedcell=driver.findElement(By.xpath("//li[@class='list-group-item pb-4']")).getText();
		Thread.sleep(3000); 
		addclientpage_obj.phone_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,addedcell);
		
		
		
		
		Editclientpage_obj.updateclient_button().click();
	    Thread.sleep(3000);    
		 Assert.assertTrue(driver.findElement(By.xpath("//label[@id='phone-error']")).getAttribute("class").contains("error"));
		
		 
		System.out.println("Test case passed! We can not add same cell number and phone number.");

		addclientpage_obj.phone_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);   
			}



	public void updateclient_cellnumber_onupdate_repetitioncheck() throws InterruptedException {
		
		
	    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
		
	    
		String addedcell=driver.findElement(By.xpath("//li[@class='list-group-item pb-4']")).getText();
		
		
		Thread.sleep(3000);
		addclientpage_obj.edit_cell_button().click();
		
		addclientpage_obj.editcell_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),addedcell);
		
		addclientpage_obj.updatecell_button().click();
		
		addclientpage_obj.cancel_cellupdate_button().click();
		
	    Thread.sleep(3000);    
		 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible mt-3']")).getAttribute("class").contains("alert-danger"));
		
		 
	
			}	
	public void updateclient_cell_withpressing_plusicon() throws InterruptedException {
		Random_String_Generator r =new Random_String_Generator();

		
		
   
		addclientpage_obj.name_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,r.random_String());
	
	
		
		addclientpage_obj.cell_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),"030"+r.random_number()+r.random_number()+r.random_number());

		
		Editclientpage_obj.addcell_plus_icon_button().click();
		
		Thread.sleep(2000);
		
		Editclientpage_obj.updateclient_button().click();
		
		
	}
	
	
}
