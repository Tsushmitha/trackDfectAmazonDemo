package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver;
		
	@Given("^the user launch url$")
	
	public void the_user_launch_url() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
	}
	
	@When("^the user search productName and press enter$")
	
	public void the_user_search_productName_and_press_senter() {
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("samsung mobiles");
		
	}
	
	@And("^the user clicks the product$")
	
	public void the_user_clicks_the_product() {
		
		List<WebElement> product = driver.findElements(By.xpath("//a[@class='a-link-normal']/div[1]"));
		
		for(int i=0;i<=2;i++) {
			
			product.get(i).click();
		}}
		
		@Then("^the user add product to cart$")
		
		public void the_user_add_product_to_cart() {
			
			WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));  // (//span[contains(text(),'Add to Cart')])[2]/..//input
			
		     cart.click();
		
	}
		
		@And("^the user proceed to checkout$")

	public void the_user_proceed_to_checkout() {
			
			WebElement checkout = driver.findElement(By.xpath("(//a[contains(text(),'Proceed to checkout (1 item)')])[1]"));
			checkout.click();
			
			driver.findElement(By.xpath("//button[contains(text(),'No Thanks')]")).click();
		}
		
		@When("^the user signIn enters email$")
	public void the_user_signIn_enters_email() {
			
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("sushmit05796@gmail.com");
		}

		@Then("^the user click continue$")
		public void the_user_click_continue() {
			
			WebElement con = driver.findElement(By.xpath("//span[@id='continue']"));
			con.click();
		}
		
		@And("^the user enters password$")
		
		public void the_user_enters_password() {
			
			driver.findElement(By.id("ap_password")).sendKeys("9944839625Ss@");
			
		}
		
		@And("^the user clicks signIn$")
		
		public void the_user_clicks_signIn() {
			
			driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
			
		}
		
		@When("^the user select address$")
		
		public void the_user_select_address() {
			
			List<WebElement> deliver = driver.findElements(By.xpath("//*[contains(text(),'Deliver to this address')]"));
			
			for(int i=0;i<1;i++) {
				
				deliver.get(i).click();
			}
			
			driver.findElement(By.xpath("(//*[@class='a-box-inner'])[1]")).click();
			
		}
}
