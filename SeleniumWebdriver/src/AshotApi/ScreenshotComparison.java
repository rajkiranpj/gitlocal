package AshotApi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ScreenshotComparison {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement logoimgelement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		Screenshot logoimgscreenshot=new AShot().takeScreenshot(driver, logoimgelement);
		ImageIO.write(logoimgscreenshot.getImage(),"png", new File("C://Users//Rajkiran//Desktop//SDET//Selenium Java//Hrm.png"));
		File f=new File("C://Users//Rajkiran//Desktop//SDET//Selenium Java//Hrm.png");
		if(f.exists())
		{
			System.out.println("File Exists");
		}
		else
		{
			System.out.println("File not found");
		}

	}

}
