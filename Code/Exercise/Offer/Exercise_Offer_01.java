package Exercise.Offer;

/**
 * @name 剑指offer第1题
 * @author xuanyupan
 * @desc  
 */
public class Exercise_Offer_01 {
	
	public boolean Find(int target, int[][] array) {
		
		int line = array.length;
		int col = array[0].length;
		int i = line -1;
		int j = 0; 
		
		while(i >= 0 && j < col) {
			if(target < array[i][j]) {
				i--;
			}else if(target > array[i][j]) {
				j++;
			}else 
				return true;
		}
		return false;
	}
	
}
