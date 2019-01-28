package Exercise.Offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * @Date: 2019/1/18 17:02
 * @Author: xuanyupan
 * @Desc: 找出数组中只出现一次的数字，
 */
public class Exercise_Offer_40 {
    // 巧妙利用Set不能存重复值的方法
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i]) == false) {
                set.remove(array[i]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}
