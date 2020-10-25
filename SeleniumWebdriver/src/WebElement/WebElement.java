package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Raj");
		driver.findElement(By.id("lastName")).sendKeys("Kiran");
		driver.findElement(By.id("userEmail")).sendKeys("raj@gmail.com");
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		//driver.findElement(By.xpath("//*[@id='subjectsContainer']/div/div[1]")).sendKeys("Maths");
		//Select t= new Select(driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")));
		//t.selectByVisibleText("Haryana");
		
		//radio Button
		//System.out.println(driver.findElement(By.id("gender-radio-1")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
		
		//checkBox Selection
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("WOOOOOOOOWWWWWWWWWWWWWWWWWWWW");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("Submit")).click();
		
		if(driver.findElement(By.id("example-modal-sizes-title-lg")).isEnabled());
		
			{
				System.out.print("Successful");	
			}
		

	}

}
