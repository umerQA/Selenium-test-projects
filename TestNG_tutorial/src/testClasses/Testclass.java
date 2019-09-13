package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;

import statmetrix.Random_String_Generator;

import org.openqa.selenium.JavascriptExecutor;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Random_String_Generator r = new Random_String_Generator();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://test.statmetrix.co/UI/");

		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[2]/div/div/div[1]/div/form/input[1]"))
				.sendKeys("hamza.farooq@crewlogix.com");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[2]/div/div/div[1]/div/form/input[2]"))
				.sendKeys("Hamza_333");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[2]/div/div/div[1]/div/form/button")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/UI/settings/clubDetails']")).click();
		// driver.findElement(By.xpath("//a[@href='/UI/settings']")).click();
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[2]")).click();
		Thread.sleep(3000);
		
		
		
		
		updateclub_detail(driver,r);
		// update_history(driver);
		// create_trophy(driver);
		// update_trophy(driver);
		// delete_trophy(driver);
		// add_users(driver);
		// add_multiusers(driver,r);
		// search_users(driver);
		// team_creation(driver, r);
		// update_team(driver,r);
		// search_team(driver);
		// delete_team(driver);

		// Create_Teamplayer(driver,r);
		// Create_MultiTeamplayer(driver,r);
		// search_player(driver);
		// delete_player(driver);

		//player_creation(driver, r);
		//update_player(driver, r);
		//player_delete(driver);
		// logout(driver);

		// roster_creation(driver, r);

	}

	
	
	public static void updateclub_detail(WebDriver driver,Random_String_Generator r) throws InterruptedException {

	
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[1]/input[1]"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),r.random_String());

		Select s = new Select(
				driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[1]/select")));

		s.selectByValue("2000");

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/input[1]"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"07911 123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/input[2]"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"http://www.abc.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/input[3]"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),r.random_String() + "@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/input[4]"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),r.random_String());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

	}
	
	
	
	
	
	
	
	public static void update_history(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/UI/settings/clubHistory']")).click();
		//
		// //
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/a")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div"))
				.sendKeys("This is the testing content for the site to check history module is working.");

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/button")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

	}

	public static void create_trophy(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[5]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/a")).click();

		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div/input"))
				.sendKeys("Test Trophy");
		;
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath("//input[@name='date1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //td[@class='date-active']")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[3]/div/input"))
				.sendKeys("Test Organization");

		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[4]/div/div[2]/div[2]/div"))
				.sendKeys("This is the test description for the create trophy");

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[5]/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

	}

	public static void update_trophy(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);

		int size = driver.findElements(By.xpath("//a[@class='edit-trophy']")).size();

		for (int i = 1; i < size; i++) {

			if (i == 2) {

				driver.findElements(By.xpath("//a[@class='edit-trophy']")).get(i).click();

				Thread.sleep(3000);
				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div/input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE, "Test Trophy updated");
				Thread.sleep(3000);

				driver.findElement(By.xpath("//input[@name='date1']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(" //td[@class='date-active']")).click();
				// Thread.sleep(3000);
				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[3]/div/input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE, "Test Organization updated");

				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[4]/div/div[2]/div[2]/div"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE,
								"This is the test description for the update trophy");

				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div[5]/button")).click();
				Thread.sleep(7000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

				// Thread.sleep(3000);
				// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/a")).click();
			}

		}

	}

	public static void delete_trophy(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);

		int size = driver.findElements(By.xpath("//a[@class='delete-trophy']")).size();

		for (int i = 0; i < size; i++) {

			if (i == 1) {

				driver.findElements(By.xpath("//a[@class='delete-trophy']")).get(i).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

			}

		}

	}

	public static void add_users(WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement e1 = driver.findElement(By.linkText("Users"));

		String script = "document.body.scrollIntoView('Users')";
		js.executeScript(script);
		Thread.sleep(3000);
		e1.click();

		// //
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content100']/div[1]/div[1]/button[1]")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div")).click();
		Random_String_Generator r = new Random_String_Generator();

		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[1]/div[1]/input")).sendKeys(r.random_String());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[1]/div[2]/input"))
				.sendKeys(r.random_String() + "@xyz.com");

		driver.findElement(By.xpath("//*[@id='myModal']/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

	}

	public static void add_multiusers(WebDriver driver, Random_String_Generator r) throws InterruptedException {

		// driver.findElement(By.xpath("//a[@href='/UI/settings/users']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='myBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("add five at once")).click();

		int totalrecord = driver.findElements(By.xpath("//input[@placeholder='Full Name']")).size();

		for (int i = 0; i < totalrecord; i++)

		{
			driver.findElements(By.xpath("//input[@placeholder='Full Name']")).get(i).sendKeys(r.random_String());

			driver.findElements(By.xpath("//input[@placeholder='Email']")).get(i)
					.sendKeys(r.random_String() + "@xyz.com");

			if ((i >= 2)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;

				// Scroll inside web pop element vertically (e.g. 100 pixel)
				js.executeScript("arguments[0].scrollTop = arguments[1];",
						driver.findElement(By.xpath("//*[@id='myModal']/div/div")), 200);

			}

		}

		driver.findElement(By.xpath("//*[@id='myModal']/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
	}

	public static void delete_users(WebDriver driver) throws InterruptedException {

		int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		for (int i = 1; i < size; i++) {

			if (i == 1) {

				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();

				driver.findElement(By.xpath("//*[@id='content100']/div[1]/div[1]/button[2]")).click();

				driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

			}
		}

	}

	public static void search_users(WebDriver driver) throws InterruptedException {

		int size = driver.findElements(By.xpath("//*[@id='content100']/div[3]/table/tbody/tr/td[2]")).size();

		for (int i = 0; i < size; i++) {

			if (i == 2) {
				String searchuser = driver.findElements(By.xpath("//*[@id='content100']/div[3]/table/tbody/tr/td[2]"))
						.get(i).getText();

				if (searchuser != null) {

					driver.findElement(By.xpath("//*[@id='content100']/div[2]/div[2]/input")).sendKeys(searchuser);

					driver.findElement(By.xpath("//*[@id='content100']/div[2]")).click();
					Thread.sleep(3000);
					JavascriptExecutor js = (JavascriptExecutor) driver;

					String scroll = "document.body.scrollIntoView('Invite Pending')";

					js.executeScript(scroll);

					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='content100']/div[2]/div[2]/input"))
							.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);

				}

			}
		}

	}

	public static void team_creation(WebDriver driver, Random_String_Generator r) throws InterruptedException {

		for (int i = 0; i < 3; i++) {

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[5]")).click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[1]/a")).click();

			driver.findElement(
					By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/input"))
					.sendKeys(r.random_String());

			if (i == 0) {
				Thread.sleep(3000);

				driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div"))
						.click();
				// d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div"))));
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]"))
						.click();
				Thread.sleep(3000);
				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]"))
						.click();
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[2]"))
						.click();

				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/button[1]"))
						.click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
			}

			if (i == 1) {

				Thread.sleep(3000);

				driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div"))
						.click();
				// d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div"))));
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[2]"))
						.click();
				Thread.sleep(3000);
				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]"))
						.click();
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[3]"))
						.click();

				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/button[1]"))
						.click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();

			}

			if (i == 2) {

				Thread.sleep(3000);

				driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div"))
						.click();
				// d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div"))));
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[3]"))
						.click();
				Thread.sleep(3000);
				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]"))
						.click();
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[4]"))
						.click();

				driver.findElement(
						By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/button[1]"))
						.click();
				Thread.sleep(5000);
				driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();

			}

		}

	}

	public static void update_team(WebDriver driver, Random_String_Generator r) throws InterruptedException {

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
		//
		// int
		// count=driver.findElements(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[2]/table/tr/td[3]")).size();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "document.body.scrollIntoView('Club settings')";

		js.executeScript(script);

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href*='/UI/settings/teamDetail']")).click();

		Thread.sleep(3000);
		//
		// Thread.sleep(10000);

		WebElement uploadpic = driver.findElement(By.xpath("//*[@id='file']"));
		uploadpic.sendKeys("C:/Users/hamza/Desktop/Office work/Testing data/testimage.jpg");

		// Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/input"))
				.sendKeys(r.random_String());
		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/input"))
				.sendKeys(r.random_String());

		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/input"))
				.sendKeys(r.random_String());

		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[3]/div[2]/div[2]/div[1]/input"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a"), r.random_String() + "@gmail.com");
		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/input"))
				.sendKeys(r.random_number());

		driver.findElement(
				By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/input"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a"), "www." + r.random_String() + ".com");

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div[4]/button[1]")).click();

		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();

	}

	public static void search_team(WebDriver driver) throws InterruptedException {

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/a[1]")).click();

		Thread.sleep(4000);
		int count = driver
				.findElements(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[2]/table/tr/td[1]"))
				.size();

		for (int i = 0; i < count; i++) {

			String name = driver
					.findElements(By
							.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[2]/table/tr/td[1]"))
					.get(i).getText();

			if (i == 1) {

				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[2]/div[2]/div[2]/input"))
						.sendKeys(name);
				Thread.sleep(3000);
				driver.findElement(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[2]/div[2]/div[2]/input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);

			}

		}
	}

	public static void delete_team(WebDriver driver) throws InterruptedException {

		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
		// Thread.sleep(3000);
		driver.findElement(By
				.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/main/section/div/div/div[2]/div[2]/div[2]/input"))
				.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

	}

	public static void Create_Teamplayer(WebDriver driver, Random_String_Generator r) throws InterruptedException {

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "document.body.scrollIntoView('Team Players')";

		js.executeScript(script);

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href*='/UI/settings/teams/players']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='content100']/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='team_name_id']/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='team_name_id']/div/div[1]/input"))
				.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/div[1]/input")).sendKeys(r.random_String());
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/div[2]/input"))
				.sendKeys(r.random_String() + "@xyz.com");

		driver.findElement(By.xpath("//*[@id='myModal']/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();

	}

	public static void Create_MultiTeamplayer(WebDriver driver, Random_String_Generator r) throws InterruptedException {

		driver.manage().window().fullscreen();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("a[href*='/UI/settings/teams/players']")).click();

		driver.findElement(By.xpath("//*[@id='content100']/div[1]/div[1]/button[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.linkText("add five at once")).click();

		int totalrecord = driver.findElements(By.xpath("//input[@placeholder='Full Name']")).size();

		for (int i = 0; i < totalrecord; i++)

		{
			driver.findElements(By.xpath("//input[@placeholder='Full Name']")).get(i).sendKeys(r.random_String());

			driver.findElements(By.xpath("//input[@placeholder='Email']")).get(i)
					.sendKeys(r.random_String() + "@xyz.com");

			if ((i >= 2)) {

				JavascriptExecutor js1 = (JavascriptExecutor) driver;

				// Scroll inside web pop element vertically (e.g. 100 pixel)
				js1.executeScript("arguments[0].scrollTop = arguments[1];",
						driver.findElement(By.xpath("//*[@id='myModal']/div/div")), 200);

			}

		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
	}

	public static void search_player(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);

		int count = driver.findElements(By.xpath("//*[@id='content100']/div[3]/table/tbody/tr/td[2]")).size();

		for (int i = 0; i < count; i++) {

			String name = driver.findElements(By.xpath("//*[@id='content100']/div[3]/table/tbody/tr/td[2]")).get(i)
					.getText();

			if (i == 1) {

				driver.findElement(By.xpath("//*[@id='content100']/div[2]/div[2]/input")).sendKeys(name);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='content100']/div[2]/div[2]/input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);

			}

		}
	}

	public static void delete_player(WebDriver driver) throws InterruptedException {

		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
		Thread.sleep(3000);

		int totalcheckboxes = driver.findElements(By.xpath("//*[@id='content100']/div[3]/table/tbody/tr/td/input"))
				.size();

		for (int i = 1; i < totalcheckboxes; i++) {

			if (i == 1) {

				driver.findElements(By.xpath("//*[@id='content100']/div[3]/table/tbody/tr/td/input")).get(i).click();

				JavascriptExecutor js = (JavascriptExecutor) driver;

				String script = "document.body.scrollIntoView('Delete Player')";

				js.executeScript(script);

				driver.findElement(By.cssSelector("button[class='delete-user']")).click();
				Thread.sleep(5000);
				driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
				break;
			}
		}

	}

	public static void player_creation(WebDriver driver, Random_String_Generator r) throws InterruptedException {

		String[] array = { "Goalkeeper", "Left Back", "Right Back" };

		for (int k = 0; k < 3; k++) {

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[1]/a")).click();

			driver.findElement(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[1]/div/input"))
					.sendKeys(r.random_String());

			driver.findElement(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[2]/input"))
					.sendKeys(r.random_String() + "@xyz.com");

			driver.findElement(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/i"))
					.click();
if(k==0){
			int size = driver
					.findElements(By
							.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/div[2]/div"))
					.size();

			for (int i = 0; i < size; i++) {

				String text = driver
						.findElements(By
								.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/div[2]/div"))
						.get(i).getText();
				System.out.println(text);

				if (!(text.equalsIgnoreCase(array[0]))) {

					driver.findElement(By.xpath("//*[@id='positionSelect']")).sendKeys(Keys.chord(Keys.DOWN));
				} else {

					driver.findElement(By.xpath("//*[@id='positionSelect']"))
							.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
					driver.findElement(By
							.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[4]/button"))
							.click();
					Thread.sleep(3000);
					driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
					Thread.sleep(3000);
					driver.findElement(
							By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div/div/button[1]"))
							.click();

					break;
				}

			}
}
			
if(k==1){
	int size = driver
			.findElements(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/div[2]/div"))
			.size();

	for (int i = 0; i < size; i++) {

		String text = driver
				.findElements(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/div[2]/div"))
				.get(i).getText();
		System.out.println(text);

		if (!(text.equalsIgnoreCase(array[1]))) {

			driver.findElement(By.xpath("//*[@id='positionSelect']")).sendKeys(Keys.chord(Keys.DOWN));
		} else {

			driver.findElement(By.xpath("//*[@id='positionSelect']"))
					.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
			driver.findElement(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[4]/button"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div/div/button[1]"))
					.click();

			break;
		}

	}
}			
	

if(k==2){
	int size = driver
			.findElements(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/div[2]/div"))
			.size();

	for (int i = 0; i < size; i++) {

		String text = driver
				.findElements(By
						.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[3]/div/div[2]/div"))
				.get(i).getText();
		System.out.println(text);

		if (!(text.equalsIgnoreCase(array[2]))) {

			driver.findElement(By.xpath("//*[@id='positionSelect']")).sendKeys(Keys.chord(Keys.DOWN));
		} else {

			driver.findElement(By.xpath("//*[@id='positionSelect']"))
					.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
			driver.findElement(By
					.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/form/div/div[4]/button"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div/div/div/div[3]/div/div/button[1]"))
					.click();

			break;
		}

	}
}
		
		}
	}

	
	
	
	
	public static void update_player(WebDriver driver, Random_String_Generator r) throws InterruptedException {


		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
		
int size=driver.findElements(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/table/tr/td[3]/a")).size();


for(int i=0;i<size;i++){
	
	
	if(i==1){
		
		
		driver.findElements(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/table/tr/td[3]/a")).get(i).click();
		Thread.sleep(3000);
		//enter last name of player
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[1]/div[2]/div[2]/input")).sendKeys(r.random_String());
		
		//enter dob of player
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[1]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[1]/div[2]/div[1]/div/div/table/tbody/tr[3]/td[5]")).click();
		
		//enter nationality
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='age_type_id']")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]")).click();
		
	
		//enter season of player
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[1]/div[1]/div/i")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[2]")).click();
		
		Thread.sleep(3000);
		//enter weight of player
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("50");
		
		//enter height of player
		
		Select s =new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[1]/div[2]/select")));
		
		s.selectByIndex(3);
		
		//enter foot of player
		
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div[2]/input[2]")).click();
		
		// enter Primary position of player
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[1]/div[3]/div/i")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]")).click();
		
		// enter Secondary position of player
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/i")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div[3]")).click();
		
		//save data of player
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/div[2]/div[1]/button[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		
		break;
	}
	

}

	}	
	
	
	
	
	public static void player_delete(WebDriver driver) throws InterruptedException {


		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
		
int size=driver.findElements(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/table/tr/td[4]/a")).size();


for(int i=0;i<size;i++){
	
	
	if(i==1){
		
		driver.findElements(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/section/div/div/div[2]/table/tr/td[4]/a")).get(i).click();
	Thread.sleep(3000);
		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
		
		break;
	}
	

}

	}		
	
	
	
	
	public static void logout(WebDriver driver) throws InterruptedException {

		// driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[1]/header/div[2]/ul/li[1]/div/button")).click();

		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[1]/header/div[2]/ul/li[1]/div/div/a[2]")).click();

	}

}
