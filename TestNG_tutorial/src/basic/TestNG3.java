package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {

	@BeforeClass
public void Beforeclasstest(){
		
		
		
		System.out.print("Im test case executed before every function in the same class in class 3. \n");
		
		
	}	
	
	
	@Test
	public void CardLoanDept(){
		
		
		
		System.out.print("This is for cardloan \n");
		
		
	}
	
	@Test
	public void HomeLoanDept1(){
		
		
		
		System.out.print("This is for homeloan1 \n");
		
		
	}
	

	

	
	@Test
	public void HomeLoanDept2(){
		
		
		
		System.out.print("This is for homeloan2 \n");
		
		
	}
	
	@Test
	public void CarLoanDept(){
		
		
		
		System.out.print("This is for carloan \n");
		
		
	}

	@BeforeTest
	public void Beforetestclass3(){
		
		
		
		System.out.print("I am before test in class 3 \n");
		
		
	}
	
	@AfterClass
public void Afterclasstest(){
		
		
		
		System.out.print("Im test case executed after every function in the same class in class 3. \n");
		
		
	}		
	
	@BeforeSuite
	public void Beforetestsuite(){
		
		
		
		System.out.print("I am test case executed at the start of suite in class 3. \n");
		
		
	}	
	
	
}
