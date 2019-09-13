package sirmayaCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import sirmayaCRM_ObjectsRepo.ClientsListingPage_Repo;
import sirmayaCRM_ObjectsRepo.add_clientpage_Repo;
import statmetrix.Random_String_Generator;

public class SearchingClient_Test {

	
	
	public static WebDriver driver;
	public ClientsListingPage_Repo ClientsListingPage_Repo;

	public SearchingClient_Test(WebDriver driver) {
		super();
		this.driver = driver;
		this.ClientsListingPage_Repo = new  ClientsListingPage_Repo(driver);
	

	}
	
	
	public  void single_invalidsearching() throws InterruptedException {
		
		Random_String_Generator r =new Random_String_Generator();
		ClientsListingPage_Repo obj =new ClientsListingPage_Repo(driver);
		
		obj.clients_sidemenutab().click();
	
	 Thread.sleep(2000);   
	obj.search_clients().click();

		  //Searching through id only
		   
		obj.id_searchfield().sendKeys(r.random_number()+"1");

		  
		obj.searchbutton().click();

		String actualid=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
		    Assert.assertEquals(actualid, "Result not found!");
		    
		    obj.id_searchfield().clear();
	
		    obj.searchbutton().click();

		  //Searching through name only
		    obj.name_searchfield().sendKeys(r.random_String());
		
		    obj.searchbutton().click();
	
		String actualname=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
		    Assert.assertEquals(actualname, "Result not found!");
		    obj.name_searchfield().clear();
		
		    obj.searchbutton().click();

		    
		    
		    //Searching through email only
		    obj.email_searchfield().sendKeys(r.random_String()+"@xyz.com");
	
		    obj.searchbutton().click();
		    

		String actualemail=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
		    Assert.assertEquals(actualemail, "Result not found!");
		    obj.email_searchfield().clear();

		    obj.searchbutton().click();

		  
		    

		    //Searching through cell only
		    
		    obj.cell_searchfield().sendKeys(r.random_number()+r.random_number()+r.random_number());

		   
		    obj.searchbutton().click();

		String actualphone=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
		    Assert.assertEquals(actualphone, "Result not found!");
		    obj.cell_searchfield().clear();

		   
		    obj.searchbutton().click();

		       
			}	
			
			


		public  void all_invalidsearching() throws InterruptedException {
				
		Random_String_Generator r =new Random_String_Generator();
		ClientsListingPage_Repo obj =new ClientsListingPage_Repo(driver);
		
		
			  //entering id
		obj.id_searchfield().sendKeys(r.random_number());
		
			  //entering name
		obj.name_searchfield().sendKeys(r.random_String());	   
		
			  //entering email
		obj.email_searchfield().sendKeys(r.random_String()+"@xyz.com");	  
		
			    //entering phone
		obj.cell_searchfield().sendKeys(r.random_number()+r.random_number()+r.random_number());	
			
		obj.searchbutton().click();
		      
			    
			    String actualphone=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
			    Assert.assertEquals(actualphone, "Result not found!");
		
		obj.clearbutton().click();       
			  


		}	



		public void single_validsearching() throws InterruptedException {
			
			
		Random_String_Generator r =new Random_String_Generator();
		ClientsListingPage_Repo obj =new ClientsListingPage_Repo(driver);    
		
			  //Searching through id only
			
			
		
		int idcount=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).size();
			
