package sirmayaCRM_ObjectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class add_clientpage_Repo {


	public WebDriver driver;

		public add_clientpage_Repo(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
			this.driver=driver;
		
		}

		By clients_sidemenutab=By.xpath("//*[@id='app']/div/div/nav/ul/li[3]/a");

		By addclient_button=By.linkText("Add New Client");

		By name_typefield=By.id("name");
		

		
		By email_typefield=By.id("email");
		
		By address_typefield=By.id("address");
		
		By city_typefield=By.id("city");
		
		
		
		By state_typefield=By.id("state");

		By zipcode_typefield=By.id("zipcode");
        
		By country_dropdownfield=By.id("country");
		
		
		
		By fax_typefield=By.id("fax");
		
		By type_dropdownfield=By.id("type");

		By rating_dropdownfield=By.id("rating");
		
		
        
		By interests_dropdownfield=By.id("interests");
		
		By phone_typefield=By.id("phone");

		By cell_typefield=By.id("client-phone");
		
		
		By addcell_plus_icon_button=By.id("basic-addon2");
		
		
		By edit_cell_button=By.xpath("//i[@class='fa fa-pencil-alt']");
		
		By delete_cell_button=By.xpath("//i[@class='fa fa-trash']");
		
		
		By updatecell_button=By.linkText("Update");
		
		By cancel_cellupdate_button=By.linkText("Cancel");
		
		By editcell_typefield=By.id("phone_1");

		By savebutton=By.linkText("Save");
		
		By cancelbutton=By.linkText("Cancel");

		
		

		public WebElement clients_sidemenutab(){
			
			return driver.findElement(clients_sidemenutab);
			
			
		}



		public WebElement addclient_button(){
			
			return driver.findElement(addclient_button);
			
			
		}



		public WebElement name_typefield(){
			
			return driver.findElement(name_typefield);
			
			
		}



		public WebElement email_typefield(){
			
			return driver.findElement(email_typefield);
			
			
		}

		public WebElement address_typefield(){
			
			return driver.findElement(address_typefield);
			
			
		}


		public WebElement city_typefield(){
			
			return driver.findElement(city_typefield);
			
			
		}


		public WebElement state_typefield(){
			
			return driver.findElement(state_typefield);
			
			
		}


		public WebElement zipcode_typefield(){
			
			return driver.findElement(zipcode_typefield);
			
			
		}


		public WebElement country_dropdownfield(){
			
			return driver.findElement(country_dropdownfield);
			
			
		}

	public WebElement fax_typefield(){
			
			return driver.findElement(fax_typefield);
			
			
		}


		public WebElement type_dropdownfield(){
			
			return driver.findElement(type_dropdownfield);
			
			
		}


		public WebElement rating_dropdownfield(){
			
			return driver.findElement(rating_dropdownfield);
			
			
		}
		
		
public WebElement interests_dropdownfield(){
			
			return driver.findElement(interests_dropdownfield);
			
			
		}


		public WebElement phone_typefield(){
			
			return driver.findElement(phone_typefield);
			
			
		}
		
          public WebElement cell_typefield(){
			
			return driver.findElement(cell_typefield);
			
			
		}


		public WebElement addcell_plus_icon_button(){
			
			return driver.findElement(addcell_plus_icon_button);
			
			
		}
		
		
		
public WebElement savebutton(){
			
			return driver.findElement(savebutton);
			
			
		}


public WebElement cancelbutton(){
	
	return driver.findElement(cancelbutton);
	
	
}
		
		
public WebElement edit_cell_button(){
	
	
	return driver.findElement(edit_cell_button);
	
}		


public WebElement delete_cell_button(){
	
	
	return driver.findElement(delete_cell_button);
	
}




public WebElement updatecell_button(){
	
	
	return driver.findElement(updatecell_button);
	
}



public WebElement cancel_cellupdate_button(){
	
	
	return driver.findElement(cancel_cellupdate_button);
	
}





public WebElement editcell_typefield(){
	
	
	return driver.findElement(editcell_typefield);
	
}

}
