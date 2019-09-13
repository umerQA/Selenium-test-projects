package basic;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG6 {


@Test @Parameters({"URL"})
	public void cardDept(String s){
		
		
		
		System.out.print(s+"\n");
		
		
	}
	
	@Test 
	public void HealthcardDept(){
		
		
		
		System.out.print("This is for health card \n");
		
		
	}
	

	@Test
	public void debitcardDept(){
		
		
		
		System.out.print("This is for Debit card \n");
	}
	

	
	
}
