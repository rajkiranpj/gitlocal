package AshotApi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ScreenshotCompared {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		BufferedImage expectedimg=ImageIO.read(new File("C://Users//Rajkiran//Desktop//SDET//Selenium Java//Hrm.png"));
		WebElement logoimgelement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoimgscreenshot=new AShot().takeScreenshot(driver, logoimgelement);
		BufferedImage actualimg=logoimgscreenshot.getImage();
		
		ImageDiffer imgDiff=new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedimg, actualimg);
		if(diff.hasDiff()==true)
		{
			System.out.println("Not same img");
		
		}
		else 
		{
			System.out.println("Same Img");
		}
		}

}
