package DownloadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileUsingFirefox {

	public static void main(String[] args) {
		
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");  //MIME
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("firesometext");;
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
	}

}
