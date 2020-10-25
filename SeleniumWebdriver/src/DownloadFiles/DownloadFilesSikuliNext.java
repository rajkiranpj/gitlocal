package DownloadFiles;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesSikuliNext {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("somefile");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		if (isFileExists("C://Users/Rajkiran/Downloads/info.txt"))
		{
			System.out.print("Exists");
		}
		else
		{
			System.out.print("Not Exisists");
		}
		
		driver.findElement(By.id("pdfbox")).sendKeys("somepdf");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();

	}
	
	static boolean isFileExists(String path)
	{
		File f=new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
