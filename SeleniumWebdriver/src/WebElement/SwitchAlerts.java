package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlerts {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Click on link -- Alert with Ok button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		
		//Click on ok of switch alert box 
		System.out.println(driver.switchTo().alert().getText());    // get text of altert and prints
		driver.switchTo().alert().accept();  // Without clicking on ok it will accept 
		
		

	}

}
