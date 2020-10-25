


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement element =driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div/div[1]"));
		
		Select s=new Select(element);
		
		List OriginalList = new ArrayList();
		
		List<WebElement>options=s.getOptions();
		for(WebElement e:options)
		{
			OriginalList.add(e.getText());
		}
		System.out.print(OriginalList);
		
		

	}

}
