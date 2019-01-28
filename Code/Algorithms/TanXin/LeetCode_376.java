package Algorithms.TanXin;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/18 0:50
 * @Desc : 求最大摇摆序列长度，判断一个数与上一个数的大小关系，来判断当前输入是上升还是下降，满足摆动的时候加1，
 */
public class LeetCode_376 {
    public int wiggleMaxLength(int[] nums) {
        int BEGIN = 0;
        int UP = 1;
        int DOWN = 2;
        int result = 1;
        int state = BEGIN;
        //利用一个状态的变化来做。这个方法说实话很妙
        if (nums.length < 2) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            switch (state) {
                case 0: {
                    if (nums[i] > nums[i - 1]) {
                        state = UP;
                        result++;
                    } else if (nums[i] < nums[i - 1]) {
                        state = DOWN;
                        result++;
                    }
                    break;
                }
                case 1: {
                    if (nums[i] < nums[i - 1]) {
                        state = DOWN;
                        result++;
                    }
                    break;
                }
                case 2: {
                    if (nums[i] > nums[i - 1]) {
                        state = UP;
                        result++;
                    }
                }
                default:
                    break;
            }

        }
        return result;
    }
}