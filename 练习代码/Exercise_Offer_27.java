import java.util.Stack;

/**
 * @Date: 2019/1/16 18:02
 * @Author: xuanyupan
 * @Desc: 将二叉搜索树转换为双向链表
 */
public class Exercise_Offer_27 {
    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null)
            return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }

        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;
        while (p != null && p.right != null) {
            p = p.right;
        }
        if (left != null) {
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right != null) {
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        if (left != null) {
            return left;
        } else return pRootOfTree;


    }
}
