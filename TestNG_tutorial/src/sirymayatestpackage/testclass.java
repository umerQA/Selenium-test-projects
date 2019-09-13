package sirymayatestpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import statmetrix.Random_String_Generator;

public class testclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Random_String_Generator r = new Random_String_Generator();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("http://crm.sirmaya.com/login");

		driver.manage().window().maximize();
		    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("admin@admin.com");
			
		  
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret");
			
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();


	
	
			 driver.findElement(By.xpath("//*[@id='app']/div/div/nav/ul/li[3]/a")).click();;
			    driver.findElement(By.linkText("All Clients")).click();
	
	
	
			    //single_invalidsearching(driver, r );
			    //all_invalidsearching(driver, r );
			    //single_validsearching(driver, r );
			    all_validsearching(driver, r );
	
	
	
	
	}

	
	
public static void single_invalidsearching(WebDriver driver, Random_String_Generator r ) throws InterruptedException {
		
		
  
  //Searching through id only
    driver.findElement(By.id("id")).sendKeys(r.random_number());
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
String actualid=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
    Assert.assertEquals(actualid, "Result not found!");
    driver.findElement(By.id("id")).clear();
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
    
  //Searching through name only
    driver.findElement(By.id("name")).sendKeys(r.random_String());
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
String actualname=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
    Assert.assertEquals(actualname, "Result not found!");
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click(); 
    
    
    //Searching through email only
    driver.findElement(By.id("email")).sendKeys(r.random_String()+"@xyz.com");
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
String actualemail=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
    Assert.assertEquals(actualemail, "Result not found!");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click(); 
    
  
    

    //Searching through email only
    driver.findElement(By.id("phone")).sendKeys(r.random_number()+r.random_number()+r.random_number());
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
String actualphone=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
    Assert.assertEquals(actualphone, "Result not found!");
    driver.findElement(By.id("phone")).clear();
    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click(); 
       
	}	
	
	


public static void all_invalidsearching(WebDriver driver, Random_String_Generator r ) throws InterruptedException {
		
	  
	  //entering id
	    driver.findElement(By.id("id")).sendKeys(r.random_number());
	    
	  //entering name
	    driver.findElement(By.id("name")).sendKeys(r.random_String());
	        
	  //entering email
	    driver.findElement(By.id("email")).sendKeys(r.random_String()+"@xyz.com");
	    
	    //entering phone
	    driver.findElement(By.id("phone")).sendKeys(r.random_number()+r.random_number()+r.random_number());
	    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click(); 
	    
	      
	    
	    String actualphone=driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/div")).getText();
	    Assert.assertEquals(actualphone, "Result not found!");
	       
	    driver.findElement(By.linkText("All Clients")).click();


}	



public static void single_validsearching(WebDriver driver, Random_String_Generator r ) throws InterruptedException {
	
	
	  
	  //Searching through id only
	
	int idcount=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).size();
	
	for(int i=0;i<idcount;i++){
		
		if(i==1){
			
			String id=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).get(i).getText();
			driver.findElement(By.id("id")).sendKeys(id);
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    //result condition
		    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
		    
		    Thread.sleep(3000);
		    driver.findElement(By.id("id")).clear();
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
			

		    break;
			
		}
		
		
	}		
		
	
	
	
	int namecount=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[2]")).size();
	
	for(int i=0;i<namecount;i++){
		
		if(i==1){
			
			String name=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[2]")).get(i).getText();
			driver.findElement(By.id("name")).sendKeys(name);
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    //result condition
		    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
		    
		    Thread.sleep(3000);
		    driver.findElement(By.id("name")).clear();
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
			

		    break;
			
		}
		
		
	}
	

	int emailcount=driver.findElements(By.xpath("//a[@id='navbarDropdown']")).size();
	
	for(int i=0;i<emailcount;i++){
		
		if(i==1){
		
			Thread.sleep(3000);
			driver.findElements(By.xpath("//a[@id='navbarDropdown']")).get(i).click();
			
			Thread.sleep(3000);	
		String email=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[1]")).getText();
			
		System.out.println(email);	
			
			driver.findElement(By.id("email")).sendKeys(email);
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    //result condition
		    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
		    
		    Thread.sleep(3000);
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
			

		    break;
			
		}
		
		
	}
	
			
	
	
	
int phonecount=driver.findElements(By.xpath("//a[@id='navbarDropdown']")).size();
	
	for(int i=0;i<emailcount;i++){
		
		if(i==1){
		
			Thread.sleep(3000);
			driver.findElements(By.xpath("//a[@id='navbarDropdown']")).get(i).click();
			
			Thread.sleep(3000);	
		String phone=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[2]")).getText();
			
		System.out.println(phone);	
			
			driver.findElement(By.id("phone")).sendKeys(phone);
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    //result condition
		    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[3]/div[1]/div")).getText(), "1 Clients");;
		    
		    Thread.sleep(3000);
		    driver.findElement(By.id("phone")).clear();
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
			

		    break;
			
		}
		
		
	}	
	
}




public static void all_validsearching(WebDriver driver, Random_String_Generator r ) throws InterruptedException {
	
	
	  
	  //Searching through id only
	
	int idcount=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).size();
	
	for(int i=0;i<idcount;i++){
		
		if(i==1){
			
			String id=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]")).get(i).getText();
			driver.findElement(By.id("id")).sendKeys(id);
			
			String name=driver.findElements(By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[2]")).get(i).getText();
			driver.findElement(By.id("name")).sendKeys(name);
			
		
			
			
        driver.findElements(By.xpath("//a[@id='navbarDropdown']")).get(i).click();
		Thread.sleep(3000);	
		String email=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[1]")).getText();
		
        System.out.println(email);	
        String phone=	driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[2]")).getText();
		System.out.println(phone);	
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(phone);	
			
			
		    driver.findElement(By.xpath("//*[@id='client-update-form']/div[5]/button")).click();
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
			

		    break;
			
		}
		
		
	}		
		
	
}









	
}
