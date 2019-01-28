package Exercise.Offer;

/**
 * @Date: 2019/1/21 15:38
 * @Author: xuanyupan
 * @Desc: 不用加减做加法
 */
public class Exercise_Offer_48 {
    public int Add(int num1,int num2) {
        while (num2 != 0){
            int temp = num1 ^ num2; // 异或运算得到个位
            num2 = (num1 & num2) << 1; // 与运算左移得到进位
            num1 = temp;
        }
        return num1;
    }

}
