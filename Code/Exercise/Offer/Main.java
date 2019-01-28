package Exercise.Offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public void test_bitOP(){
        System.out.println(15 << 1); // << 乘 ；  >> 除
        System.out.println("Hello World!");
    }

    // 最小堆
    public void min_PriorityQueue(){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(10);
    }

    // 最大堆
    public void max_PriorityQueue(){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }

    // 比较器 与 Arrays.sort() 排序
    public static void sort(){
        int[] nums = new int[]{1,2,3,4,5,6};
        String[] strs = new String[]{"2","123","33","15","155"};

        // 下面实现了字典排序。
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String  o1, String o2) {
                System.out.println("当前操作数 o1 = " + o1 + "； 操作数o2 ="+ o2);
                System.out.println("返回值结果为" + o1.compareTo(o2));
                return o1.compareTo(o2);
                /*
                * o1.compareTo(o2)方法  操作数o1，长度为k1 ；与 o2 长度为k2：
                * 得到两者长度，在最小长度上每一位进行判断
                * 如果遇到某一位不同，直接返回这一位不同的差值，比如 156 和 13，比较前两位，在第二位有不同，返回 5-3=2
                * 如果每一位都相同则，返回相差几位，如15 与 15555，前两位相同，返回 -3，相差3位
                */
            }
        });
        // sort 会根据 compare的返回值进行排序，如果返回正数的话就进行换位置

        for (String s : strs){
            System.out.print(s+" ");
        }

    }

    public static void test_ArraysCopyOfRange(){
        int[] nums = new int[]{0,1,2,3,4,5,6,7};
        int[] num1 = Arrays.copyOfRange(nums, 0 ,nums.length / 2); // 左闭右开， 8/2=4， 但是下标4不会包含
        // num1 = [0,1,2,3]
        for (int i : num1){
            System.out.print(i + ",");
        }
    }


    public static void main(String[] args) {
        Main.test_ArraysCopyOfRange();
    }
}
