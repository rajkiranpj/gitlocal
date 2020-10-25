package TestngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasic {
	
	private static final String dependsOnMethod = null;

	// @Before --- strarting are Pre requisist Annotations 
	@BeforeSuite
	public void setUp() {
		System.out.println("setup properties ");
		
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser chrome");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=FWukV8ecM63v8weDlKGQBQ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@BeforeTest
	public void loginMethod() {
		System.out.println("login method ");
		boolean b=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div")).isDisplayed();
		System.out.print(b);
		}
	
	//Test =----- Cases  
	@Test(priority=1,groups="Title")
	public void googleTitle() {
		System.out.println("google title");
	}
	@Test()
	public void link() {
		System.out.println("link exists");
	}
	
	//@After --- Post condiitons 
	@AfterMethod
	public void logout() {
		System.out.println("logout ");
	}
	@AfterTest
	public void deleteCookies() {
		System.out.println("cookies deleted");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("closed browser");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("report generated");
	}
	

}
