package sirmayaCRM_ObjectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientEditPage_Repo {




	 WebDriver driver;

		public ClientEditPage_Repo(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
			this.driver=driver;
		
		}


By editclient_pencilbutton=By.xpath(("//span[@class='fa fa-pencil-alt']"));


By addlead_button=By.linkText("Add Lead");

By addcell_plus_icon_button=By.xpath("//span[@id='basic-addon2']");

By updateclient_button=By.linkText("Update");

public WebElement editclient_pencilbutton(){
	
	return driver.findElement(editclient_pencilbutton);
	
}




public WebElement addlead_button(){
	
	return driver.findElement(addlead_button);
	
}


public WebElement addcell_plus_icon_button(){
	
	return driver.findElement(addcell_plus_icon_button);
	
}

public WebElement updateclient_button(){
	
	return driver.findElement(updateclient_button);
	
}


}
