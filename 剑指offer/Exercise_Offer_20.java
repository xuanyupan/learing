package offer.exercise_2018_11;

import java.util.ArrayList;

/**
 * @name 剑指offer第20题
 * @author xuanyupan
 *
 */
public class Exercise_Offer_20 {

	public ArrayList<Integer> printMatrix(int[][] matrix) {

		int col = matrix.length; // 列数
		int row = matrix[0].length; // 行数
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (col == 1) {
			for (int i = 0; i < row; i++) {
				result.add(matrix[i][0]);
			}
			return result;
		}

		if (row == 1) {
			for (int i = 0; i < col; i++) {
				result.add(matrix[0][i]);
			}
			return result;
		}

		// 计算循环圈数，
		int i = 0;
		 while(col > i * 2 && row > i * 2){ 

			int startX = i;
			int startY = i;
			int endX = col - 1 - i;
			int endY = row - 1 - i;

			for (int m = startX; m <= endX; m++) {
				result.add(matrix[startX][m]);
			}

			if (startY < endY) {
				for (int n = startY + 1; n <= endY; n++) {
					result.add(matrix[n][endX]);
				}
			}

			for (int p = endX - 1; p >= startX; p--) {
				result.add(matrix[endY][p]);
			}

			if (startX < endX && startY <= endY - 1) {
				for (int q = endY - 1; q > startY + 1; q++) {
					result.add(matrix[q][startX]);
				}
			}
			i++;
		}

		return result;

	}

}
