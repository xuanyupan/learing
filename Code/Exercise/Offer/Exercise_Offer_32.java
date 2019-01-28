package Exercise.Offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Date: 2019/1/17 14:22
 * @Author: xuanyupan
 * @Desc: 组合数字中的树使其最小
 */
public class Exercise_Offer_32 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers.length == 0 || numbers == null)
            return "";
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            strs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs){
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
