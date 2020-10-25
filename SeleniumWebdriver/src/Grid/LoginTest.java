package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@Test(priority=1)
	public void setup() throws MalformedURLException
	{
		String nodeurl="http://192.168.0.103:8037/wd/hub";
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		System.setProperty("webdriver.chrome.driver", "C://Users//Rajkiran//Desktop//SDET//Selenium Java//selenium-java-3.141.59//chromedriver.exe");
		driver =new RemoteWebDriver(new URL(nodeurl), cap);
		
		
	}
	@Test(priority=2)
	public void login()
	{
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("rajpj94@hotmail.com");
		driver.findElement(By.id("password")).sendKeys("rs570123!@#");
		driver.findElement(By.name("login")).click();
		
		String captext=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]")).getText();
		if(captext.contains("rajpj94"))
		{
			System.out.println("Pass test");
			
		}
		else
		{
			System.out.println("failed test");
		}
	}
}
