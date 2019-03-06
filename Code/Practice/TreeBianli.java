package Code.Practice;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Date: 2019/3/6 20:08
 * @Author: xuanyupan
 * @Desc: TODO
 */
public class TreeBianli {

    class TreeNode {
        int val;
        //左子树
        TreeNode left;
        //右子树
        TreeNode right;
        //构造方法
        TreeNode(int x) {
            val = x;
        }
    }

    public static void qianxu(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root != null) {
            arrayList.add(root.val);
            qianxu(root.left);
            qianxu(root.right);
        }
    }

    public static void zhongxu(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root != null) {
            qianxu(root.left);
            arrayList.add(root.val);
            qianxu(root.right);
        }
    }

    public static void houxu(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root != null) {
            qianxu(root.left);
            qianxu(root.right);
            arrayList.add(root.val);
        }
    }

    public static void qianxuTigui(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = root;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                arrayList.add(node.val);
                treeNodeStack.push(node);  // 把一个节点的左节点一直加进去，左孩子节点其实就是下一个父节点，到最后做孩子没孩子的时候，
                node = node.left;
            }

            if (!treeNodeStack.isEmpty()) { // 这里就是左孩子没有孩子后，然后弹出左孩子，就可以到右孩子这边。
                node = treeNodeStack.pop(); // 右孩子没有右孩子的时候，就会不会过上面的while 然后就会被弹出，
                node = node.right;// 在这里循环就一直到右孩子有值的进行循环。
            }

        }


    }
}
