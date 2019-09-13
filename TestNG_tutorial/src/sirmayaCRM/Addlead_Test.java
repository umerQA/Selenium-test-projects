package sirmayaCRM;


import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import sirmayaCRM_ObjectsRepo.add_leadspage_Repo;

public class Addlead_Test {



public WebDriver driver;

public add_leadspage_Repo obj;

public String rule;


Addlead_Test(WebDriver driver,String rule){
	
	this.driver=driver;
	this.obj= new add_leadspage_Repo(driver);
	this.rule=rule;
}



public void addlead_emptydetail_check() throws InterruptedException{
	

	
	
	if(rule.equalsIgnoreCase("smoke")){
		
		obj.leads_sidemenutab().click();
		obj.addlead_sidemenulink().click();
		
	}
	
	else if(rule.equalsIgnoreCase("regression")){
		
		Thread.sleep(3000);		
		
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy('0','1000')");
		
		Thread.sleep(3000);
		obj.Save_button().click();
		
		
		Thread.sleep(3000);
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy('0','-700')");
		
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//label[@id='projects-error']")).getText(), "This field is required.");
	
	
	}
	
	
}



public void addlead_negativevalue_validation_checks() throws InterruptedException{
	
	Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
	
	if(rule.equalsIgnoreCase("smoke")){
		
		obj.leads_sidemenutab().click();
		obj.addlead_sidemenulink().click();
		
	}
	
	else if(rule.equalsIgnoreCase("regression")){
		
		 JavascriptExecutor js1=(JavascriptExecutor) driver;
	 		js1.executeScript("window.scrollBy('0','300')");
	 		
	 		Thread.sleep(3000);
	 		
		Select s=new Select(obj.Project_dropdown());
		s.selectByIndex(1);
		
		obj.Budget_typefield().sendKeys("-"+r.random_number());
		
 
		obj.Beds_typefield().sendKeys("-"+r.random_number());
	

        obj.area_typefield().sendKeys("-"+r.random_number());

        
      

         
         
       
 		
 		
         Select s9=new Select(obj.tasktype_dropdown());
         s9.selectByIndex(1);
         
         Thread.sleep(3000);
         
         Select s10=new Select(obj.task_subtype_dropdown());
         s10.selectByIndex(1);
  
     	Thread.sleep(2000);
        Select s11=new Select(obj.task_status_dropdown());
        s11.selectByIndex(1);
        
         JavascriptExecutor js2=(JavascriptExecutor) driver;
 		js1.executeScript("window.scrollBy('0','300')");
 		
 		
 		
         
         
         
         
       
        	 Thread.sleep(4000);
        	 obj.task_completed_date_calender().click();
        	 Thread.sleep(4000);
        	 driver.findElement(By.xpath("//td[@class='today active day']")).click();
        	 
         
        	 
         
        	 JavascriptExecutor js3=(JavascriptExecutor) driver;
      		js3.executeScript("window.scrollBy('0','500')");
      		
         obj.Save_button().click();
         
         
         Thread.sleep(3000);
         obj.Failedpopup().click();
        
         Thread.sleep(3000);
         
         JavascriptExecutor js4=(JavascriptExecutor) driver;
   		js4.executeScript("window.scrollBy('0','-150')");
   	 
   		Thread.sleep(2000); 
   		Assert.assertEquals(driver.findElement(By.xpath("//label[@id='location']")).getText(), "The location field is required.");
        
   		Thread.sleep(2000);
         Select s12=new Select(obj.task_location());
         s12.selectByIndex(1);
         
         Assert.assertEquals(driver.findElement(By.id("attachment")).getText(), "The attachment field is required.");  
         Thread.sleep(2000);
         
         
         WebElement e1=obj.task_attachment();
         e1.sendKeys("C:/Users/hamza/Desktop/property.jpg");
         
         
         Thread.sleep(3000);
         
        JavascriptExecutor js5=(JavascriptExecutor) driver;
  		js5.executeScript("window.scrollBy('0','-500')");
  		
  		
         Assert.assertEquals(obj.Negativevalue_budgeterror().getText(),"Enter a positive number.");
 		Assert.assertEquals(obj.Negativevalue_bedserror().getText(),"Enter a positive number.");  
         Assert.assertEquals(obj.Negativevalue_areaerror().getText(),"Enter a positive number.");     
         
         
}
	}



public void addlead_maxvalue_validation_checks() throws InterruptedException{
	
	Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
	
	if(rule.equalsIgnoreCase("smoke")){
		
		obj.leads_sidemenutab().click();
		obj.addlead_sidemenulink().click();
		
	}
	
	else if(rule.equalsIgnoreCase("regression")){
		
		 JavascriptExecutor js1=(JavascriptExecutor) driver;
	 		js1.executeScript("window.scrollBy('0','300')");
	 		
	 		Thread.sleep(3000);
	 		
		Select s=new Select(obj.Project_dropdown());
		s.selectByIndex(1);
		
		obj.Budget_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,"956214621154612412541");
		
 
		obj.Beds_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,"9562146211");
	

