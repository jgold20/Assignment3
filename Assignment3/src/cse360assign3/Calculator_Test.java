package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator_Test {

	@Test
	public void testCalculator() {
		Calculator test_calc = new Calculator();
		assertNotNull(test_calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator test_calc = new Calculator();
		assertEquals(0, test_calc.getTotal());
		test_calc.add(1);
		test_calc.multiply(2);
		assertEquals(2, test_calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator test_calc = new Calculator();
		test_calc.add(1);
		test_calc.add(4);
		assertEquals(5, test_calc.getTotal());
		
		//Test adding negative numbers
		test_calc.add(-3);
		assertEquals(2, test_calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator test_calc = new Calculator();
		test_calc.add(9);
		test_calc.add(3);
		test_calc.subtract(5);
		assertEquals(7, test_calc.getTotal());
		
		//Test subtracting negative integers
		test_calc.subtract(-3);
		assertEquals(10, test_calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator test_calc = new Calculator();
		test_calc.add(3);
		test_calc.multiply(2);
		assertEquals(6, test_calc.getTotal());
		
		test_calc.multiply(0);
		assertEquals(0, test_calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator test_calc = new Calculator();
		test_calc.add(10);
		test_calc.divide(2);
		assertEquals(5, test_calc.getTotal());
		
		//Divide by 0 test
		test_calc.divide(0);
		assertEquals(0, test_calc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator test_calc = new Calculator();
		assertEquals("", test_calc.getHistory());
	}

}
