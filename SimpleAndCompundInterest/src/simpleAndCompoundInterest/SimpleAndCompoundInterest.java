package simpleAndCompoundInterest;
/**
 * 
 * @author Gajavelli Lasya
 *
 */
public class SimpleAndCompoundInterest {


	float principle;

	float timePeriod;

	float rateOfInterest;

	 

	/**

	 * constructor initializes the instance variables

	 * @param principle

	 * @param timePeriod

	 * @param rateOfInterest

	 */

	public  SimpleAndCompoundInterest(float principle,float timePeriod,float rateOfInterest )

	{

		this.principle=principle;

		this.timePeriod=timePeriod;

		this.rateOfInterest=rateOfInterest;

	}



	/**

	 * calculate simple interest by using formula simple interest=(p*t*r)/100

	 * p=principle amount

	 * t=timePeriod

	 * r=rateOfInterest

	 * @return simpleInterest(double)

	 */

	public double calculateSimpleInterest() {

		return (principle*timePeriod*rateOfInterest)/100;

	}

	

	/**

	 * calculate compound interest by using formula compound interest=P(1+R/100)^t

	 *  p=principle amount

	 *   t=timePeriod

	 *   r=rateOfInterest

	 * @return compoundInterest(double)

	 */

	public double calculateCompoundInterest() {

		return principle * (Math.pow((1 + rateOfInterest / 100), timePeriod));

		}

}
