package Exercise.Offer;

/**
 * @Date: 2019/2/2 15:13
 * @Author: xuanyupan
 * @Desc: 乘积数组
 */
public class Exercise_Offer_51 {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];

        if (length != 0){
            B[0] = 1;
            for (int i = 1; i < length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }

            int temp = 1;
            for(int j = length - 2; j >= 0; j--){
                temp = temp * A[j + 1];
                B[j] = B[j] * temp;
            }
        }
        return B;
    }
}
