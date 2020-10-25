package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
		
		WebElement first=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement output=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		//act.clickAndHold(first).moveToElement(output).release().build().perform();
		act.dragAndDrop(first, output).build().perform();
		

	}

}
