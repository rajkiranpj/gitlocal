package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		WebElement rclk=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(rclk).build().perform(); // Right Click on element 
		driver.findElement(By.xpath("/html/body/ul/li[2]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
