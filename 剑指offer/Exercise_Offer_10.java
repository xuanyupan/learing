package offer.exercise_2018_11;

/**
 * @name 剑指offer第10题
 * @author xuanyupan
 *
 */
public class Exercise_Offer_10 {
	public int RectCover(int target) {
		if (target == 0) {
			return 0;
		}else if (target == 1) {
			return 1;
		}else if(target == 2) {
			return 2;
		}else {
			return (RectCover(target -1) + RectCover(target - 2));
		}
    }
		
}
