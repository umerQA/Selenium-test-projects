package sirmayaCRM_ObjectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clientadvance_searchpage_Repo {



	 WebDriver driver;

		public Clientadvance_searchpage_Repo(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
			this.driver=driver;
		
		}

By advancesearch_link=By.linkText("Advanced Filters");

By citysearch_field=By.id("city");

By countrysearch_dropdown=By.id("country");

By faxsearch_field=By.id("fax");

By ratingsearch_dropdown=By.id("rating");

By interestsearch_dropdown=By.id("interest");






By searchbutton=By.xpath("//button[text()='Search']");

By clearbutton=By.linkText("Clear");

By rows_ids=By.xpath("//*[@id='app']/div/main/div/div/div[3]/div/div[2]/div/div/table/tbody/tr/td[1]");



public WebElement advancesearch_link(){
	
	
	return driver.findElement(advancesearch_link);
	
}




public WebElement citysearch_field(){
	
	
	return driver.findElement(citysearch_field);
	
}



public WebElement countrysearch_dropdown(){
	
	
	return driver.findElement(countrysearch_dropdown);
	
}



public WebElement faxsearch_field(){
	
	
	return driver.findElement(faxsearch_field);
	
}



public WebElement ratingsearch_dropdown(){
	
	
	return driver.findElement(ratingsearch_dropdown);
	
}


public WebElement interestsearch_dropdown(){
	
	
	return driver.findElement(interestsearch_dropdown);
	
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





}
