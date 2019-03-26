package calculator;

import static org.junit.Assert.*;
/**
 * @author Gajavelli Lasya
 * Junit Testing of Calculator Program
 */

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculatorAdd() {
		Calculator calculator=new Calculator();
		assertEquals(17.5,calculator.addition(5.0, 12.5),1.0);
	}
	@Test
	public void testCalculatorMultiply() {
		Calculator calculator=new Calculator();
		assertEquals(25.0,calculator.multiply(5.0, 5.0),1.0);
	}
	@Test
	public void testCalculatorDivision() {
		Calculator calculator=new Calculator();
		assertEquals(5.0,calculator.division(25.0, 5.0),1.0);
	}

}
