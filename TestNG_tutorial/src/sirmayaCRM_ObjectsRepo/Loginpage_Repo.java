package sirmayaCRM_ObjectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage_Repo {
	
	
	
  WebDriver driver;

	public Loginpage_Repo(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	
	}

By emailfield=	By.xpath("//*[@id='email']");
By passwordfield= By.xpath("//input[@id='password']");	
By loginbutton=	By.xpath("//button[@type='submit']");
	
	
	
	public WebElement email(){
		
		return driver.findElement(emailfield);
		
		
	}
	
	
	public WebElement password(){
		
		return driver.findElement(passwordfield);
		
		
	}
	

	
public WebElement loginbutton(){
		
		return driver.findElement(loginbutton);
		
		
	}
	
	
}
