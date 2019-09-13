package statmetrix;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Statmetrix extends Setup {

	public WebDriver driver;

	
	
	@BeforeClass
	public void Initialsetup() {
		setup();
		driver = new ChromeDriver();

	}
	
	public void timeout(){
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	

	@Test @Parameters({ "StatURL" })
	public void copyEmail(String s1) {

		driver.get(s1);
		timeout();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	
	}

//	public void empty_role() {
//
//		
//		timeout();
//		//driver.findElement(By.cssSelector("div[class=forgot-password] a:nth-child(2)")).click();
//		 driver.findElement(By.cssSelector(".register-btn-withoutmargin")).click();
//		
// String actualerror = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div/div[1]/div[1]/div/form/div/div")).getText();
//		 Assert.assertEquals(actualerror, "User role required.");
//	System.out.println("Test case passed: Error message is displaying.");
//
//	}
	
	@Test
	public void select_role() throws InterruptedException {

		Random_String_Generator r=new Random_String_Generator();
		timeout();
	
//		Select s=new Select(driver.findElement(By.xpath("//input[@type='radio']")));
//		
//        s.selectByIndex(0);
        
        int size= driver.findElements(By.xpath("//div[@class='inputGroup']")).size();
    	
    	for(int i=0;i<size;i++){
    		
    		
    		String actual=driver.findElements(By.xpath("//div[@class='inputGroup']")).get(i).getText();
    		
    		if(actual.equalsIgnoreCase("Create a club")){
    			
    			driver.findElement(By.xpath("//div[@class='inputGroup']")).click();
    			
    		}
    		
    		
    	}
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div/div[2]/div/div/div/div[1]/div[2]/input")).sendKeys(r.random_String());
	
	
	Select s1=new Select(driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[1]/select")));
	
	s1.selectByIndex(5);
	
	
	driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(r.random_String());
	
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hamza.farooq"+"+"+r.random_number()+"@crewlogix.com",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(r.random_String());
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hamza_333");
	
	
	
	driver.findElement(By.xpath("//input[@name='re_type_password']")).sendKeys("Hamza_333");
	
	driver.findElement(By.cssSelector(".register-btn-margin")).click();
	
	

}
	
	
}