import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodeDecodeTesting {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(decodeString("YWRtaW4xMjM="));
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
	}
	static String decodeString(String password)
	{
		byte [] decodedstring=Base64.decodeBase64(password);
		return (new String(decodedstring));
	}


}
