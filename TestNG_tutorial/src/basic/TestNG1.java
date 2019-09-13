package basic;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class TestNG1 {

	@Test(groups={"smoke"})

	
	public void testcase1(){
		
		
		System.out.println("hello world");
	}	
	
	
	@Test(groups={"smoke"})	
		public void testcase2(){
			
			
			System.out.println("good bye world");
	
	}
	
	
	@BeforeTest
	public void beforetestcase(){
		

		System.out.println("I am before testcase");

}	
	
	
	
	@AfterSuite
	public void Aftertestsuite(){
		
		
		
		System.out.print("I am test case executed at the end of suite in class 1 \n");
		
		
	}
	
}
