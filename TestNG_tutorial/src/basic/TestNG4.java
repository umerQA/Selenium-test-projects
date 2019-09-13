package basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG4 {

	
	@Test(groups={"smoke"})
	public void CreditcardDept(){
		
		
		
		System.out.print("This is for Credit card \n");
		
		
	}
	
//	@Test
//	public void HealthcardDept(){
//		
//		
//		
//		System.out.print("This is for health card \n");
//		
//		
//	}
	@Test
	public void debitcardDept(){
		
		
		
		System.out.print("This is for Debit card \n");
	}
		
		@AfterTest
		public void aftertest4(){
			
			
			
			System.out.print("This is aftertestcase in class 4 \n");
			
	
	}
	
	
	
}
