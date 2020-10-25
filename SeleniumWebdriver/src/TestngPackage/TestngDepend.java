package TestngPackage;

import org.testng.annotations.Test;

public class TestngDepend {
	
	@Test
	public void logintest() {
		System.out.println("login page");
	}
	
	@Test(dependsOnMethods="logintest")
	public void homepage() {
		System.out.println("Home page ");
	}
	

}
