import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 7777;
		b = 777;
		c = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 7;
		int b = 77;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 84;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 777;
		int b = 77;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 700;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 7;
		int b = 77;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 539;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 77;
		int b = 7;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 11;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDividedWith0Denominator() {
		//fail("Not yet implemented");
	    
	    try {
	      cal.divide(a, c);
	      fail("Expected an IllegalArgumentException to be thrown");
	    } catch(IllegalArgumentException e) {
	      assertEquals("Division by zero is not supported", e.getMessage());
	    } catch(Throwable t) {
	      assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
	    }
	  }
	}
