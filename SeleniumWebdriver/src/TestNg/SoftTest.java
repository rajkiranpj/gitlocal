package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftTest {
	
	SoftAssert softAssert=new SoftAssert();
	
	
	
	@Test
	public void demo() {
		softAssert.assertTrue(true);
		softAssert.assertEquals("welcome", "welcome");
		softAssert.assertEquals("what", "what");
		System.out.println("Completed ");
		softAssert.assertAll();
	}

}
