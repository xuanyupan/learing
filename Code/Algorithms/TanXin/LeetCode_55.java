package Algorithms.TanXin;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/19 18:43
 * @Desc : 跳跃游戏
 */
public class LeetCode_55 {
    public static boolean canJump(int[] nums) {
        int[] indexMax = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indexMax[i] = i + nums[i];
        }
        int jump = 0;
        int max_index = indexMax[0];
        while (jump < nums.length && jump <= max_index) {
            if (max_index < indexMax[jump]) {
                max_index = indexMax[jump];
            }
            jump++;
        }
        if (jump == nums.length) {
            return true;
        }
        return false;

    }
}
