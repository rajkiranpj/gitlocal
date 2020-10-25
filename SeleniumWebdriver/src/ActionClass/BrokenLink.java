package ActionClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/");
		
		Thread.sleep(5000);
		
		//capture link in webpage all by tag
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		//No of link capture
		System.out.println(links.size());
		for(int i=0;i<=links.size();i++)
		{
			//use href atribute to get all URL links
			WebElement element =links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			HttpURLConnection httpcon=(HttpURLConnection) link.openConnection(); //create connection
			Thread.sleep(2000);
			httpcon.connect(); // Establish connection 
			
			int rescode=httpcon.getResponseCode();  // Above 400 broken less than 400 valid link
			if(rescode>=400)
			{
				System.out.println(url +"          "+ "Link is broken" );
			}
			else
			{
				System.out.println(url +"      "+ "Link is Valid ");
			}
			
			
		}
		
		

	}

}
