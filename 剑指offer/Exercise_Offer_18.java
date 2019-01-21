package offer.exercise_2018_11;

/**
 * @name 剑指offer18 ， 判断树B是不是A的子树
 * @author xuanyupan
 *
 */
public class Exercise_Offer_18 {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	/*
	 * 判断A 和 B 的根节点，相等的话，判断A,B的左节点与右节点，然后递归；
	 * 假若根节点不同，就判断左右子树是否相同。   
	 */
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {

		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = dealWith(root1, root2);
			}
			
			//如果当前节点判断不是子树，就判断A的左子树是否与B相同，或者判断右子树是否相同，遍历
			if (!result) {
				result =  HasSubtree(root1.left, root2);
			}

			if (!result) {
				result =  HasSubtree(root1.right, root2);
			}
		}

		return result;

	}

	public boolean dealWith(TreeNode node1, TreeNode node2) {
		
		if (node2 == null) {
			return true; //递归如果遍历到B为空，说明之前的都符合了，所以是子树
		}

		if (node1 == null) {  //这两行判断不能互换位置！
			return false;
		}
		
		if (node1.val != node2.val) {
			return false; 
		}

		//判断左右节点是否相同
		return dealWith(node1.left, node2.left) && dealWith(node1.right, node2.right);
	}

}
