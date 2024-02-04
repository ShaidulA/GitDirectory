package stepDefinition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class log_in {
	WebDriver driver;
	@Before
	public void before()
	{
		System.out.println("before");
	}
	@After
	public void after()
	{
		driver.close();
	}
	@Given ("when the user launches the application")
	public void user_launches_browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(driver,TimeUnit.SECONDS);
		
	}
	@And ("the user enters the url")
	public void user_enters_url()
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		
	}
	@When ("the user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_credentials(String user, String pass)
	{
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("signon")).click();
	}
	@Then ("should login to the home page")
	public void home_page()
	{
		System.out.println(driver.getTitle());
	}
	
	@When ("the user enters credentials")
	public void user_enters_invalid_credentials(DataTable dataTable)
	{
		List<List<String>> data= dataTable.cells();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("signon")).click();
	}
  @Then("should login throws error message")
	public void error_message()
	{
		WebElement error=driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
		System.out.println(error.getText());
	}

}
