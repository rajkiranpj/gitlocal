package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieExample {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie>cookie=driver.manage().getCookies(); //capture all cookie from browser 
		System.out.println("Size of cookies "+cookie.size());  // print size of cookies 
		
        for(Cookie cook:cookie)
		{
			System.out.println(cook.getName()+" :  "+cook.getValue()); // prints all value and name of cookie
		}
		//System.out.println(driver.manage().getCookieNamed("session-id-time")); // prints specific name 
		
		//add new cookie to browser 
		Cookie obj=new Cookie("mycookie","12345"); 
		driver.manage().addCookie(obj);
		
		cookie=driver.manage().getCookies();
		System.out.println("Size of cookies "+cookie.size());
		for(Cookie cook:cookie)
		{
			System.out.println(cook.getName()+" :  "+cook.getValue()); // prints all value and name of cookie
		}
		
		//Delete cookie 
		driver.manage().deleteCookie(obj); // delete cookies 
		cookie=driver.manage().getCookies();
		System.out.println("Size of cookies "+cookie.size());
		//driver.manage().deleteCookieNamed("session-id","259-6393783-9649832");
		for(Cookie cook:cookie)
		{
			System.out.println(cook.getName()+" :  "+cook.getValue()); // prints all value and name of cookie
		}
		
		driver.manage().deleteAllCookies(); // Delete all cookies 
		cookie=driver.manage().getCookies();
		System.out.println("Size of cookies "+cookie.size());
		
		for(Cookie cook:cookie)
		{
			System.out.println(cook.getName()+" :  "+cook.getValue()); // prints all value and name of cookie
		}
		

	}

}
