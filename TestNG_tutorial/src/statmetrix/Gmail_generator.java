package statmetrix;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gmail_generator extends Setup {

	public WebDriver driver;
	String s2 = null;

	@BeforeClass
	public void Initialsetup() {
		setup();
		driver = new ChromeDriver();

	}

	@Test
	@Parameters({ "GmailURL" })

	public void open_gmail(String s) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get(s);

		if (driver.findElement(By.xpath("//*[@id='identifierId']")).getAttribute("id")
				.equalsIgnoreCase("identifierId")) {

			driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("hamza.farooq@crewlogix.com");

			driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(Keys.ENTER);
		} else if (driver.findElement(By.xpath("//input[@placeholder='Email or phone']")).getAttribute("placeholder")
				.equalsIgnoreCase("Email or phone")) {
			driver.findElement(By.xpath("//input[@placeholder='Email or phone']"))
					.sendKeys("hamza.farooq@crewlogix.com");
			driver.findElement(By.xpath("//input[@placeholder='Email or phone']")).sendKeys(Keys.ENTER);
		}

		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("QA73821hamza");
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
		// driver.findElement(By.className("whsOnd
		// zHQkBf")).sendKeys(Keys.ENTER);

		Thread.sleep(7000);
		List<WebElement> email = driver.findElements(By.xpath("//*[@class='zA zE']"));

		email.get(0).click();

		driver.findElement(By.cssSelector("a[class*='es-button']")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[name='sl']")).click();
		Thread.sleep(7000);
		System.out.print(driver.getTitle());
driver.switchTo().defaultContent();
driver.quit();

	}

//	@Test(timeOut=5000)
//	public void shift_control() {
//
//		Set<String> ids = driver.getWindowHandles();
//
//		Iterator<String> it = ids.iterator();
//
//		while (it.hasNext()) {
//
//			String statmetrix = it.next();
//
//			if (driver.getTitle().equalsIgnoreCase("statmetrix")) {
//
//				driver.switchTo().window(statmetrix);
//
//				System.out.println(driver.getTitle());
//				break;
//			}
//
//		}
//
//	}
		
	
	

}
