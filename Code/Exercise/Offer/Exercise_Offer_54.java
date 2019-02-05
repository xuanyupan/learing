package Exercise.Offer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Date: 2019/2/4 17:48
 * @Author: xuanyupan
 * @Desc: 54 字符流中第一个不重复的字符。
 */
public class Exercise_Offer_54 {

    HashMap<Character,Integer> hashMap = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        if (hashMap.containsKey(ch)){
            hashMap.put(ch, hashMap.get(ch) + 1);
        }else{
            hashMap.put(ch, 1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char c = '#';
        for (char key : list){
            if (hashMap.get(key) == 1) {
                 c = key;
                 break;
            }
        }
        return c;
    }
}
