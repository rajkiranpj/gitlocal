package TestNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	
	@Test
	void demoTest()
	{
		Assert.assertTrue(true);
		Assert.assertEquals("Equal", "Equal");
		Assert.assertEquals("Int", "Int");
		System.out.println("Test complete");
		
	
	}

}
