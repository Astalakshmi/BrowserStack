package browserStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {


	public static void main(String[] args) {


			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.get("https://bstackdemo.com/signin");
			
			//MAXIMIZE WINDOW
			driver.manage().window().maximize();
			
			// LOGIN PAGE
			
			WebElement username=driver.findElement(By.id("username"));
			username.click();

			WebElement uname= driver.findElement(By.xpath("//div//*[contains(text(),'demouser')]"));
			uname.click();

			WebElement pwdbox=driver.findElement(By.id("password"));
			pwdbox.click();

			WebElement pwd=driver.findElement(By.xpath("//div//*[contains(text(),'testingisfun99')]"));
			pwd.click();

			WebElement loginbtn=driver.findElement(By.id("login-btn"));
			loginbtn.click();
			
			//SELECT VENDORS (Filter Option)
			
			WebElement vendors=driver.findElement(By.xpath("//input[@value='Apple']"));
			vendors.isSelected();      //type ="checkbox" so I choose isSelected() instead of click()
			
			
			//ADD TO CART
			
			WebElement addtocartbox=driver.findElement(By.xpath("//div[@id='3']//div[contains(text(),'Add to cart')]"));
			addtocartbox.click();
			

			WebElement addtocart=driver.findElement(By.xpath("//div[@id='4']//div[contains(text(),'Add to cart')]"));
			addtocart.click();
			
			WebElement checkout=driver.findElement(By.xpath("//div[contains(text(),'Checkout')]"));
			checkout.click();
			
			//SHIPPING ADDRESS
			
			WebElement fname = driver.findElement(By.id("firstNameInput"));
			fname.sendKeys("Astalakshmi");
			
			WebElement lname = driver.findElement(By.id("lastNameInput"));
			lname.sendKeys("Amulraj");
			
			WebElement address = driver.findElement(By.id("addressLine1Input"));
			address.sendKeys("xyz123");
			
			WebElement state = driver.findElement(By.id("provinceInput"));
			state.sendKeys("CA");
			
			WebElement postalcode = driver.findElement(By.id("provinceInput"));
			postalcode.sendKeys("123654");
			
			WebElement submit=driver.findElement(By.id("checkout-shipping-continue"));
			submit.submit();
			
			//GET SUCCESSFUL MESSAGE AND ORDER NUMBER
			
			WebElement message = driver.findElement(By.id("confirmation-message"));
			System.out.println(message.getText());
			
			WebElement order_number = driver.findElement(By.xpath("//div[@class='checkout-form']//div[2]"));
			System.out.println(order_number.getText());
			
			//CONTINUE SHOPPING TAB
			WebElement continueshop=driver.findElement(By.xpath("//button[contains(text(),'Continue Shop')]"));
			continueshop.click();
			
			System.out.println("*************************************************************");
			
			//ORDER TAB
			WebElement order = driver.findElement(By.id("orders"));
			order.click();
			
			WebElement ordersmessage1 = driver.findElement(By.xpath("//div[@class='a-box-inner']/div[1]"));
			System.out.print(ordersmessage1.getText()+"\n");
			
			System.out.println("*************************************************************");
			
			WebElement ordermessage2 = driver.findElement(By.xpath("//div[@class='a-box shipment shipment-is-delivered']/div"));
			System.out.print(ordermessage2.getText());
			
			//LOGOUT
			WebElement logout = driver.findElement(By.xpath("//div//*[contains(text(),'Logout')]"));
			logout.click();
						
			//DRIVER QUITE
			
			driver.quit();
			
			}
	
		
	}


