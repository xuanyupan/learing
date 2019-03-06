package learning.Code.Exercise.Algorithms.DP;

/**
 * @Date: 2019/3/3 13:15
 * @Author: xuanyupan
 * @Desc: 最长公共子序列
 */
public class LCS {
    // 求共同子序列
    public int[][] getDPArray1(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];


        for (int i = 0; i <= str1.length(); i++) {
           dp[i][0] = 0;
        }

        for (int j = 0; j < str2.length(); j++) {
            dp[0][j] = 0;
        }

        for (int m = 1; m <= str1.length(); m++) {
            for (int n = 1; n < str2.length(); n++) {
                if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
                    dp[m][n] = dp[m-1][n-1] + 1;
                } else {
                    dp[m][n] = Math.max(dp[m - 1][n],dp[m][n - 1]);
                }
            }
        }
        // 到这里 dp 的 数组就已经求完了。 如果为了得到最长的值，直接在这里返回 dp[m][n] 就是
        return dp;

    }

    // 求共同子串
    public int[][] getDPArray2(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];


        for (int i = 0; i <= str1.length(); i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < str2.length(); j++) {
            dp[0][j] = 0;
        }
        int reslut = 0;
        for (int m = 1; m <= str1.length(); m++) {
            for (int n = 1; n < str2.length(); n++) {
                if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
                   dp[m][n] = dp[m-1][n-1] + 1;
                   reslut = Math.max(reslut, dp[m][n]);
                } else {
                    dp[m][n] = 0;
                }
            }
        }
        // 到这里 dp 的 数组就已经求完了。 如果为了得到最长的值，直接在这里返回 reslut 就是
        return dp;

    }


}
