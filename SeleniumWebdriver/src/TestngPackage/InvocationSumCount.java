package TestngPackage;

import org.testng.annotations.Test;

public class InvocationSumCount {
	
	@Test(invocationCount=10)
	public void logintest() {
		System.out.println("login page");
	}

}