        obj.area_typefield().sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,"956214621154612412541");

        
      
        JavascriptExecutor js4=(JavascriptExecutor) driver;
  		js4.executeScript("window.scrollBy('0','1000')");
         
         obj.Save_button().click();
         Thread.sleep(3000);
         
         JavascriptExecutor js5=(JavascriptExecutor) driver;
   		js5.executeScript("window.scrollBy('0','-700')");
         
   		Thread.sleep(3000);
   		
   		Assert.assertEquals(obj.Maxvalue_budgeterror().getText(),"Please enter a number less than and equal to 999999999999999.");
   		Assert.assertEquals(obj.Maxvalue_bedserror().getText(),"Please enter a number less than and equal to 9999.");  
   		Assert.assertEquals(obj.Maxvalue_areaerror().getText(),"Please enter a number less than and equal to 999999999999999.");     
 		
        System.out.println("Test cases passed! The max value validation messages appeared.");
  		
  		
         
         
}
	}




public void addlead_check() throws InterruptedException{
	
	Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
	
	if(rule.equalsIgnoreCase("smoke")){
		
		obj.leads_sidemenutab().click();
		obj.addlead_sidemenulink().click();
		
	}
	
	else if(rule.equalsIgnoreCase("regression")){
		
driver.navigate().refresh();

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		


       Select s=new Select(obj.Project_dropdown());
		s.selectByIndex(1);
		
		obj.Budget_typefield().sendKeys(r.random_number());
		
		
		Select s1=new Select(obj.Budgetcurrency_dropdown());
		s1.selectByIndex(1);
		
		Select s2=new Select(obj.Source_dropdown());
		s2.selectByIndex(1);
		
 
		obj.Beds_typefield().sendKeys(r.random_number());


		Select s3=new Select(obj.status_dropdown());
		s3.selectByIndex(1);
		
		Select s4=new Select(obj.purpose_dropdown());
		s4.selectByIndex(1);
		
		
		Select s5=new Select(obj.leadtype_dropdown());
		s5.selectByIndex(2);
		Thread.sleep(5000);
		
		
		Select s6=new Select(obj.leadsubtype_dropdown());
		s6.selectByIndex(1);
		
		Select s7=new Select(obj.paymentmode_dropdown());
		s7.selectByIndex(1);
		
		obj.message_typefield().sendKeys(r.random_String()+r.random_number()+r.random_String());

        obj.area_typefield().sendKeys(r.random_number());


         Select s8=new Select(obj.areatype_dropdown());
         s8.selectByIndex(1);
         
         obj.note_typefield().sendKeys(r.random_String());
         
         
         

         Select s9=new Select(obj.tasktype_dropdown());
         s9.selectByIndex(1);
         
         Thread.sleep(3000);
         
         Select s10=new Select(obj.task_subtype_dropdown());
         s10.selectByIndex(1);
         
         Select s11=new Select(obj.task_status_dropdown());
         s11.selectByIndex(1);
         
         JavascriptExecutor js1=(JavascriptExecutor) driver;
 		js1.executeScript("window.scrollBy('0','300')");
 		
 		
 		Thread.sleep(2000);
         Select s12=new Select(obj.task_location());
         s12.selectByIndex(1);
         
         
         
         
       
        	 Thread.sleep(3000);
        	 //obj.task_completed_date_calender().click();
        	 Thread.sleep(3000);
        	 //driver.findElement(By.xpath("//td[@class='today active day']")).click();
        	 
        	 
        	 WebElement e1=obj.task_attachment();
             e1.sendKeys("C:/Users/hamza/Desktop/property.jpg");
        	 
         Thread.sleep(3000);
        	 JavascriptExecutor js2=(JavascriptExecutor) driver;
     		js2.executeScript("window.scrollBy('0','300')");
         
         obj.Task_comment().sendKeys(r.random_String());
         
         
         Select s13=new Select(obj.followup_task_type_dropdown());
         s13.selectByIndex(1);

         
 
	 Thread.sleep(4000);
        	 obj.followup_deadline_calender().click();
        	 Thread.sleep(4000);
        	 driver.findElement(By.xpath("//td[@class='today day']")).click();
       
         obj.Save_button().click();
         
         
         
}
	}



public void deletelead_check() throws InterruptedException{
	
	Random_String_GeneratorTest r= new Random_String_GeneratorTest();
	
	
	if(rule.equalsIgnoreCase("smoke")){
		
		obj.leads_sidemenutab().click();
		obj.addlead_sidemenulink().click();
		
	}
	
	else if(rule.equalsIgnoreCase("regression")){
		
driver.navigate().refresh();

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


}




}}


