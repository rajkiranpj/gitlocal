package SeleniumWebdriverBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		//System.out.println(driver.getTitle());
	
		Set <String> s=driver.getWindowHandles(); // return how many windows open & their ID
		for(String i:s)
		{
			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle();
			//System.out.println(t);
			if(t.contains("New Window"))
			{
				driver.close();
			}
		}
		
	

	}

}
