package offer.exercise_2018_11;

/**
 * @name 剑指offer第19题
 * @author xuanyupan
 *
 */
public class Exercise_Offer_19 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public void Mirror(TreeNode root) {
        if (root != null) {
        	TreeNode temp =  root.left; //换的是节点，所以子树节点都会带着换过去
        	root.left = root.right;
        	root.right = temp;
        	
        	if(root.left != null) {
        		Mirror(root.left);
        	}
        	if(root.right != null) {
        		Mirror(root.right);
        	}
        }
        	
    }
	
}
