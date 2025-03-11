package testjunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoUtilsTest {
	DemoUtils d;
	@BeforeClass
	public static void setUpClass() {
		System.out.println("setupClass() called");
	
	}
	
	@Before
	public void setUp() {
		System.out.println("setup() called");
		d=new DemoUtils();
	}
	@Test
	public void testAdd() {
		System.out.println("add()");
		assertEquals(6,d.add(2, 4));
		
	}
	@Test
	public void testMultiply() {
		System.out.println("mul()");
		assertEquals(6,d.multiply(3, 2));
	}
	@Test
	public void testisEven() {
		System.out.println("isEven()");
		assertTrue("enter a even number",d.isEven(6));
		//assertFalse("enter a even number",d.isEven(4));
		
	}
	@Test
	public void testGetMessage() {
		System.out.println("getMessage()");
		assertNull(d.getMessage());
	}
	@Test
	public void testgetNumbers() {
		System.out.println("getNumbers()");
		int[]arr= {1,2,3,4};
		assertArrayEquals(arr,d.getNumbers());
	}
	@Test(expected = RuntimeException.class)
	public void testThrowException() {
		System.out.println("throwException()");
		d.throwException();
	}
	@After
	public void tearDown() {
		System.out.println("tearDown() called");
		d=null;
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("tearDownClass() called");
	}
}
