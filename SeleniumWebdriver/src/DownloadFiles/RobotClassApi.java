package DownloadFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassApi {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/a[14]")).click();
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		
	}

}
