package Veale.Bradley.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath notsimplemath = new SimpleMath();
		assertEquals(0, notsimplemath.divide(0, 7), 0.001);
		
	}

	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath supernotsimplemath = new SimpleMath();
		assertEquals(0.25, supernotsimplemath.divide(1, 4), 0.001);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath reallynotsimplemath = new SimpleMath();
		reallynotsimplemath.divide(6, 0);
	}
}
