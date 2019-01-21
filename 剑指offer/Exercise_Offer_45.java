import java.util.HashSet;


/**
 * @Date: 2019/1/21 12:05
 * @Author: xuanyupan
 * @Desc: 牌是否是顺序的
 */
public class Exercise_Offer_45 {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length != 5)
            return false;
        HashSet<Integer> set = new HashSet<>();
        int max = -1; // 这两个最值初始值要附好。
        int min = 14;
        for (int i = 0; i < numbers.length; i++){
            if (!set.add(numbers[i]) && numbers[i] != 0)
                return false;
            if (numbers[i] != 0){
                max = Math.max(max, numbers[i]);
                min = Math.min(min, numbers[i]);
            }
        }
        if (max - min <= 4)
            return true;
        else
            return false;

    }
}
