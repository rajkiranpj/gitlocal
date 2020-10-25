package DownloadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFileSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);
		WebElement openwindow=driver.findElement(By.id("imagesrc"));
		act.moveToElement(openwindow).click().build().perform();
		
		
		String imagesFilepath = "C:\\Users\\Rajkiran\\Desktop\\SDET\\Selenium Java\\Sikuli Images\\";
		String inputFilepath = "C:\\Users\\Rajkiran\\Desktop\\SDET\\Selenium Java\\Sikuli Images\\";
		
		Screen s=new Screen();
		
		Pattern fileInputTextBox = new Pattern(imagesFilepath+"TextBox.png");
		Pattern openButton = new Pattern(imagesFilepath+"OpenButton.png");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox,20);
		s.type(fileInputTextBox ,inputFilepath+"Lol.png");
		Thread.sleep(5000);
		s.click(openButton);
		
		

	}

}
