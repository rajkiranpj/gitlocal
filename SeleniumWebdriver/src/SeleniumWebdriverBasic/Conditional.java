package SeleniumWebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conditional {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("rajpj94@hotmail.com");
		}
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("rs570123");
		}
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
		
	}

}