			for(int i=0;i<idcount;i++){
				
				if(i==1){
					
					String id=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).get(i).getText();
					
					obj.id_searchfield().sendKeys(id);
					//driver.findElement(By.id("id")).sendKeys(id);
				   obj.searchbutton().click();
				    
				    JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("window.scrollBy(0,1000)");
				    //result condition
				    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
				    
				    Thread.sleep(3000);
				 obj.clearbutton().click();
					

				    break;
					
				}
				
				
			}		
				
			
			
			
			int namecount=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[2]")).size();
			
			for(int i=0;i<namecount;i++){
				
				if(i==1){
					
					String name=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[2]")).get(i).getText();
					obj.name_searchfield().sendKeys(name);
				    obj.searchbutton().click();
				    
				    JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("window.scrollBy(0,1000)");
				    //result condition
				    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
				    
				    Thread.sleep(3000);
				    obj.clearbutton().click();
				  
					

				    break;
					
				}
				
				
			}
			
			int emailcount=driver.findElements(By.xpath("//a[@id='navbarDropdown']")).size();
			
			for(int i=0;i<emailcount;i++){
				
				if(i==1){
				
					
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					    js.executeScript("window.scrollBy(0,500)");
					    Thread.sleep(3000);
					driver.findElements(By.xpath("//a[@id='navbarDropdown']")).get(i).click();
					
			
				String email=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[1]")).getText();
					
				System.out.println(email);	
					
					obj.email_searchfield().sendKeys(email);
				  obj.searchbutton().click();
				    
				    JavascriptExecutor js1 = (JavascriptExecutor) driver;
				    js1.executeScript("window.scrollBy(0,1000)");
				    //result condition
				    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
				    
				    Thread.sleep(3000);
				    obj.clearbutton().click();
		
					

				    break;
					
				}
				
				
			}
			
					
			
			
			
		int phonecount=driver.findElements(By.xpath("//a[@id='navbarDropdown']")).size();
			
			for(int i=0;i<emailcount;i++){
				
				if(i==2){
				
					JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("window.scrollBy(0,500)");
				    Thread.sleep(3000);
					driver.findElements(By.xpath("//a[@id='navbarDropdown']")).get(i).click();
					
					Thread.sleep(3000);	
				String phone=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[2]")).getText();
					
				System.out.println(phone);	
				
				if(phone.isEmpty()){
					String phone1=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[3]")).getText();
					obj.cell_searchfield().sendKeys(phone1);
				}
				    
				else{
					obj.cell_searchfield().sendKeys(phone);
				}
				
				
				obj.searchbutton().click();
				    
				    JavascriptExecutor js3 = (JavascriptExecutor) driver;
				    js3.executeScript("window.scrollBy(0,500)");
				    Thread.sleep(3000);
				    //result condition
				    Assert.assertTrue((driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText().contains("Clients")));
				    
				    Thread.sleep(3000);
				    obj.clearbutton().click();
				  
				    break;
					
				}
				
				
			}	
			
		}


	

		public void all_validsearching() throws InterruptedException {
			
		ClientsListingPage_Repo obj =new ClientsListingPage_Repo(driver); 	
		Random_String_Generator r =new Random_String_Generator();
		  
			  //Searching through id only
			
			int idcount=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).size();
			
			for(int i=0;i<idcount;i++){
				
				if(i==2){
					
					String id=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).get(i).getText();
					obj.id_searchfield().sendKeys(id);
					
					String name=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[2]")).get(i).getText();
					obj.name_searchfield().sendKeys(name);
					
				
					JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("window.scrollBy(0,500)");	
					
		        driver.findElements(By.xpath("//a[@id='navbarDropdown']")).get(i).click();
				Thread.sleep(3000);	
				String email=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[1]")).getText();
				
		        System.out.println(email);	
		        
		        obj.email_searchfield().sendKeys(email);
		        
		        String phone=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[2]")).getText();
				System.out.println(phone);	
				
				if(phone.isEmpty()){
					String phone1=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[3]")).getText();
					obj.cell_searchfield().sendKeys(phone1);
				}
				    
				else{
					obj.cell_searchfield().sendKeys(phone);
				}
				
				
				
					
					
				    obj.searchbutton().click();
				    
				    JavascriptExecutor js1 = (JavascriptExecutor) driver;
				    js1.executeScript("window.scrollBy(0,500)");
					
				    Thread.sleep(3000);
obj.clearbutton().click();
				    break;
					
				}
				
				
			}		
				
			
		}
		
	
}
