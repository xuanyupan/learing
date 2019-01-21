/**
 * @Date: 2019/1/18 16:36
 * @Author: xuanyupan
 * @Desc: 判断一个树是不是平衡二叉树
 */
public class Exercise_Offer_39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = getDeep(root.left);
        int right = getDeep(root.right);
        if (Math.abs(left - right) <= 1){
            return true;
        }
        return false;
    }


    public int getDeep(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = getDeep(root.left);
        int right = getDeep(root.right);
        int deep = Math.max(left, right) + 1;
        return deep;
    }

}