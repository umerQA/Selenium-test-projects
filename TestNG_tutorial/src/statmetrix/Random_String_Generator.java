package statmetrix;

import org.apache.commons.lang3.RandomStringUtils;

public class Random_String_Generator {

	
	public String random_number() {
		// TODO Auto-generated method stub
		String upper = "0123456789";
	    //String character = "!@#$%^&*-_=+|;:,<.>/?";
	    String pwd = RandomStringUtils.random(3, upper);
	String a=pwd;

return a;	

	}
	
	public String random_String() {
		// TODO Auto-generated method stub
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    //String character = "!@#$%^&*-_=+|;:,<.>/?";
	    String pwd = RandomStringUtils.random(5, upper);
	String a=pwd;

return a;	

	}
	
	
	
	
}
