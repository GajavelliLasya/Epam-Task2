package calculator;
/**
 * 
 * @author Gajavelli Lasya
 * 
 *
 */
/**
 * 
 * Calculator program which performs addition, multiplication and division
 *
 */
public class Calculator {
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @return addition of number1 and number2
	 */
	public double addition(double number1,double number2)
	{
		return number1+number2;
	}
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @return multiplication of number1 and number2
	 */
	public double multiply(double number1,double number2)
	{
		return number1*number2;
	}
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @return division of number1 and number2
	 * @throws ArithmeticException if number2 is equal to zero
	 */
	public double division(double number1,double number2)
	{
		if(number2==0)
			throw new ArithmeticException("Number can't be divided with zero");
		else
			return (number1/number2);
	}

}