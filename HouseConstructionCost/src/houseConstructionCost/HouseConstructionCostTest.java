package houseConstructionCost;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseConstructionCostTest {

	@Test
	public void estimateTest()

	{

		HouseConstructionCost estimate=new HouseConstructionCost();

		assertEquals(1200000,estimate.getCost("standard", 1000, false),0.1);

		assertEquals(1500000,estimate.getCost("aboveStandard", 1000, false),0.1);

		assertEquals(2500000,estimate.getCost("highStandard", 1000, true),0.1);

	}

}

