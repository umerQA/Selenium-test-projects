package basic;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG5 {

	//Used to set the priority based execution of particular method
	@Test(dependsOnMethods={"debitcardDept"})
	public void CreditcardDept(){
		
		
		
		System.out.print("This is for Credit card \n");
		
		
	}
	
	@Test @Parameters({"USER","Pass"})
	public void LealthcardDept(String s,String u){
		
		
		
		System.out.print(s +"\n" + u + "\n");
		
		
	}
	
//Used for timeout for particular method	
	@Test(timeOut=5000)
	public void debitcardDept(){
		
		
		
		System.out.print("This is for Debit card \n");
	
	
	}
	
	
//Used to skip particular method
		@Test(enabled=false)
		public void aftertest4(){
			
			
			
			System.out.print("This is aftertestcase in class 4 \n");
			
	
	}
	
	
	
}
