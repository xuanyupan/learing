import java.util.LinkedList;

/**
 * @Date: 2019/1/21 14:32
 * @Author: xuanyupan
 * @Desc: 圆圈中最后的数
 */
public class Exercise_Offer_46 {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < n; i++){
            linkedList.add(i);
        }
        int delNum = 0;
        while (linkedList.size() > 1){
            // 这里踩了一个坑，数字是01234，删除第三个对应号是 remove(2),所以需要 -1
             delNum = (m + delNum - 1) % linkedList.size();

             linkedList.remove(delNum);
        }
        if (linkedList.size() == 1)
            return linkedList.get(0);
        return -1;
    }

}
