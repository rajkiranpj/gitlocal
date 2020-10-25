package SeleniumWebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.setHeadless(true);
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		System.out.println("Title of hradless browser"+driver.getTitle());	
		System.out.println(driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/h3")).getText());		
	}

}
