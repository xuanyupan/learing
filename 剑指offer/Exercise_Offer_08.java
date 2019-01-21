package offer.exercise_2018_11;

/**
 * @name   剑指offer第8题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_08 {
	public int JumpFloor(int target) {
		if (target == 1) {
			return 1;
		}
		if (target == 2) {
			return 2;
		}
		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}

}
