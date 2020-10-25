import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Rajkiran/Desktop/SDET/Selenium%20Java/sample.html");
		
		int r=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println(r);
		
		int c=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println(c);
		
		for(int i=2;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
			}
			System.out.println();
		}
		

	}

}
