package extra;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import statmetrix.Setup;

public class email_generator extends Setup {

	
	
public WebDriver driver;
String s2 = null;

	
	@BeforeClass 
	public void Initialsetup() {
        setup();
		driver = new ChromeDriver();

	}



	@Test @Parameters({"RanURL"})
	public void opensite(String s) throws InterruptedException {
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(s);
	
		Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//div[@class='as_middle']/input"))).doubleClick().sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();

	//a.moveToElement(driver.findElement(By.xpath("//input[@type='submit']"))).click().build().perform();

	} 
	
	
	
	

	}

