package offer.exercise_2018_11;

/**
 * @name 剑指offer第11题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_11 {
	public int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1); 
			count++;
		}
		return count;
	}
}
