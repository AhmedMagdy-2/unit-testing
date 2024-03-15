package code.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();
	int a = 2, b = 3;
	
	@Test
	public void testAdd() {
		int actual = cal.add(a, b);
		int expected = a+b;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		int actual = cal.subtract(a, b);
		int expected = a-b;
		assertEquals(expected, actual);
	}

}
