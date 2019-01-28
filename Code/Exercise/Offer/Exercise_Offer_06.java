package Exercise.Offer;

import java.util.Arrays;

/**
 * @name  剑指offer第6题
 * @author xuanyupan
 * ֵ
 */
public class Exercise_Offer_06 {
	public int minNumberInRotateArray(int[] array) {
		int len = array.length;
		if (len == 0) {
			return 0;
		}
		Arrays.sort(array);
		return array[0];
	}
}
