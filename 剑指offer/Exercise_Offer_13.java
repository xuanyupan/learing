package offer.exercise_2018_11;

import java.util.ArrayList;
/**
 * @name 剑指offer第13题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_13 {
	public void reOrderArray(int[] array) {
		ArrayList<Integer> jishu = new ArrayList<>();
		ArrayList<Integer> oushu = new ArrayList<>();

		if (array.length != 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 1) {
					jishu.add(array[i]);
				} else
					oushu.add(array[i]);
			}
			int num = 0;
			for (int i = 0; i < jishu.size(); i++) {
				array[i] = jishu.get(i);

			}

			for (int j = 0; j < oushu.size(); j++) {
				num++;
				array[num] = oushu.get(j);

			}

		}
	}
}
