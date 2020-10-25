package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlertCancelButton {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Cancel & Ok button path
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		//Ok or cancel button alert window 
		driver.switchTo().alert().accept();
		
		String ExpValOk="You pressed Ok";
		String ExpValCan="You Pressed Cancel";
		String ActVal=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(ExpValOk.equals(ActVal)==true)
		{
			System.out.println("True");
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().dismiss();
		String ActValCan=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(ExpValCan.equals(ActValCan)==true)
		{
			System.out.println("False");
		}

	}

}
