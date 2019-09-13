package sirmayaCRM_ObjectsRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsListingPage_Repo {



	 WebDriver driver;

		public ClientsListingPage_Repo(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
			this.driver=driver;
		
		}


By clients_sidemenutab=By.xpath("//*[@id='app']/div/div/nav/ul/li[3]/a");

By search_clients=By.linkText("Search Clients");

By id_searchfield=By.id("id");

By name_searchfield=By.id("name");

By email_searchfield=By.id("email");

By cell_searchfield=By.id("cell");

By searchbutton=By.xpath("//button[text()='Search']");

By clearbutton=By.linkText("Clear");

By rows_ids=By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]");

By Edit_client_action_button=By.xpath("//span[@class='fa fa-edit']");

By deleteclient_button=By.xpath("//a[@data-trans-button-confirm='Delete']");

By editclient_button=By.xpath("//a[@data-original-title='Edit']");


public WebElement clients_sidemenutab(){
	
	return driver.findElement(clients_sidemenutab);
	
	
}



public WebElement search_clients(){
	
	return driver.findElement(search_clients);
	
	
}



public WebElement id_searchfield(){
	
	return driver.findElement(id_searchfield);
	
	
}



public WebElement name_searchfield(){
	
	return driver.findElement(name_searchfield);
	
	
}

public WebElement email_searchfield(){
	
	return driver.findElement(email_searchfield);
	
	
}




public WebElement cell_searchfield(){
	
	return driver.findElement(cell_searchfield);
	
	
}


public WebElement searchbutton(){
	
	return driver.findElement(searchbutton);
	
	
}


public WebElement clearbutton(){
	
	return driver.findElement(clearbutton);
	
	
}


public WebElement rows_ids(){
	
	return driver.findElement(rows_ids);
	
	
}





public List<WebElement> Edit_client_action_button(){
	
	return driver.findElements(Edit_client_action_button);
	
	
}





public WebElement deleteclient_button(){
	
	return driver.findElement(deleteclient_button);
	
	
}



public WebElement editclient_button(){
	
	return driver.findElement(editclient_button);
		
}






}
