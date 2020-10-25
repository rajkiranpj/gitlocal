package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions act=new Actions(driver);
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
		WebElement userm=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		act.moveToElement(admin).build().perform(); // mouseover to admin
		act.moveToElement(userm).build().perform(); //mouseover to usermanagement 
		act.moveToElement(users).click().build().perform();
		act.moveToElement(admin).moveToElement(userm).moveToElement(users).click().build().perform(); // 1 Statement for above

	}

}
