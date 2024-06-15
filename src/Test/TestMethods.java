package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestMethods {

//	@Test
//	public void test() throws Exception {
//		fail("Not yet implemented");
//		
//		
//		Assert.assertEquals(1, EmployeeInsert.testInsertedData());
//	}
	
	@Test
	public void check() throws Exception {
		Assert.assertEquals(3, EmployeeInsert.testSum(2, 1));
//		Assert.assertEquals(1, EmployeeInsert.testInsertedData());
	}
	
	
	
}
