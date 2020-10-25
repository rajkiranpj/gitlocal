import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		Select year= new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
		year.selectByVisibleText("2020");
		
		//Future
		for(int i=2;i>=1;i--)
		{
			driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]")).click();
			String month =driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
			if(month.equals("November"))
			{
				driver.findElement(By.xpath("").click();
				break;
			}
		}
		
		

	}

}
