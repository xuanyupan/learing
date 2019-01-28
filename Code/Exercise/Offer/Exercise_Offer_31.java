package Exercise.Offer;

/**
 * @Date: 2019/1/17 11:36
 * @Author: xuanyupan
 * @Desc: 求数组中连续的子数组最大和，动态规划
 */
public class Exercise_Offer_31 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0){
            return 0;
        }
        int total = Integer.MIN_VALUE; // 防止负数出现，就直接用最小值
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++ ){
            // 刚才和为正数 则继续添加，为负数的话直接放弃，从当前位为开始继续
            if (total > 0){
                total = total + array[i];
            }else
                total = array[i];
            if (total > maxSum){
                maxSum = total;
            }
        }
        return maxSum;
    }
}
