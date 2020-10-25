package JavaScriptEditorUses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownJs {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		JavascriptExecutor js= (JavascriptExecutor) driver ;
		
		// Scroll down by pixel 
		//js.executeScript("window.scrollBy(0,100)", "");
		
		// Scroll till paritclar element 
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"PopularPosts1\"]/div/div/article[4]/h3/a"));
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
		//Scroll till bottom of page 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
