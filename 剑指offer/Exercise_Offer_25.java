import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2019/1/16 15:55
 * @Author: xuanyupan
 * @Desc: 二叉树中和为某一值的路径
 */
public class Exercise_Offer_25 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(root == null)
            return result;
        find(result, new ArrayList<Integer>(), root, target);
        return result;
    }

    public void find(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> currPath, TreeNode root, int target){
        currPath.add(root.val);
        if(root.left == null && root.right == null){
            if(target == root.val){
                result.add(currPath);
            }
            return;
        }
        ArrayList<Integer> path2 = new ArrayList<>();
        path2.addAll(currPath);
        if(root.left != null){
            find(result, currPath, root.left,target-root.val);
        }

        if(root.right != null){
            find(result, path2, root.right,target-root.val);
        }
    }
}