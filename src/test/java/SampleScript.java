import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleScript {

	public static void main(String[] args) {


WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/India");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("samsung mobiles");
		
		
		
		search.sendKeys(Keys.ENTER);
		
		
		
   List<WebElement> product = driver.findElements(By.xpath("//a[@class='a-link-normal']/div[1]"));
		
		for(int i=0;i<1;i++) {
			
			product.get(i).click();
		}
		
		
		
		WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		
	     cart.click();
	     
	     
	     WebElement checkout = driver.findElement(By.xpath("(//*[contains(text(),'Proceed to checkout (1 item)')])[1]"));
			checkout.click();
			
			
			
			driver.findElement(By.xpath("//button[contains(text(),'No Thanks')]")).click();
			
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("sushmit05796@gmail.com");
			
			WebElement con = driver.findElement(By.xpath("//span[@id='continue']"));
			con.click();
			
			driver.findElement(By.id("ap_password")).sendKeys("9944839625Ss@");
			
			driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
			
List<WebElement> deliver = driver.findElements(By.xpath("//*[contains(text(),'Deliver to this address')]"));
			
			for(int i=0;i<=1;i++) {
				
				deliver.get(i).click();
			}
			
			driver.findElement(By.xpath("(//*[@class='a-box-inner'])[1]")).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Hello, Sign in')]")));
		
		Actions acc= new Actions(driver);
		acc.moveToElement(signIn).perform();
   
		
		WebElement signInn = driver.findElement(By.xpath("//span[contains(text(), 'Sign in')]"));
		signInn.click();*/
		
		

				
				

			
		}


	}


