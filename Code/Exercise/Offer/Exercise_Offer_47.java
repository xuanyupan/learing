package Exercise.Offer;

/**
 * @Date: 2019/1/21 15:05
 * @Author: xuanyupan
 * @Desc: 不用加减法做前n个数和
 */
public class Exercise_Offer_47 {
    public int Sum_Solution(int n) {
        // 公式为 二分之 n方 + n，所以利用平方来算了
        int sum1 = (int) (Math.pow(n, 2) + n);
        return sum1 >> 1;
    }
}
