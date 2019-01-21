package offer.exercise_2018_11;

import java.util.ArrayList;

/**
 * @name 剑指offer 23题，树的层序遍历
 * @author xuanyupan
 *
 */
public class Exercise_Offer_22 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		
		if(root == null) {
			return list;
		}
		
		queue.add(root);
		while (queue.size() != 0) {
			TreeNode temp = queue.get(0);
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}
			queue.remove(0);
			list.add(temp.val);
			
		}
		
		return list;
		
    }
	
}
