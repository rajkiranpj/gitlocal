package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationWindow {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		// Syntax  ======"http://username:password@url"
		
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);

	}

}
