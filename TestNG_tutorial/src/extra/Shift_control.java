package extra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Shift_control extends email_generator{

	
	@Test
	public String get_randomemail_window() throws InterruptedException{
    
		//WebDriver driver;
		String s1;
		String s2 = null;
		Shift_control sc=new Shift_control();
		//sc.driver;
		this.driver=sc.driver;
		sc.Initialsetup();
		
		
		s1=driver.getCurrentUrl();
		System.out.println(s1);
		Set<String> st	=driver.getWindowHandles();
		
		
		
		Iterator<String> it =st.iterator();
		
		
	while(it.hasNext()){	

	s2=it.next();

	if(s1.equalsIgnoreCase(driver.getCurrentUrl())){
		
	System.out.println("url is matched");
	}

	else{
		System.out.println("Url not matched.");
		
	}
	}
	return s2;
		
		}



//@Test	
//public void shift_control(){
//	
//	
//	driver.switchTo().window(s2);
//	
//}	
	
	
}
