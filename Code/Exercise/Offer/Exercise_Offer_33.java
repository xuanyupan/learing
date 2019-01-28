package Exercise.Offer;

/**
 * @Date: 2019/1/17 15:31
 * @Author: xuanyupan
 * @Desc: 丑数
 */
public class Exercise_Offer_33 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 1){
            return index;
        }

        int[] result = new int[index];
        result[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0;
        for (int i = 1; i < index; i++) {
            result[i] = Math.min(result[t2] * 2, Math.min(result[t3] * 3, result[t5] * 5));
            if (result[i] == result[t2] * 2) t2++;
            if (result[i] == result[t3] * 3) t3++;
            if (result[i] == result[t5] * 5) t5++;
        }
        return result[index - 1];

    }
}
