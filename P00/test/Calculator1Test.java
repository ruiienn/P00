import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator1 cal = new Calculator1();
		int actual = cal.add(a,  b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtraction() {
		//fail("Not yet implemented");
		int a = 8765;
		int b = 1234;
		
		Calculator1 cal = new Calculator1();
		int actual = cal.subtract(a,  b);
		
		int expected = 7531;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 1;
		int b = 8;
		
		Calculator1 cal = new Calculator1();
		int actual = cal.multiple(a,  b);
		
		int expected = 8;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 20;
		int b = 5;
		
		Calculator1 cal = new Calculator1();
		int actual = cal.division(a,  b);
		
		int expected = 4;
		assertEquals(expected, actual);
	}

}
