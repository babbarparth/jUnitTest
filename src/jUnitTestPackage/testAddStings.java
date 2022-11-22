package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStings {

	@Test
	public void test() {
//		fail("Not yet implemented");
		jUnitFunctions jUnitStr = new jUnitFunctions();
		String result = jUnitStr.addStrings("hello ","world");
		
		assertEquals("hello world",result);
	}

}
