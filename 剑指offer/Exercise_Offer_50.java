import java.util.HashSet;

/**
 * @Date: 2019/1/21 16:23
 * @Author: xuanyupan
 * @Desc: 找重复的数字
 */
public class Exercise_Offer_50 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers.length <= 1 || length <= 1)
            return false;
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < length; i++) {
            if ( numbers[i]<0 || numbers[i]>length-1 ) {
                return false;
            }
            if (!hashSet.add(numbers[i]))
                duplication[0] = numbers[i];
            return true;
        }
        return false;
    }

}
