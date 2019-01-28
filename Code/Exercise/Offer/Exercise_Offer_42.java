package Exercise.Offer;

import java.util.ArrayList;

/**
 * @Date: 2019/1/21 9:46
 * @Author: xuanyupan
 * @Desc: 和为S的两个数
 */
public class Exercise_Offer_42 {

    /**
     * 整体思路是利用两个指针向中间夹，题目要求输出乘积最小的两个。数组是递增的，越靠近中间的两个数乘积越大，
     * 思考小的时候常问的通长的绳子，长方形和正方形面积问题。所以有满足要求的数就可以直接输出
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array.length < 2)
            return arrayList;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] > sum) {
                right--;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else if (array[left] + array[right] == sum) {
                arrayList.add(array[left]);
                arrayList.add(array[right]);
            }

        }
        return arrayList;

    }


}
