package basic;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Task1 {

	
	
//System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	@Test
	
	public void validCredentials(){
		
		
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		
	}




}
