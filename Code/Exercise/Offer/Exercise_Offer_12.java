package Exercise.Offer;

import java.lang.Math;
/**
 * @name 剑指offer12题
 * @author xuanyupan
 *
 */
public class Exercise_Offer_12 {
	public double Power(double base, int exponent){
		double result = 1;
		for (int i = 0; i<Math.abs(exponent);i++) {
			result = result * base;
		}
		if (exponent < 0) { 
			result = 1/result;
		}
		return result;
	}
}
