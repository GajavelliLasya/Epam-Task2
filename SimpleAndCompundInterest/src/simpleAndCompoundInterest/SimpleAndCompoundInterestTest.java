package simpleAndCompoundInterest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleAndCompoundInterestTest {

	@Test

	public void testSimpleInterest() {

		SimpleAndCompoundInterest simpleIntrest=new SimpleAndCompoundInterest(20202,5, 2.5f);

	 	assertEquals(2525.25, simpleIntrest.calculateSimpleInterest(),0);

	}



	@Test

	public void testCompoundInterest() {

		SimpleAndCompoundInterest compoundInterest;

		compoundInterest = new SimpleAndCompoundInterest(20202, 3,2.5f);

		assertEquals(21755.342888139312, compoundInterest.calculateCompoundInterest(),0);

		}

}
