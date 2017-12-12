package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Main {

	
		WebDriver driver;
		@Given("^User is on Home Page$")
		public  void user_is_on_Home_Page() throws InterruptedException  {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VB00535799\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		        System.out.println("Inside user_is_on_Home_Page block");
		        driver= new ChromeDriver();
		        driver.get("http://www.store.demoqa.com");
		        driver.manage().window().maximize();
		        Thread.sleep(3000);
			}
		
		@When("^User Navigate to LogIn Page$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
			driver.findElement(By.xpath(".//*[@id='account']/a")).click();
			System.out.println("inside login Page");
			}
		
		@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_UserName_and_Password(String UserName,String Password) throws Throwable {
			System.out.println("user enters username and password");
			driver.findElement(By.id("log")).sendKeys(UserName); 	 
		    driver.findElement(By.id("pwd")).sendKeys(Password);
		    driver.findElement(By.id("login")).click();
            Thread.sleep(100);//Adding comment
            Thread.sleep(100);//Adding comment

//
			}
				
		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
			System.out.println("Verifying message is displayed or not");
		}
		
		@Given("^User is on Home Page123$")
		public void user_is_on_Home_Page123()
		{
			System.out.println("inside User Home Page 123");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VB00535799\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
	        System.out.println("Inside user_is_on_Home_Page block");
	        driver= new ChromeDriver();
	        driver.get("http://www.google.com");
	        driver.manage().window().maximize();
		}
		
		@Then("^logout$")
		public void logout()
		{
			System.out.println("inside logout block");
			driver.quit();
		}

	}


