package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG2 {

	

	
	
	@Test 
	
	public void testcase3(){
		
	System.out.println("This is second class test case which is number 3");
		
	}
		
	
@AfterTest 
	
	public void Aftertest2(){
		
	System.out.println("I am after testcase in class 2");
		
	}






}
