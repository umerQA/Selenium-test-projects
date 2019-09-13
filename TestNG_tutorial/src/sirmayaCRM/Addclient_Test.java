package sirmayaCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import sirmayaCRM_ObjectsRepo.Loginpage_Repo;
import sirmayaCRM_ObjectsRepo.add_clientpage_Repo;
import statmetrix.Random_String_Generator;

public class Addclient_Test{

	public WebDriver driver;
	public add_clientpage_Repo add_clientpage_Repo;

	public Addclient_Test(WebDriver driver) {
		super();
		this.driver = driver;
		this.add_clientpage_Repo = new  add_clientpage_Repo(driver);
	}
	
	

	

	public void emptydetails_check() throws InterruptedException {
	
	
	add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
    
    //obj.clients_sidemenutab().click();
	obj.addclient_button().click();
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	
	obj.savebutton().click();
	
	
	String name_error=driver.findElement(By.id("name-error")).getText();
	Assert.assertEquals(name_error, "This field is required.");
	
	String email_error=driver.findElement(By.id("email-error")).getText();
	Assert.assertEquals(email_error, "This field is required.");
	
	String type_error=driver.findElement(By.id("type-error")).getText();
	Assert.assertEquals(type_error, "This field is required.");
	
//	String client_phone_error=driver.findElement(By.id("client-phone-error")).getText();
//	Assert.assertEquals(client_phone_error, "This field is required.");
	
	
	System.out.println("Test case passesed! can not add client without details");
	
	
	
	}

	
	public void addclient_cell_withlessthan_10chars_check() throws InterruptedException {
		
		
		add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
	    Random_String_GeneratorTest r= new Random_String_GeneratorTest();

	    
	    obj.name_typefield().sendKeys(r.random_String());
	    obj.email_typefield().sendKeys(r.random_String()+"@xyz.com");
	    obj.address_typefield().sendKeys(r.random_String());
	    
	    obj.city_typefield().sendKeys(r.random_String());
	    obj.state_typefield().sendKeys(r.random_String());
	    obj.zipcode_typefield().sendKeys(r.random_number());

	   
	    
	    Select s=new Select(obj.country_dropdownfield()); 
	    s.selectByIndex(15);
	    
	    
	    obj.fax_typefield().sendKeys(r.random_number());
	    
	    Select s1=new Select(obj.type_dropdownfield()); 
	    s1.selectByIndex(3);
	    
	    Select s2=new Select(obj.rating_dropdownfield()); 
	    s2.selectByIndex(3);
	    
	    Select s3=new Select(obj.interests_dropdownfield()); 
	    s3.selectByIndex(2);
	    
	    Thread.sleep(2000);
	    obj.phone_typefield().sendKeys("0423"+r.random_number()+r.random_number()+r.random_number());
	    
	    obj.cell_typefield().sendKeys(r.random_number()+r.random_number());
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	    
		obj.savebutton().click();
	    
	    JavascriptExecutor js1=(JavascriptExecutor) driver;
	  		js1.executeScript("window.scrollBy(0,-100)");
	    Thread.sleep(3000);
	    String actual=driver.findElement(By.id("client-phone-error")).getText();
	    
	    Assert.assertEquals(actual, "Please enter at least 11 characters.");
	    
	    System.out.println("Test case passed! To check cell number should not be less than 11 characters.");

	    
		}
	
public void addclient_with_emptycell() throws InterruptedException {
		
	add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	    
	    //obj.phone_typefield().sendKeys(r.random_number());
	    obj.cell_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	  		js.executeScript("window.scrollBy(0,100)");
	  	
	  		
	  	    Thread.sleep(3000);	
	    obj.savebutton().click();
		
	    JavascriptExecutor js1=(JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,-100)");
	
	    
	    
	    Thread.sleep(3000);
	    String actual=driver.findElement(By.id("phones-error")).getText();
	    
	    Assert.assertEquals(actual, "The phones field is required.");
	    
	    System.out.println("Test case passed! To check cell number can not be empty.");

	    
		}
	
	
public void addclient_cell_withpressing_plusicon() throws InterruptedException {
	
	add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	    
    obj.cell_typefield().sendKeys("030"+r.random_number()+r.random_number()+r.random_number());
	    obj.addcell_plus_icon_button().click(); 
	    
	    System.out.println("Test case passed! To check cell number enter upon pressing the plus icon.");

	    
		}


	
public void addclient_cellnumber_repetitioncheck() throws InterruptedException {
	
	add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
    
	String addedcell=driver.findElement(By.xpath("//a[@class='phone-text']")).getText();
	 
	obj.cell_typefield().sendKeys(addedcell);
	
	obj.addcell_plus_icon_button().click(); 
	    
	 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible mt-3']")).getAttribute("class").contains("alert-danger"));
	
	 
	System.out.println("Test case passed! We can not add same cell number multiple times.");

	    
		}	
	


public void addclient_cellnumber_and_phonenumber_repetitioncheck() throws InterruptedException {
	
	add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
    
	String addedcell=driver.findElement(By.xpath("//a[@class='phone-text']")).getText();
	Thread.sleep(3000); 
	obj.phone_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,addedcell);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	
	
    obj.savebutton().click();
    Thread.sleep(3000);    
	 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible mt-3']")).getAttribute("class").contains("alert-danger"));
	
	 
	System.out.println("Test case passed! We can not add same cell number and phone number.");

	    
		}



public void addclient_cellnumber_update_repetitioncheck() throws InterruptedException {
	
	add_clientpage_Repo obj=new add_clientpage_Repo(driver);	
    Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
    
	String addedcell=driver.findElement(By.xpath("//a[@class='phone-text']")).getText();
	Thread.sleep(3000); 
	obj.phone_typefield().sendKeys(Keys.chord(Keys.BACK_SPACE,Keys.NUMPAD1));
	
	obj.addcell_plus_icon_button().click();
	
	Thread.sleep(3000);
	obj.edit_cell_button().click();
	
	obj.editcell_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),addedcell);
	
	obj.updatecell_button().click();
	
	
	
    Thread.sleep(3000);    
	 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible mt-3']")).getAttribute("class").contains("alert-danger"));
	
	 
	System.out.println("Test case passed! We can not update the number which already exists.");

	obj.editcell_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,addedcell+"5");
	
	obj.updatecell_button().click();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	obj.savebutton().click();
		}





}
