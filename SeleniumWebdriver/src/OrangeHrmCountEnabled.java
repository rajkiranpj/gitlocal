/*Test Case 
 * 1. Login Orange HRM
 * Go to ADmin USer management ---> Users
 * Count employees whose status is enabled 
 * 
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrmCountEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Navigation
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		int rowcount= driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		int statuscount=0;
		
		for(int i=1;i<=rowcount;i++)
		{
			String Status= driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+i+"]/td[5]")).getText();
		if(Status.equals("Enabled"))
		{
			statuscount = statuscount+1;
			
		}
		
		System.out.println("No of Emp Enabled "+statuscount);
		
		}
		
		
		
		
	}

	

}
