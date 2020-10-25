package TestNg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseAssertion {
	
	@Test
	public void loginTest() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		
		WebElement emailtype=driver.findElement(By.id("email"));
		WebElement passtype=driver.findElement(By.id("passwd"));
		
		Assert.assertTrue(emailtype.isDisplayed());
		emailtype.sendKeys("rajpj94@hotmail.com");
		
		Assert.assertTrue(passtype.isDisplayed());
		passtype.sendKeys("rs570123");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Validation
		String ExpTitle="My account - My Store";
		Assert.assertEquals(ExpTitle, driver.getTitle());
	}

}
