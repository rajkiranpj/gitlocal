package SeleniumWebdriverBasic;

import org.openqa.selenium.By;

/*Test case
 * 1) open browser
 * 2)open url
 * 3)enter username name="email"
 * 4)enter password name="passwd"   
 * 5)clcick on ok       name="SubmitLogin"
 * 6)check page 
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.marionette", "C://Users//Rajkiran//eclipse//java-2020-09//eclipse//geckodriver");
		// FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();//invoke the browser
		//WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("rajpj94@hotmail.com");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("rajpj94@hotmail.com");  // Username Entry 
		driver.findElement(By.name("passwd")).sendKeys("rs570123");  // Password Entry
		driver.findElement(By.name("SubmitLogin")).click();  // Clcik on Login
		
		/*String Expected="My account - My Store";
		String Actual =driver.getTitle();
		if(Expected.equals(Actual)==true)
		{
			System.out.println("Test Successful");
		}
		else 
		{
			System.out.println("Fail Test");
			
		}
		driver.close(); // Close the browser*/
	}

}
