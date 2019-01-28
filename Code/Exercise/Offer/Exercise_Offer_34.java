package Exercise.Offer;

import java.util.HashMap;

/**
 * @Date: 2019/1/17 16:16
 * @Author: xuanyupan
 * @Desc: 第一个只出现一次的字符
 */
public class Exercise_Offer_34 {

    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == null){
                hashMap.put(str.charAt(i),1);
            }else
                hashMap.put(str.charAt(i),hashMap.get(str.charAt(i)) + 1);
        }

       for (int i = 0; i < str.length(); i++){
           if (hashMap.get(str.charAt(i)) == 1){
               return i;
           }
       }
        return -1;
    }
}
