package Exercise.Offer;

import java.util.Arrays;

/**
 * @Date: 2019/1/17 16:48
 * @Author: xuanyupan
 * @Desc: 经典排序，目前记录了 冒泡，选择，插入，归并，希尔
 */
public class Sort {


    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    /**
     * 冒泡排序，控制两层 for循环， 第一层控制循环次数，
     * 第二层控制每一层循环具体的交换。先把大的排在最后，所以后面会固定，第二层循环次数会依次减少。
     *
     * @param array
     */
    public void maopao_Sort(int[] array) {

        for (int i = 0; i < array.length; i++) { // 控制大循环次数
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { // 依次判断相邻的大小关系
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }
        }

    }

    /**
     * 选择排序，控制两层for循环。第一层控制循环次数，每一层循环找出当前剩下最小数的下标，依次将最小的放在前面。
     *
     * @param array
     */
    public void xuanze_Sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;  // 第几轮循环找第几小的数，放在第几的位置
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; //找到这一轮循环最小的坐标
                }
            }
            // 交换对应坐标的值
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * 插入排序，把前面当成已经排好的，然后排好的部分从后向前循环找到符合的位置插入
     *
     * @param array
     */
    public void charu_Sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i + 1];
            int index = i;      // 避免使用i 影响外层循环
            while (index >= 0 && current < array[index]) {  // 这里两个判断条件不能反，反了的话，先判断array[index]，会地址越界 -1
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = current;

        }
    }

    // 快排
    public void kuaipai_Sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * 快排中的分割
     *
     * @param array 数组
     * @param left  左界
     * @param right 右界
     * @return 返回最后基准数字的坐标位置。
     */
    public int kuaipai_fenge(int[] array, int left, int right) {

        int pivot = array[right]; // 取最后一个数为基准数字
        while (left < right) {  // 整体循环的条件，左边界小于右边界
            while (left < right && array[left] < pivot) {  // 从左向右遍历，值比基准值小，不动，遍历下一个
                left++;
            }
            if (left < right) {   // 上面跳出循环的话，满足left < right ，就是说明当前值 > 基准值了， 所以需要换位，第一轮的话就是将值放在最后基准位置，把前面的放在后面的坑上，前面露出一个坑
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                right--;
            }

            while (left < right && array[right] > pivot) {  // 然后就是从后面向前遍历，找到符合的放在前面的坑上
                right--;
            }
            if (right > left) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                left++;
            }
        }
        return left; // 最后left 和 right是同一个了就
    }

    /**
     * 快排整体过程
     * @param array
     * @param left
     * @param right
     */
    public void quickSort(int[] array, int left, int right) {
        if (left > right) return;  // 递归终止条件
        int pivot_index = kuaipai_fenge(array, left, right);
        quickSort(array, left, pivot_index - 1); // 整体递归来进行
        quickSort(array, pivot_index + 1, right);
    }


    /**
     * 归并分割过程，最后合并过程。
     * @param array
     * @return
     */
    public int[] mergeSort(int[] array) {
        if (array.length <= 1)
            return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid); // 分割数组，这里左闭右开。
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(left), mergeSort(right));

    }

    /**
     * 具体将两个数组归并的过程，就是两个数组依次拿出一个数比较，小的放进数组result中，如果一个结束，另一个就都放进去
     *
     * @param left
     * @param right
     * @return
     */
    public int[] merge(int[] left, int[] right) {
        int i = 0, l = 0, r = 0;
        int[] result = new int[left.length + right.length];
        // 谁小谁放进去
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                result[i++] = left[l++];

            } else {
                result[i++] = right[r++];

            }
        }

        // 把没有放完的直接放进去
        while (l < left.length ) {
            result[i++] = left[l++];

        }

        while (r < right.length ) {
            result[i++] = right[r++];

        }

        return result;
    }

    /**
     * 可以理解为希尔排序就是控制一个增量的插入排序，也可以理解为分组，每一组内进行插入排序
     * @param array
     */
    public int[] shellSort(int[] array) {
        int length = array.length;
        // gap 对应增量值，每一轮依次除 2. 以一轮为例，gap第一次为5，就是将数字分为5组 第二轮gap=2
        for (int gap = length / 2; gap > 0; gap = gap /2){
            // 对应一组内的数进行 插入排序，为什么i是从gap开始的，因为
            for (int i = gap; i < length; i++){  // 这里也对应从 5 开始到9，把这5组数遍历了一遍
                int j = i;
                // j-gap 第一轮对应 0， j 对应 5，也就是这一组0和5 进行比较。
                // array[j] 对应当前要插入的数， array[j-gap] 对应插入排序的后面的部分，只要当当前的比前面的小就换到前面，依次换下去。
                while (j >= gap && array[j-gap] > array[j]){
                    // 这里实际上是有点冒泡往前冒就是，只不过是冒到条件不再冒，前面都是排好序的
                    int temp = array[j - gap];
                    array[j-gap] = array[j];
                    array[j] = temp;
                    j = j - gap;
                }
            }
        }
        return array;

    }


    public static void main(String args[]) {
        int[] testArray = new int[]{10, 5, 3, 6, 8, 1, 9, 2, 7, 4};
        Sort sort = new Sort();
        int[] result = sort.shellSort(testArray);
        System.out.println(Arrays.toString(result));
    }
}
