package Exercise.Offer;

/**
 * @name 剑指offer第7题
 * @author xuanyupan
 * @description 쳲���������
 */
public class Exercise_Offer_07 {
	public int Fibonacci(int n) {
		if (n <= 39 && n >= 0) {
			if (n == 0) {
				return 0;
			}
			if (n == 1) {
				return 1;
			}
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		} else
			return -1;
	}
}
