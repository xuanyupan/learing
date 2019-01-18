import java.util.HashMap;

/**
 * @Date: 2019/1/17 9:33
 * @Author: xuanyupan
 * @Desc: 找出一个数组中，出现一半次数的数
 */
public class Exercise_Offer_29 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            Integer temp = hashMap.get(array[i]);
            if (temp != null){  // int 类型没有 ！= null这一说，注意！！！
                hashMap.put(array[i], temp+1);
            }else{
                hashMap.put(array[i], 1);
            }
            if (hashMap.get(array[i]) >> 1 > array.length){
                return array[i];
            }
        }
        return 0;
    }
}

