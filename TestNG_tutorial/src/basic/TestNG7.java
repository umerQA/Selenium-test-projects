package basic;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG7 {

	
	@Test(dataProvider="getdata")
	
public void setdata(String s, String d){
	
	
		System.out.println(s);
		
		System.out.println(d);

	}

@Test	
	public void settrue(){
		Assert.assertTrue(true);
	
		

	}
	@Test
	public void setfalse(){
		Assert.assertTrue(false);
	
		

	}
	
@DataProvider

public Object[][] getdata(){
	
	// we will make 2d array: row will represent how many time the test should run or combination. 3 records
	// coloumn will tell the number of possible value in each combination i.e username and password are 2 values
	
	Object [][] data=new Object[3][2];
	
	data[0][0]="mark";
	data[0][1]="123";

	data[1][0]="Leo";
	data[1][1]="456";
	
	data[2][0]="Gill";
	data[2][1]="789";
	
	return data;

}
	

	
	
	
	
}
