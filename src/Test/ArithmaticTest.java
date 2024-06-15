package Test;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticTest {
	
	@Test
	public void testSum() {
		Assert.assertEquals(4, Arithmetic.testSum(2, 2));
	}
	@Test
	public void testSub() {
		Assert.assertEquals(0, Arithmetic.testSub(2, 2));
	}

}
