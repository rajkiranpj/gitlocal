package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		
		Select drop=new Select(driver.findElement(By.id("dropdown")));
		//drop.selectByIndex(2);  // By index value ( like 0,1,2)
		drop.selectByValue("2");  // By value in HTML 
		//drop.selectByVisibleText("Option 2"); // By visible text which is visible 
		System.out.println(drop.getOptions().size()); // Get option gets all value assocaited with dropdown , size gets number of them 
	}

}
