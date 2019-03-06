package learning.Code.Exercise.Algorithms;

/**
 * @Date: 2019/3/3 15:08
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class KMP {
    public int[] getNext(char[] p) {
        int pLength = p.length;
        int[] next = new int[pLength];
        int k = -1;
        int j = 0;
        next[0] = -1;

        while (j < pLength -1) {
            if (k == -1 || p[j] == p[k]) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public int kmpResult(String s, String pattern) {

    }
}
