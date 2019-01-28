package Exercise.Offer;

import java.util.ArrayList;

/**
 * @Date: 2019/1/18 17:25
 * @Author: xuanyupan
 * @Desc: 和为s的连续整数
 */
public class Exercise_Offer_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        // 假设 n 个连续的数和是 sum ，所以中间数 是 sum/n , (注意分别 n 奇偶)

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int mid = 0; // 中间数，n 为偶数
        for (int n = 2; n * n < 2 * sum; n++){
            if (n % 2 == 0 && sum % n != 0){

            }
        }

        return null;
    }

}
