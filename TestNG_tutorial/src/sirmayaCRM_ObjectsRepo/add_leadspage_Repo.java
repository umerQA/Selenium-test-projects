package sirmayaCRM_ObjectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class add_leadspage_Repo {




	public WebDriver driver;

		public add_leadspage_Repo(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
			this.driver=driver;
		
		}


		
By leads_sidemenutab=By.xpath("//*[@id='app']/div/div/nav/ul/li[2]/a");

By addlead_sidemenulink=By.linkText("Add New Lead");		
		
		
By Project_dropdown=By.id("projects");

By Budget_typefield=By.id("budget");

By Budgetcurrency_dropdown=By.id("budget_currency");

By Source_dropdown=By.id("source");

By Beds_typefield=By.id("beds");

By status_dropdown=By.id("status");

By purpose_dropdown=By.id("purpose");

By leadtype_dropdown=By.id("type");

By leadsubtype_dropdown=By.id("sub_type");

By paymentmode_dropdown=By.id("payment_mode");

By message_typefield=By.id("message");

By area_typefield=By.id("area");

By areatype_dropdown=By.id("area_type");

By note_typefield=By.id("note");




By tasktype_dropdown=By.id("task_type");

By task_subtype_dropdown=By.id("task_sub_type");

By task_status_dropdown=By.id("task_status");

By task_location=By.id("location");

By task_completed_date_calender=By.id("task-completed-date");

By task_attachment=By.xpath("//input[@type='file']");

By Task_comment=By.id("comment");

By followup_task_type_dropdown=By.id("next_task");

By followup_deadline_calender=By.id("lead-next-task-completed-deadline");





By Save_button=By.linkText("Save");

By Cancel_button=By.linkText("Cancel");



By Negativevalue_budgeterror=By.xpath("//label[@id='budget']");

By Negativevalue_bedserror=By.xpath("//label[@id='beds']");

By Negativevalue_areaerror=By.xpath("//label[@id='area']");


By Maxvalue_budgeterror=By.xpath("//label[@id='budget']");
By Maxvalue_bedserror=By.xpath("//label[@id='beds']");
By Maxvalue_areaerror=By.xpath("//label[@id='area']");


By Failedpopup=By.xpath("//button[text()='OK']");








public WebElement leads_sidemenutab(){
	
	return driver.findElement(leads_sidemenutab);
	
	
}


public WebElement addlead_sidemenulink(){
	
	return driver.findElement(addlead_sidemenulink);
	
	
}



public WebElement Project_dropdown(){
	
	return driver.findElement(Project_dropdown);
	
	
}


public WebElement Budget_typefield(){
	
	return driver.findElement(Budget_typefield);
	
	
}


public WebElement Budgetcurrency_dropdown(){
	
	return driver.findElement(Budgetcurrency_dropdown);
	
	
}



public WebElement Source_dropdown(){
	
	return driver.findElement(Source_dropdown);
	
	
}


public WebElement Beds_typefield(){
	
	return driver.findElement(Beds_typefield);
	
	
}


public WebElement status_dropdown(){
	
	return driver.findElement(status_dropdown);
	
	
}


public WebElement purpose_dropdown(){
	
	return driver.findElement(purpose_dropdown);
	
	
}


public WebElement leadtype_dropdown(){
	
	return driver.findElement(leadtype_dropdown);
	
	
}


public WebElement leadsubtype_dropdown(){
	
	return driver.findElement(leadsubtype_dropdown);
	
	
}




public WebElement paymentmode_dropdown(){
	
	return driver.findElement(paymentmode_dropdown);
	
	
}

public WebElement message_typefield(){
	
	return driver.findElement(message_typefield);
	
	
}

public WebElement area_typefield(){
	
	return driver.findElement(area_typefield);
	
	
}




public WebElement areatype_dropdown(){
	
	return driver.findElement(areatype_dropdown);
	
	
}

public WebElement note_typefield(){
	
	return driver.findElement(note_typefield);
	
	
}


public WebElement tasktype_dropdown(){
	
	return driver.findElement(tasktype_dropdown);
	
	
}

public WebElement task_subtype_dropdown(){
	
	return driver.findElement(task_subtype_dropdown);
	
	
}

public WebElement task_location(){
	
	return driver.findElement(task_location);
	
	
}


public WebElement task_status_dropdown(){
	
	return driver.findElement(task_status_dropdown);
	
	
}


public WebElement task_completed_date_calender(){
	
	return driver.findElement(task_completed_date_calender);
	
	
}





public WebElement task_attachment(){
	
	return driver.findElement(task_attachment);
	
	
}

public WebElement Task_comment(){
	
	return driver.findElement(Task_comment);
	
	
}

public WebElement followup_task_type_dropdown(){
	
	return driver.findElement(followup_task_type_dropdown);
	
	
}


public WebElement followup_deadline_calender(){
	
	return driver.findElement(followup_deadline_calender);
	
	
}


public WebElement Save_button(){
	
	return driver.findElement(Save_button);
	
	
}




public WebElement Cancel_button(){
	
	return driver.findElement(Cancel_button);
	
	
}

public WebElement Failedpopup(){
	
	return driver.findElement(Failedpopup);
	
	
}


public WebElement Negativevalue_budgeterror(){
	
	return driver.findElement(Negativevalue_budgeterror);
	
	
}


public WebElement Negativevalue_bedserror(){
	
	return driver.findElement(Negativevalue_bedserror);
	
	
}

public WebElement Negativevalue_areaerror(){
	
	return driver.findElement(Negativevalue_areaerror);
	
	
}


public WebElement Maxvalue_budgeterror(){
	
	return driver.findElement(Maxvalue_budgeterror);
	
	
}

public WebElement Maxvalue_bedserror(){
	
	return driver.findElement(Maxvalue_bedserror);
	
	
}

public WebElement Maxvalue_areaerror(){
	
	return driver.findElement(Maxvalue_areaerror);
	
	
}





}
