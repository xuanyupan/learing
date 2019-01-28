package Exercise.Offer;

import java.util.HashMap;

/**
 * @Date: 2019/1/18 16:21
 * @Author: xuanyupan
 * @Desc: 统计一个数在数组中出现的次数
 */
public class Exercise_Offer_37 {
    public int GetNumberOfK(int [] array , int k) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])){
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }else
                hashMap.put(array[i], 1);
        }

        if (hashMap.containsKey(k)){
            return hashMap.get(k);
        }else
            return 0;
    }
}