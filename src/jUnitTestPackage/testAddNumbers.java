package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
//		fail("Not yet implemented");
		jUnitFunctions jUnitNum = new jUnitFunctions();
		int result = jUnitNum.addNumbers(200, 100);
		
		assertEquals(300,result);
	}

}
