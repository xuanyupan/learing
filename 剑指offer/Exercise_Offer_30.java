import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.ArrayList;

/**
 * @Date: 2019/1/17 9:44
 * @Author: xuanyupan
 * @Desc: 找出数组中最小的K个值
 */
public class Exercise_Offer_30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        if (k > input.length || k == 0){
            return result;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // java 优先队列默认最小堆，用数组实现的，要做成最大堆，需要重写这个方法。
            }
        });

        for (int i = 0; i < input.length; i++ ){
            if (maxHeap.size() < k){
                maxHeap.offer(input[i]);
            }else if (input[i] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }

        for (Integer integer : maxHeap){
            result.add(integer);
        }
        return result;
    }
}


