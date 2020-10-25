package SeleniumWebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BurshUp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.name("email")).sendKeys("rajpj94@hotmail.com");
		//username.sendKeys("rajpj94@hotmail.com");
		
		driver.findElement(By.name("passwd")).sendKeys("rs570123");
		driver.findElement(By.name("SubmitLogin")).click();;
	}

}
