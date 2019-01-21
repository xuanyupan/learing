package offer.exercise_2018_11;

/**
 * @name  剑指offer第9题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_09 {

	public int JumpFloorII(int target) throws Exception {
		if (target >= 1) {
			if (target == 1) {
				return 1;
			} else {
				return 2 * JumpFloorII(target - 1);
			}
		} else
			throw new Exception("̨������Ϊ����");
	}
}
