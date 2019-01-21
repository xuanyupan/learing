/**
 * @Date: 2019/1/18 16:25
 * @Author: xuanyupan
 * @Desc: 求一个树的深度
 */
public class Exercise_Offer_38 {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;

         int left = TreeDepth(root.left);
         int right = TreeDepth(root.right);
         // 叶子节点没有子树，于是节点的left 返回了0, 自己的深度就是1，递归返回计算了值。
         int deep = Math.max(left, right) + 1;
         return deep;
    }

}
