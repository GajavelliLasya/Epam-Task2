package houseConstructionCost;

/**
 * 
 * @author Gajavelli lasya
 *
 */
/**
 * 
 * House Construction Cost Estimation
 *
 */
public class HouseConstructionCost {
	/**
	 * 
	 * @param MaterialStandard
	 * @param AreaOfHouse
	 * @param IsAutomated
	 * @return House construction cost based on materials and area.
	 */
	public double getCost(String MaterialStandard,double AreaOfHouse,boolean IsAutomated)

	{

		double cost=0;

		if(MaterialStandard.equals("standard"))

		{

			cost=AreaOfHouse*1200;

		}

		else if(MaterialStandard.equals("aboveStandard"))

		{

			  cost=AreaOfHouse*1500;

		}

		else if(MaterialStandard.equals("highStandard"))

		{

			if(IsAutomated)

				cost=AreaOfHouse*2500;

			else

				cost=AreaOfHouse*1800;

		}

		return cost;

	}

}
